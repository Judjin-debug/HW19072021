package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex71 {

    public static void main (String [] args) {
        methodCall();
    };

    public static void methodCall () {
        try {
            PrintHelloWorld printHelloWorld = new PrintHelloWorld();
            Class phClassObject = PrintHelloWorld.class;
            Method method = phClassObject.getMethod("printHelloWorld", null);
            method.invoke(printHelloWorld);
        } catch (NoSuchMethodException nsme) {
            nsme.printStackTrace();
        } catch (IllegalAccessException iae) {
            iae.printStackTrace();
        } catch (InvocationTargetException ite) {
            ite.printStackTrace();
        };
    };



}
