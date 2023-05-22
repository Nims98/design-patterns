package com.nims.interpreter;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("male",17);
        Expression genderExpression = new GenderExpression("male");
        Expression ageExpression = new AgeExpression(18);

        boolean isMaleAndOlderThan18 = genderExpression.interpret(person) && ageExpression.interpret(person);
        String result = isMaleAndOlderThan18 ? "person is older than 18 and male":"person do not fit in to given criteria";
        System.out.println(result);
    }
}
