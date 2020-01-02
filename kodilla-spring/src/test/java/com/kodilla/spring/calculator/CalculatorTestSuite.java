package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculatorAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(20.0, 14.2);
        //Then
        Assert.assertEquals(34.2, result, 0.01);
    }

    @Test
    public void testCalculatorSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(19.2, 13.0);
        //Then
        Assert.assertEquals(6.2, result, 0.01);
    }

    @Test
    public void testCalculatormMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(14.2, 7.9);
        //Then
        Assert.assertEquals(112.18, result, 0.01);
    }

    @Test
    public void testCalculatorDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(20.0, 2.0);
        //Then
        Assert.assertEquals(10, result, 0.01);
    }
}
