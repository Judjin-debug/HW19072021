package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            // Singleton
            MySingle ms = MySingle.getInstance();
            Thread th = new Thread(ms);
            th.start();
            th.join();

            //Ex68
            try {
                Scanner scan = new Scanner(System.in);
                PersonDirector personDirector = PersonDirector.personDirectorInstance();
                Thread th2 = new Thread(personDirector);
                th2.start();
                th2.join();
                scan.close();
            } catch (IllegalArgumentException iex) {
                iex.printStackTrace();
            }

            

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
