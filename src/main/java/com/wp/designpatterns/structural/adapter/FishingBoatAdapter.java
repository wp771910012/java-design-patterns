package com.wp.designpatterns.structural.adapter;

/**
 * @Description 渔船适配器
 * @Author wangpeng
 * @Date 2019/3/25 13:56
 */
public class FishingBoatAdapter implements RowingBoat{

    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
