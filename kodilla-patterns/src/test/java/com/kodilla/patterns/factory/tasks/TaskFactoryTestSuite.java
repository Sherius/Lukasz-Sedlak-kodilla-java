package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
    }
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Deliver", drivingTask.getTaskName());
    }
}
