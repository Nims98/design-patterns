package com.nims.filter;

import java.util.List;

public class MaritalStatusFilter implements Criteria{
    @Override
    public List<Person> filtered(List<Person> persons) {
        return persons.stream().filter(person -> person.getMaritalStatus().equalsIgnoreCase("single")).toList();
    }
}
