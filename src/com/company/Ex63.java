package com.company;

public class Ex63 {

    public static void main(String[] args) {

        try {

            Thread thread = new Thread(new RandomNumberService(10, 0, 30));
            thread.start();
            thread.join();

            Thread thread2 = new Thread(new RandomNumberService());
            thread2.start();
            thread2.join();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }


    };

}
