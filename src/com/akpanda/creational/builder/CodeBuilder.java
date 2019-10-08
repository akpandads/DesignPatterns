package com.akpanda.creational.builder;

public class CodeBuilder
{
    private  Class theClass = new Class();

    public CodeBuilder(String className)
    {
        theClass.name=className;
    }

    public CodeBuilder addField(String name, String type)
    {
        theClass.fields.add(new Field(name,type));
        return this;
    }

    @Override
    public String toString()
    {
        return theClass.toString();
    }
}