package com.cybertek.tests;

import com.github.javafaker.Faker;

public class FirstClass {


    public static void main(String[] args) {
        System.out.println("Hello World and intelij");

        Faker faker =new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().country());






    }




}
