package com.wp.designpatterns.structural.adapter;

/**
 * @Description 船长
 * @Author wangpeng
 * @Date 2019/3/25 13:54
 */
public class Caption implements RowingBoat{

    private RowingBoat rowingBoat;

    public Caption(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    @Override
    public void row() {
        rowingBoat.row();
    }
}
