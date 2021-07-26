package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BuildClassInfo {

    private BuildClassInfo () {

    };

    public synchronized static <T> String buildClassInfo () {
        StringBuilder info = new StringBuilder();
        Class manClassObject = Man.class;
        Field[] fields = manClassObject.getFields();
        Method[] methods = manClassObject.getMethods();
        Class<?>[] parameterTypes;
        for (Method method : methods) {
            info.append("Method: " + method.getName()+"\n");
            info.append("Parameters: "+"\n");
            parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                info.append(parameterTypes[i]+"\n");
            }
            info.append("Return type: " + method.getReturnType()+"\n");
        };
        for (int i = 0; i < fields.length; i++) {
            info.append("Field: " + fields[i].getName()+"\n");
        };
        return info.toString();
    };

}
