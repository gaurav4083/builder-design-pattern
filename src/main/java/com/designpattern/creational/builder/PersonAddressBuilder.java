package com.designpattern.creational.builder;



public class PersonAddressBuilder extends PersonBuilder{
    public PersonAddressBuilder(Person person){
        this.person = person;
    }

    public PersonAddressBuilder at(String streetName){
        person.streetName = streetName;
        return this;
    }

    public PersonAddressBuilder in(String city){
        person.city = city;
        return this;
    }

    public PersonAddressBuilder withPostCode(String postCode){
        person.postCode = postCode;
        return this;
    }



}
