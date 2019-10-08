package com.akpanda.creational.factory;

public class Runner {
    public static void main(String[] args) {
        Person person1 = new PersonFactory().createPerson("akpandads");
        Person person2 = new PersonFactory().createPerson("kvothekelsier");
        System.out.println(person1);
        System.out.println(person2);
    }

}
