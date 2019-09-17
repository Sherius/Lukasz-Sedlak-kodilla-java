package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calclulator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test ok");
        } else {
            System.out.println("Error");
        }
        ;
        Calclulator calclulator = new Calclulator();
        int calcAdd = calclulator.add(50, 75);

        if (calcAdd < 50) {
            System.out.println("test add ok");
        } else {
            System.out.println("test add Error");
        }
        int calcSubstract = calclulator.substract(25, 18);
        if (calcSubstract < 0) {
            System.out.println("test substract ok");
            } else{
                System.out.println("Error substract test");
            }


        }
    }

