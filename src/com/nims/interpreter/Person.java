package com.nims.interpreter;

public class Person {
    private final String gender;
    private final Integer age;

    public Person(String gender, Integer age) {
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }
}
