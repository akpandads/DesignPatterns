package com.akpanda.structural.proxy;

public class Runner {
    public static void main(String[] args) {
        ResponsiblePerson responsiblePerson = new ResponsiblePerson(new Person(19));
        System.out.println(responsiblePerson.drink());
        System.out.println(responsiblePerson.drive());
        System.out.println(responsiblePerson.drinkAndDrive());
    }
}
