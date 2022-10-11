package com.SEPTChallenge2.Person.model;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Persons {


    private List<Person> perList;

    public List<Person> getperList() {
        if(perList == null) {
            perList = new ArrayList<>();
        }
        return perList;

    }

    public void setperList(List<Person> perList) {
        this.perList = perList;
    }
}

