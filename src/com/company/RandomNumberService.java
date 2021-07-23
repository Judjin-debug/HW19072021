package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomNumberService implements Runnable {

    List<Integer> randomNumbers = new ArrayList<>();

    public RandomNumberService () {
        generateRandomNumbers(100, 0, 300);
    };

    public RandomNumberService (int elements, int minValue, int maxValue) {
        generateRandomNumbers(elements, minValue, maxValue);
    };

    private synchronized void generateRandomNumbers(int elements, int minValue, int maxValue) {
        Random rand = new Random();
        for (int i = 0; i < elements; i++) {
            randomNumbers.add(rand.nextInt(maxValue - minValue + 1) - minValue);
        };
    };

    @Override
    public void run() {
        System.out.println("Displaying original numbers: ");
        System.out.println(this.randomNumbers);
        boolean flag = this.randomNumbers.stream().anyMatch(e -> (e % 3 == 0 && e % 5 == 0));
        if (flag) {
            System.out.println("Collection has a number that both 3 and 5 divide");
        } else {
            System.out.println("Collection doesn't have a number that both 3 and 5 divide");
        };
    };
}
