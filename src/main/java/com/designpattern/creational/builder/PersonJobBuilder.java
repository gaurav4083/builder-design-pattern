package com.designpattern.creational.builder;

public class PersonJobBuilder extends PersonBuilder{
    public PersonJobBuilder(Person person){
        this.person = person;
    }

    public PersonJobBuilder at(String company){
        person.company = company;
        return this;
    }

    public PersonJobBuilder as(String designation){
        person.designation = designation;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome){
        person.annualIncome = annualIncome;
        return this;
    }
}
