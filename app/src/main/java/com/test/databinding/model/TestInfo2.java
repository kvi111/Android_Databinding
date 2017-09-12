package com.test.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;


public class TestInfo2 extends BaseObservable {
    private String title = "";
    private String info = "";
    private int image = 0;

    public TestInfo2(String title, String info, int image) {
        this.title = title;
        this.info = info;
        this.image = image;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(com.test.databinding.BR.title);
    }

    @Bindable
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
        notifyPropertyChanged(com.test.databinding.BR.info);
    }

    @Bindable
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
        notifyPropertyChanged(com.test.databinding.BR.image);
    }


    public void click1(View view) {
        Toast.makeText(view.getContext(), getTitle(), Toast.LENGTH_SHORT).show();
    }
}
