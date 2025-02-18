package com.example.jogodamemria;

import android.widget.TextView;

public class Carta {
    private String tag;
    private int img;
    private TextView text;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public TextView getText() {return text;}

    public void setText(TextView text) {this.text = text;}
}
