package com.nims.filter;

public class Person {
    private final String gender;
    private final String maritalStatus;
    private final Integer age;

    public Person(String gender, String maritalStatus, Integer age) {
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }


    public Integer getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", age=" + age +
                '}';
    }
}
