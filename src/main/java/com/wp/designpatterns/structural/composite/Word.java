package com.wp.designpatterns.structural.composite;

import java.util.List;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/4 9:39
 */
public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }
    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
