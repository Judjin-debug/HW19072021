package com.company;

import java.util.Scanner;

public class PersonBuilder extends AbstractPersonBuilder {

    private PersonBuilder () {

    };

    public static PersonBuilder instance;

    public static PersonBuilder personBuilderInstance () {
        if  (instance == null) {
            instance = new PersonBuilder();
        }
        return instance;
    };

    public void getPersons () {
        for (int i = 0; i < this.persons.size(); i++) {
            System.out.println("Person number " + String.valueOf(i + 1));
            System.out.println(this.persons.get(i).toString());
        };
    };

    public void personInit () throws IllegalArgumentException {
        Person person;
        Scanner scan = new Scanner(System.in);
        String option;
        String name;
        String surname;
        int age;
        int count = 0;
        while (true) {
            System.out.println("Add a person? [Y/n]");
            option = scan.next();
            if ("y".equals(option.toLowerCase())) {
                count = 0;
                System.out.println("Write a name: ");
                name = scan.next();
                System.out.println("Write a surname: ");
                surname = scan.next();
                System.out.println("Write an age: ");
                age = (int) Integer.parseInt(scan.next());
                person = new Person(name, surname, age);
                this.persons.add(person);
                System.out.println("Person added");
            } else if ("n".equals(option.toLowerCase())) {
                System.out.println("Finished initializing");
                break;
            } else {
                count++;
            }
            if (count == 3) break;
        };
    };


}
