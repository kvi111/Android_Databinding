package com.test.databinding.model;

public class TestInfo {
    private String title ="";
    private String info ="";
    private Integer image = 0;

    public TestInfo(String title,String info,Integer image){
        this.title = title;
        this.info = info;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
