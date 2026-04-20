package com.tenco.single;

public class Main {
    public static void main(String[] args) {

        // 우리 프로젝트 내에서 SingleTon 객체를 Heap 메모리에 올려 보자.
        // 생성자를 막아놔서 호출 못함
        // SingleTon singleTon = new SingleTon();


        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();

        System.out.println("1. " + singleTon1);
        System.out.println("1. " + singleTon2);

        if (singleTon1 == singleTon2) {
            System.out.println("같은 객체가 맞습니다");
        }

        if (person1 == person2) {
            System.out.println("같은 객체 입니다");
        }


    }
}
