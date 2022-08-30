package com.example.m3u8.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.DateUtils;
import com.alibaba.excel.util.MapUtils;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.m3u8.common.redis.RedisCache;
import com.example.m3u8.entity.GsInfo;
import com.example.m3u8.entity.HsInfo;
import com.example.m3u8.service.IGsInfoService;
import com.example.m3u8.service.IHsInfoService;
import lombok.extern.slf4j.Slf4j;
import net.m3u8.m3u8;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Liushaoxiong
 * @date 2022-06-16 14:19:12
 */
@Slf4j
@RestController
@RequestMapping(value = "/m3u8")
public class webController {

    @Resource
    private IHsInfoService hsInfoService;

    @Resource
    public RedisCache redisCache;

    @Resource
    public RedisTemplate redisTemplate;

    @Resource
    public IGsInfoService gsInfoService;

    /**
     * 调用下载接口
     *
     * @param hsInfos
     */
    @PostMapping(value = "/download")
    public String m3u8(@RequestBody List<HsInfo> hsInfos) throws RuntimeException {
        for (HsInfo hsInfo : hsInfos) {
            if (redisCache.getCacheObject(hsInfo.getTitle()) == null) {
                log.info("[m3u8Url:{}\tTitle:{}\tPlatform:{}]", hsInfo.getm3u8Url(), hsInfo.getTitle(), hsInfo.getPlatform());
                String filePath = new m3u8().downlandFlie(hsInfo.getm3u8Url(), hsInfo.getTitle());
                redisCache.setCacheObject(hsInfo.getTitle(), hsInfo, 1, TimeUnit.MINUTES);
                return filePath;
            } else {
                return hsInfo.getTitle() + "下载中";
            }
        }
        return null;
    }

    /**
     * 获取查询信息list
     *
     * @param title
     * @return
     */
    @GetMapping(value = "/list/{title}")
    public Object list(@PathVariable(name = "title") String title) {
        if (redisCache.getCacheObject(title) != null) {
            return redisCache.getCacheObject(title);
        }
        List<HsInfo> hsInfos = hsInfoService.list(new LambdaQueryWrapper<HsInfo>().like(HsInfo::getTitle, title));
        redisCache.setCacheObject(title, hsInfos, 30, TimeUnit.SECONDS);
        return hsInfos;
    }

    @PostMapping(value = "/JsonSaveRedis")
    public Object json2mysql(@RequestBody JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("data");
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
            String setlId = jsonObject1.getString("setlId");
            if (redisCache.getCacheObject(setlId) == null) {
                redisCache.setCacheObject(setlId, jsonObject1, 5, TimeUnit.SECONDS);
            } else {
                log.info("redis exists:{}", jsonObject1);
            }
        }
        return "success";
    }

    @GetMapping(value = "/JsonSaveRedis/clinet")
    public Object getKeys() {
        return redisTemplate.getClientList();
    }

    @GetMapping("/downloadFailedUsingJson")
    public void downloadFailedUsingJson(HttpServletResponse response, @RequestBody JSONObject jsonObject) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        try {
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding("utf-8");
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder
                    .encode("工伤" + DateUtils.format(new Date(), DateUtils.DATE_FORMAT_19), "UTF-8")
                    .replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            // 这里需要设置不关闭流
            EasyExcel.write(response.getOutputStream(), GsInfo.class)
                    .autoCloseStream(Boolean.FALSE).sheet("工伤" + DateUtils.format(new Date(), DateUtils.DATE_FORMAT_14))
                    .doWrite(json2sql(jsonObject));
        } catch (Exception e) {
            // 重置response
            response.reset();
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            Map<String, String> map = MapUtils.newHashMap();
            map.put("status", "failure");
            map.put("message", "下载文件失败" + e.getMessage());
            response.getWriter().println(JSON.toJSONString(map));
        }
    }

    public List<GsInfo> json2sql(JSONObject jsonObject) throws RuntimeException {
        List<GsInfo> gsInfos = new ArrayList<>();
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            JSONObject jsonObj = jsonObject.getJSONObject("Program").getJSONObject("info").getJSONObject("row" + i);
            if (jsonObj == null) {
                break;
            }
//            convert(jsonObj);
            GsInfo gsInfo = JSONObject.parseObject(jsonObj.toString(), GsInfo.class);
            gsInfos.add(gsInfo);
        }
        return gsInfos;
    }

    // 下划线转为驼峰
    public final static void convert(Object json) {
        if (json instanceof JSONArray) {
            JSONArray arr = (JSONArray) json;
            for (Object obj : arr) {
                convert(obj);
            }
        } else if (json instanceof JSONObject) {
            JSONObject jo = (JSONObject) json;
            Set<String> keys = jo.keySet();
            String[] array = keys.toArray(new String[keys.size()]);
            for (String key : array) {
                Object value = jo.get(key);
                String[] key_strs = key.split("_");
                if (key_strs.length > 1) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < key_strs.length; i++) {
                        String ks = key_strs[i];
                        if (!"".equals(ks)) {
                            if (i == 0) {
                                sb.append(ks);
                            } else {
                                int c = ks.charAt(0);
                                if (c >= 97 && c <= 122) {
                                    int v = c - 32;
                                    sb.append((char) v);
                                    if (ks.length() > 1) {
                                        sb.append(ks.substring(1));
                                    }
                                } else {
                                    sb.append(ks);
                                }
                            }
                        }
                    }
                    jo.remove(key);
                    jo.put(sb.toString(), value);
                }
                convert(value);
            }
        }
    }

}
