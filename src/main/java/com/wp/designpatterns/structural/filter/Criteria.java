package com.wp.designpatterns.structural.filter;

import java.util.List;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/3 9:46
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
