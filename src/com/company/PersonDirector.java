package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonDirector implements Runnable {

    private PersonDirector () {

    };

    public static PersonDirector instance;

    public static PersonDirector personDirectorInstance () {
        if  (instance == null) {
            instance = new PersonDirector();
        }
        return instance;
    };

    private PersonBuilder personBuilder = PersonBuilder.personBuilderInstance();

    public void run() throws IllegalArgumentException {
        personBuilder.personInit();
        personBuilder.getPersons();
    };

}
