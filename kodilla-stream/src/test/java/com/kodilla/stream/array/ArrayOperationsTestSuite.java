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
        Random random = new Random();
        int randomNum = random.nextInt(100);
        int[] numbers = new int[20];
        double randomDouble = 0;
        for (int i=0; i<numbers.length; i++){
            numbers[i] = i+randomNum;
            randomDouble += numbers[i];
        }
        //When
        randomDouble = randomDouble/numbers.length;
        //Then
        Assert.assertEquals(randomDouble, ArrayOperations.getAverage(numbers), 0.01);
    }
}
