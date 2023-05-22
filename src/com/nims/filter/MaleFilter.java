package com.nims.filter;

import java.util.List;

public class MaleFilter implements Criteria{
    @Override
    public List<Person> filtered(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equalsIgnoreCase("male")).toList();
    }
}
