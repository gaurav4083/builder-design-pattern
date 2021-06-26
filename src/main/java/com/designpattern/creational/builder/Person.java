package com.designpattern.creational.builder;

public class Person {
    //PersonAddressBuilder
    public String streetName;
    public String city;
    public String postCode;

    //PersonJobBuilder
    public String company;
    public String designation;
    public int annualIncome;

    @Override
    public String toString(){
        return "Person{streetName:"+streetName+", city:"+city+", postCode:"+postCode+", company:"+company+", designation:"+designation+", annualIncome:"+annualIncome+"}";
    }

}
