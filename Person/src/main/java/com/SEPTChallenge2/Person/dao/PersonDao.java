package com.SEPTChallenge2.Person.dao;

import com.SEPTChallenge2.Person.model.Person;
import com.SEPTChallenge2.Person.model.Persons;
import org.springframework.stereotype.Repository;

public class PersonDao {
    private static Persons list = new Persons();
    static{
        list.getperList().add(new Person(1,"Joe","16 Main St", "3030", "57","Engineer","J@mail.com","123456789"));
    }

    public Persons getAllPersons(){
        return list;
    }
}
