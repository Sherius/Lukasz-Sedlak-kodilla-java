package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Task nr 1");
        board.getInProgressList().getTasks().add("Task nr 2");
        board.getDoneList().getTasks().add("Task nr 3");
        //Then
        Assert.assertEquals("[Task nr 1]", board.getToDoList().getTasks().toString());
        Assert.assertEquals("[Task nr 2]", board.getInProgressList().getTasks().toString());
        Assert.assertEquals("[Task nr 3]", board.getDoneList().getTasks().toString());

    }
}
