package com.kodilla.spring.intro.shape;

public class Tringle implements Shape {
    @Override
    public String draw() {
        System.out.println("This is tringle");
        return "This is a tringle";
    }
}
