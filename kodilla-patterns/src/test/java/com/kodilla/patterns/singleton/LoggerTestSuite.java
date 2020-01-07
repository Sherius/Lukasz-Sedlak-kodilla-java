package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void setLogger() {
        Logger.getInstance().log("Log nr 1");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String logName = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log nr 1", logName);


    }
}
