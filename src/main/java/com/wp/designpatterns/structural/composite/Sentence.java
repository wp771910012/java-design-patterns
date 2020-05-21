package com.wp.designpatterns.structural.composite;

import java.util.List;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/4 9:40
 */
public class Sentence extends LetterComposite{
    public Sentence(List<Word> words) {
        for (Word w : words) {
            this.add(w);
        }
    }
    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
