package com.nims.interpreter;

public class GenderExpression implements Expression{
    private final String gender;

    public GenderExpression(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean interpret(Person person) {
        return person.getGender().equalsIgnoreCase(gender);
    }
}
