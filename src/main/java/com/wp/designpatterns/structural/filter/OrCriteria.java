package com.wp.designpatterns.structural.filter;

import java.util.List;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/3 9:55
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> people = criteria.meetCriteria(persons);
        List<Person> otherPeople = otherCriteria.meetCriteria(persons);

        otherPeople.forEach(person -> {
            if(!people.contains(person)){
                people.add(person);
            }
        });
        return people;
    }
}
