package com.wp.designpatterns.structural.filter;

import java.util.List;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/3 9:53
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
    }
}
