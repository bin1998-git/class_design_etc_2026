package com.tenco.single;

public class Person {

    private static Person instance;

    private Person() {}

    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }

}
