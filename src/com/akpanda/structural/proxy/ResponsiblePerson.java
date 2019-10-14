package com.akpanda.structural.proxy;

class ResponsiblePerson
{
    private Person person;

    public ResponsiblePerson(Person person)
    {
        this.person = person;
    }
    public String drink(){
        if(person.getAge()>18)
            return person.drink();
        else
            return "Too Young";
    }

    public String drive(){
        if(person.getAge() >16)
            return person.drive();
        else
            return "Too Young";
    }

    public String drinkAndDrive(){
        return "Not good";
    }
}