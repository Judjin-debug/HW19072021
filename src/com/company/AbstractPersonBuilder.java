package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractPersonBuilder {

    List<Person> persons = new ArrayList<>();

    public abstract void personInit();
    public abstract void getPersons();

}
