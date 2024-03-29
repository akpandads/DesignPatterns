package com.akpanda.creational.factory;

class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person { id : "+id+" name : "+name+"}";
    }
}