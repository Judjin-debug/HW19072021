package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonService implements Runnable {

    private List<Person> persons = new ArrayList<>();
    //private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private final String consonants = "bcdfghjklmnpqrstvwxyz";
    private final String vowels = "aeiou";

    public PersonService () {
        this.personsListGenerate(100, 15, 30,
                4, 12, 4, 12);
    };

    private void personsListGenerate (int amount, int lowestAge, int highestAge, int minNameLength, int maxNameLength,
                                     int minSurnameLength, int maxSurnameLength) {
        Random rand = new Random();
        Person tokenPerson;
        String tokenName;
        String tokenSurname;
        int tokenAge;
        for (int i = 0; i < amount; i++) {
            tokenAge = rand.nextInt(highestAge - lowestAge + 1) + lowestAge;
            tokenName = generateString(minNameLength, maxNameLength);
            tokenSurname = generateString(minSurnameLength, maxSurnameLength);
            tokenPerson = new Person(tokenName, tokenSurname, tokenAge);
            this.persons.add(tokenPerson);
        };
    };

    private String generateString (int lowerLimit, int upperLimit) {
        Random rand = new Random();
        int length;
        StringBuilder result = new StringBuilder();
        //char[] charAlphabet = this.alphabet.toCharArray();
        char[] charConsonants = this.consonants.toCharArray();
        char[] charVowels = this.vowels.toCharArray();
        char[][] chars = new char[2][];
        int nameStartRandomizer = rand.nextInt(2);
        chars[nameStartRandomizer % 2] = charVowels;
        chars[(nameStartRandomizer + 1) % 2] = charConsonants;
        length = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        for (int i = 0; i < length; i++) {
            //result.append(charAlphabet[rand.nextInt(charAlphabet.length)]);
            result.append(chars[i % 2][rand.nextInt(chars[i % 2].length)]);

        };
        if (result.length() > 0) {
            result.replace(0,1, String.valueOf(result.charAt(0)).toUpperCase());
        };
        return result.toString();
    };

    private void getPersons () {
        for (int i = 0; i < this.persons.size(); i++) {
            System.out.println("Person number " + String.valueOf(i + 1));
            System.out.println(this.persons.get(i).toString());
        };
    };

    public void run () {
        this.getPersons();
        ArrayList<String> result =
                (ArrayList<String>) this.persons.stream().filter(p -> (p.getAge() >= 21 && p.getAge() < 31))
                                                         .peek(p -> System.out.println(p.toString()))
                                                         .sorted(Comparator.comparing(Person::getSurname)
                                                                           .thenComparing(Person::getSurname))
                                                         .limit(4)
                                                         .map(p -> p.getSurname())
                                                         .collect(Collectors.toList());
        System.out.println(result);
    };



};
