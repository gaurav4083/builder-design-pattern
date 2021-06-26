package com.designpattern.creational.builder;

public class PersonBuilder {
    protected  Person person = new Person();
    //PersonAddressBuilder
    public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }
    //PersonJobBuilder
    public PersonJobBuilder works(){
        return new PersonJobBuilder(person);
    }
    public Person build(){
        return person;
    }
}
