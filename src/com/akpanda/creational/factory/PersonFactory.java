package com.akpanda.creational.factory;

public class PersonFactory {
    static int personCount=0;
    public Person createPerson(String name)
    {
        return new Person(personCount++,name);
    }
}
