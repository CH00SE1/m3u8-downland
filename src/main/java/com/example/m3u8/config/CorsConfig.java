package com.example.m3u8.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置
 * @author xiongshao
 * @date 2022-07-25 15:22:41
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //允许跨域访问的路径
        registry.addMapping("/**")
                //允许跨域访问的源
                .allowedOrigins("*")
                //允许的请求方法
                .allowedMethods("POST", "GET", "PUT", "DELETE", "OPTIONS")
                //预检间隔时间
                .maxAge(16800)
                //允许头部设置
                .allowedHeaders("*")
                //是否发送cookie
                .allowCredentials(false);
    }

}