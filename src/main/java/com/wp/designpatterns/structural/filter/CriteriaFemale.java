package com.wp.designpatterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/3 9:47
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());
    }
}
