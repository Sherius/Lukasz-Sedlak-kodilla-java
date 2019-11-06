package com.kodilla.testing.forum.statistics;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateAdvStatisticsTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testPostCountZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statistics);
        calculateAdvStatistics.showStatistics();
        //When
        double result = 0;
        double testValue = 0;
        testValue = calculateAdvStatistics.averageCommentsPerPosts;
        //Then
        Assert.assertEquals(testValue, result, 0.001);

    }
    @Test
    public void testPostCountThousand() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statistics);
        calculateAdvStatistics.showStatistics();
        //When
        double testValue=0;
        double result=0;
        testValue = calculateAdvStatistics.averagePostPerUser;
        if(calculateAdvStatistics.getUserPosts()!=0)
            result = calculateAdvStatistics.getUserCount()/calculateAdvStatistics.getUserPosts();
        //Then
        Assert.assertEquals(testValue, result, 0.001);
    }
    @Test
    public void  testCommentsCountZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statistics);
        calculateAdvStatistics.showStatistics();
        //When
        double testValue = 0;
        double result = 0;
        testValue = calculateAdvStatistics.averageCommentsPerPosts;
        //Then
        Assert.assertEquals(testValue, 0, 0.001);

    }
    @Test
    public void testCommentsIsLessThenPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(50);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statistics);
        calculateAdvStatistics.showStatistics();
        //When
        double testValue = 0;
        double result = 0;
        testValue = calculateAdvStatistics.averageCommentsPerPosts;
        if (calculateAdvStatistics.getUserPosts()!=0)
            result = calculateAdvStatistics.getUserComments()/calculateAdvStatistics.getUserPosts();
        //Then
        Assert.assertEquals(testValue, result, 0.001);
    }
    @Test
    public void testCommentsIsMoreThenPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(100);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statistics);
        calculateAdvStatistics.showStatistics();
        //When
        double testValue = 0;
        double result = 0;
        testValue = calculateAdvStatistics.averageCommentsPerPosts;
        result = calculateAdvStatistics.getUserComments()/calculateAdvStatistics.getUserPosts();
        //Then
        Assert.assertEquals(testValue, result, 0.001);
    }
    @Test
    public void testUsersIsZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statistics);
        calculateAdvStatistics.showStatistics();
        //When
        double testValue = calculateAdvStatistics.averageCommentsPerUser;
        //Then
        Assert.assertEquals(testValue, 0, 0.001);
    }
    @Test
    public void testUserIsHoundred() {
        //Given
        List<String> userList = new ArrayList<>();
        while (userList.size()!=100) {
            userList.add("Names");
        }
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(userList);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statistics);
        calculateAdvStatistics.showStatistics();
        //When
        double testValue = calculateAdvStatistics.averagePostPerUser;
        //Then
        Assert.assertEquals(testValue, 0, 0.001);
    }


}
