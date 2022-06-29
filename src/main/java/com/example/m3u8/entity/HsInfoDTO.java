package com.example.m3u8.entity;

/**
 * @author xiongshao
 * @date 2022-06-29 11:12:00
 */
public class HsInfoDTO {

    private String title;

    private String m3u8_url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getM3u8_url() {
        return m3u8_url;
    }

    public void setM3u8_url(String m3u8_url) {
        this.m3u8_url = m3u8_url;
    }

    @Override
    public String toString() {
        return "HsInfoDTO{" +
                "title='" + title + '\'' +
                ", m3u8_url='" + m3u8_url + '\'' +
                '}';
    }
}
