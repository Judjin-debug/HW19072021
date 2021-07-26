package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Month;

public class Ex70 {

    public static void main(String[] args) {
        Man man = new Man("Joe", "Junior", LocalDate.of(1993, Month.DECEMBER, 13), 174, 60, BloodType.AB);
        System.out.println(man.toString());
        String classInfo = BuildClassInfo.buildClassInfo();
        System.out.println(classInfo);
    };





}
