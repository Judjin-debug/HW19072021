package com.company;

public class MySingle implements Runnable {

    private MySingle () {

    };

    private static MySingle instance;

    public static synchronized MySingle getInstance() {
        if (instance == null) {
            instance = new MySingle();
        }
        return instance;
    };

    public synchronized void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world " + String.valueOf(i+1));
        };
    };

}
