package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawningWithCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawning();
        //Then
        Assert.assertEquals("This is a circle", result);
    }
    @Test
    public void testDoDrawningWithTriangle () {
        //Given
        Tringle tringle = new Tringle();
        //When
        Drawer drawer = new Drawer(tringle);
        String result = drawer.doDrawning();
        //Then
        Assert.assertEquals("This is a tringle", result);
    }
}
