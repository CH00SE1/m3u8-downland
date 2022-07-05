package com.example.m3u8.controller;

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
    public List<HsInfo> list(@PathVariable(name = "title") String title) {
        return hsInfoService.list(
                new LambdaQueryWrapper<HsInfo>().like(HsInfo::getTitle, title)
                        .orderByDesc(HsInfo::getCreatedAt)
        );
    }

}
