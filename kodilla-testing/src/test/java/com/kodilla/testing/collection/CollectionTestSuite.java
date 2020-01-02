package com.kodilla.testing.collection;

import com.kodilla.testing.collection.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import com.kodilla.testing.collection.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        //then
        Assert.assertEquals(0, result.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(17);
        list.add(15);
        list.add(45);
        list.add(78);
        list.add(61);
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(78);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        //then
        Assert.assertEquals(oddNumbers, result);
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }


}
