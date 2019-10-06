package com.kodilla.testing.statistics;

import com.sun.org.glassfish.external.statistics.Statistic;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.configuration.IMockitoConfiguration;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatistics {
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
        //given
        CalculateAdvStatistic calculateAdvStatistic = mock(CalculateAdvStatistic.class);


        //when

        //then
    }
}
