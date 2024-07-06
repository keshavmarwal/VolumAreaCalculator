package com.example.volumareacalculator;

public class Shape {

    int img;
    String text;

    public Shape(int img , String text){
        this.img = img;
        this.text= text;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
