package com.nims.filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Person> personList = new ArrayList<>();

    Person person1 = new Person("male","married",30);
    Person person2 = new Person("female","married",30);
    Person person3 = new Person("female","SINGLE",30);
    Person person4 = new Person("male","single",20);

    personList.add(person1);
    personList.add(person2);
    personList.add(person3);
    personList.add(person4);

    Criteria male = new MaleFilter();
    Criteria single = new MaritalStatusFilter();

        System.out.println(male.filtered(personList).toString());
        System.out.println(single.filtered(personList).toString());
    }

}
