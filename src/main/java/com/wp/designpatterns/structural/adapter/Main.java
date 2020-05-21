package com.wp.designpatterns.structural.adapter;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/25 13:57
 */
public class Main {
    public static void main(String[] args) {
        Caption caption = new Caption(new FishingBoatAdapter());
        caption.row();
    }
}
