package ru.yandex.practicum.catsgram.model;

import lombok.ToString;

@ToString
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;

    public Person(String firstName, String lastName, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }
}

public class Practicum {
    public static void main(String[] args) {
        Person roman = new Person("Roman", "Igorev", 38, "+78889991234");
        System.out.println(roman);
    }
}