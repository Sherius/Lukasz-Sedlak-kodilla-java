package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(Math.PI * Math.pow(4.5,2.0), circle.getArea(), 0);
    }
    @Test
    public void testFactorySquere() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape squere = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assert.assertEquals(28.0, squere.getCircumference(), 0);
    }
    @Test
    public void testFactoryRectangle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.REACTANGLE);
        //Then
        Assert.assertEquals(37.50, rectangle.getArea(), 0);
        Assert.assertEquals("The long Rectangle", rectangle.getName());
    }

}
