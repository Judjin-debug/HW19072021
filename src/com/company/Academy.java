package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Academy {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface AcademyInfo {
        int year();
    };

    public void helloWorld () {
        System.out.println("Hello World");
    };

    @AcademyInfo(year = 1970)
    public void annotatedHelloWorld () {
        System.out.println("Hello World");
    };

}
