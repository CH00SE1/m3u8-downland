package com.example.m3u8.controller;

import com.example.m3u8.config.NonStaticResourceHttpRequestHandler;
import net.m3u8.utils.StringUtils;
import net.m3u8.utils.m3u8Utils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Liushaoxiong
 * @date 2022-06-16 14:19:12
 */
@RestController
@RequestMapping(value = "/info")
public class webController {

    private final Logger log = LoggerFactory.getLogger(webController.class);

    @Resource
    private NonStaticResourceHttpRequestHandler nonStaticResourceHttpRequestHandler;

    @PostMapping(value = "/m3u8")
    public Object m3u8(@RequestParam Map<String, String> params) {
        log.info("params:{}", params);
        m3u8Utils m3u8Utils = new m3u8Utils();
        String filePath = m3u8Utils.downland(params.get("url"), params.get("fileName"));
        params.put("msg", filePath);
        return params;
    }

    @GetMapping(value = "/get/video/address", produces = "application/json;charset=utf-8")
    public List<Map<String, String>> getVideoAddress() {
        File file = new File("D:\\abc_video");
        List<Map<String, String>> fileNs = new ArrayList<Map<String, String>>();
        String filename = "";
        File[] subFile = file.listFiles();
        for (File value : subFile) {
            // 判断是否为文件夹
            if (!value.isDirectory()) {
                Map<String, String> jsonVideos = new HashMap<>();
                String subFileName = value.getName();
                // 判断是否为mp4结尾
                if (subFileName.trim().toLowerCase().endsWith(".mp4")) {
                    filename = "http://localhost:8080/video/alone/video/play" + subFileName;
                    // subFileName.substring(0, subFileName.lastIndexOf("."))
                    jsonVideos.put("filename", subFileName);
                    jsonVideos.put("address", filename);
                    fileNs.add(jsonVideos);
                }
            }
        }
        return fileNs;
    }

    @GetMapping(value = "/alone/video/play/{filename}", produces = "application/json;charset=utf-8")
    public void aloneVideoPlay(HttpServletRequest request, @PathVariable("filename") String fileName, HttpServletResponse response) {
        InputStream is = null;
        OutputStream os = null;
        try {
            response.setContentType("video/mp4");
            File file = new File("D:\\abc_video\\" + fileName);
            response.addHeader("Content-Length", "" + file.length());
            is = new FileInputStream(file);
            os = response.getOutputStream();
            IOUtils.copy(is, os);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @GetMapping(value = "/alone/video/play2/{filename}", produces = "application/json;charset=utf-8")
    public void videoPreview(HttpServletRequest request, HttpServletResponse response, @PathVariable("filename") String fileName) throws Exception {

        //假如我把视频1.mp4放在了static下的video文件夹里面
        //sourcePath 是获取resources文件夹的绝对地址
        //realPath 即是视频所在的磁盘地址
        String realPath = "D:\\abc_video\\" + fileName;

        Path filePath = Paths.get(realPath);
        if (Files.exists(filePath)) {
            String mimeType = Files.probeContentType(filePath);
            if (!StringUtils.isEmpty(mimeType)) {
                response.setContentType(mimeType);
            }
            request.setAttribute(NonStaticResourceHttpRequestHandler.ATTR_FILE, filePath);
            nonStaticResourceHttpRequestHandler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }


}
