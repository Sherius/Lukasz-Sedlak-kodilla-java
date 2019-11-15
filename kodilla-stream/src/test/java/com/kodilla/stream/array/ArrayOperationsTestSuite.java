package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class ArrayOperationsTestSuite {

    @Test
    public void testArrayOperations(){
        //Given
        int values[] = {10,20,39,40,20,25,32,32,54,68,84,98,13,14,15,16,17,18,19,20};
        double acceptedAvg = 32.7;
        //When
        double result = ArrayOperations.getAverage(values);
        //Then
        Assert.assertEquals(acceptedAvg, result, 0.01);
    }
}
