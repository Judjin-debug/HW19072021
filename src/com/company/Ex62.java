package com.company;

public class Ex62 {

    public static void main(String[] args) {

        Thread thread = new Thread(new PersonService());
        thread.start();

    };


}
