package com.wp.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/4 9:35
 */
public abstract class LetterComposite {
    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}
