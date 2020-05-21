package com.wp.designpatterns.creational.prototype;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/21 9:55
 */
public class Sheep implements Cloneable{
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return new Sheep(this.name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep original = new Sheep("jolly");
        System.out.println(original.name);

        Sheep cloned = original.clone();
        cloned.setName("dolly");
        System.out.println(cloned.name);
    }
}
