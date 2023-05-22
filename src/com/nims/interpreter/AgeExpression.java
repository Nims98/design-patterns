package com.nims.interpreter;

public class AgeExpression implements Expression {
    private final Integer age;

    public AgeExpression(Integer age) {
        this.age = age;
    }

    @Override
    public boolean interpret(Person person) {
        return person.getAge() > age;
    }
}
