package com.akpanda.creational.builder;

public class Field {
    public String type,name;

    public Field(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("public %s %s",this.type,this.name);
    }
}
