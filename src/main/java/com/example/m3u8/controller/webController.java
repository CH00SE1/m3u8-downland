package com.example.m3u8.controller;

import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.m3u8.entity.HsInfo;
import com.example.m3u8.entity.HsInfoDTO;
import com.example.m3u8.service.IHsInfoService;
import net.m3u8.utils.m3u8Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Liushaoxiong
 * @date 2022-06-16 14:19:12
 */
@RestController
@RequestMapping(value = "/info")
public class webController {

    private final Logger log = LoggerFactory.getLogger(webController.class);

    @Resource
    private IHsInfoService hsInfoService;

    /**
     * 调用下载接口
     *
     * @param jsonObeject
     * @return
     */
    @PostMapping(value = "/m3u8/download")
    public Object m3u8(@RequestBody JSONObject jsonObeject) {
        log.info("{}", jsonObeject);
        m3u8Utils m3u8Utils = new m3u8Utils();
        String filePath = m3u8Utils.downland(jsonObeject.getString("m3u8_url"), jsonObeject.getString("title"));
        return jsonObeject.toString().concat(filePath);
    }

    /**
     * 获取查询信息list
     *
     * @param title
     * @return
     */
    @PostMapping(value = "/m3u8/list/{title}")
    public Object list(@PathVariable(name = "title") String title) {
        List<HsInfo> hsInfos = hsInfoService.list(new LambdaQueryWrapper<HsInfo>().like(HsInfo::getTitle, title));
        List<HsInfoDTO> hsInfoDTOs = new ArrayList<>();
        for (HsInfo hsInfo : hsInfos) {
            HsInfoDTO hsInfoDTO = new HsInfoDTO();
            hsInfoDTO.setTitle(hsInfo.getTitle());
            hsInfoDTO.setM3u8_url(hsInfo.getm3u8Url());
            hsInfoDTOs.add(hsInfoDTO);
        }
        return hsInfoDTOs;
    }

}
