package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Ex72 {

    public static void main (String [] args) {
        checkClassMethodsAnnotations();
    };

    public static void checkClassMethodsAnnotations () {
        Class academyClassObject = Academy.class;
        Method[] methods = academyClassObject.getMethods();
        Annotation[] annotations;
        for (Method method : methods) {
            System.out.println("\nMethod : " + method.getName());
            annotations = method.getAnnotations();
            System.out.println("Annotations: ");
            for (int i = 0; i < annotations.length; i++) {
                System.out.println(annotations[i]);
            }
        }
    }

}
