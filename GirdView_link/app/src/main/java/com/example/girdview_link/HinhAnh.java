package com.example.girdview_link;

public class HinhAnh {
    private String url;
    private int hinhAnh;


    public HinhAnh(String url, int hinhAnh) {
        this.url = url;
        this.hinhAnh = hinhAnh;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
