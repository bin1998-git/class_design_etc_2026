package com.tenco.build;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.
                Builder("길동").
                age(10)
                .build();




        Student student2 = new Student.
                Builder("이순선")
                .age(100)
                .build();

        Cat cat1 = new Cat.Builder()
                .name("야옹")
                .build();

        System.out.println(cat1.getName());
    }
}
