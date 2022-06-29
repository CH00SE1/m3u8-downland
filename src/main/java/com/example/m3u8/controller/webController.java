package com.example.m3u8.controller;

import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.m3u8.entity.HsInfo;
import com.example.m3u8.service.IHsInfoService;
import lombok.extern.slf4j.Slf4j;
import net.m3u8.m3u8;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 调用下载接口
     *
     * @param jsonObeject
     * @return
     */
    @PostMapping(value = "/download")
    public Object m3u8(@RequestBody JSONObject jsonObeject) {
        log.info("{}", jsonObeject);
        String filePath = new m3u8().downlandFlie(jsonObeject.getString("m3u8Url"), jsonObeject.getString("title"));
        return "filePath".concat(filePath);
    }

    /**
     * 获取查询信息list
     *
     * @param title
     * @return
     */
    @PostMapping(value = "/list/{title}")
    public List<HsInfo> list(@PathVariable(name = "title") String title) {
        return hsInfoService.list(
                new LambdaQueryWrapper<HsInfo>().like(HsInfo::getTitle, title).
                        orderByDesc(HsInfo::getCreatedAt)
        );
    }
}
