package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex66 {

    public static void main(String[] args) {

        LocalDate localDate =  LocalDate.now().minusDays(60);
        System.out.println("The date 60 days ago is " + localDate.format(DateTimeFormatter.ISO_DATE));

    }

}
