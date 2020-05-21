package com.wp.designpatterns.structural.composite;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/4 9:38
 */
public class Letter extends LetterComposite {

    private char c;
    public Letter(char c) {
        this.c = c;
    }
    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }
}
