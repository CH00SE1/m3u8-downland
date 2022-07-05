package com.example.m3u8.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.m3u8.common.redis.RedisCache;
import com.example.m3u8.entity.HsInfo;
import com.example.m3u8.service.IHsInfoService;
import lombok.extern.slf4j.Slf4j;
import net.m3u8.m3u8;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
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

    /**
     * 调用下载接口
     *
     * @param hsInfos
     */
    @PostMapping(value = "/download")
    public void m3u8(@RequestBody List<HsInfo> hsInfos) throws RuntimeException {
        for (HsInfo hsInfo : hsInfos) {
            log.info("getInfo:{}-{}", hsInfo.getm3u8Url(), hsInfo.getTitle());
            String filePath = new m3u8().downlandFlie(hsInfo.getm3u8Url(), hsInfo.getTitle());
            log.info("filePath:{}", filePath);
        }
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
        redisCache.setCacheObject(title, hsInfos, 10, TimeUnit.SECONDS);
        return hsInfos;
    }

}
