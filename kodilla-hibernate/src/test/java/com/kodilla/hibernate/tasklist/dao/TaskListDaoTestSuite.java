package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;
    private static final String LISTNAMES = "LIST";


    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAMES, "dziala?");
        taskListDao.save(taskList);
        //When
        List<TaskList> taskListsName = taskListDao.findByListName(LISTNAMES);

        //Then
        Assert.assertEquals(LISTNAMES, taskListsName.get(0).getListName());

        //CleanUp
        taskListDao.delete(taskList);
    }
    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList1 = new TaskList(LISTNAMES, "ToDo tasks");
        taskList1.getTasks().add(task);
        taskList1.getTasks().add(task2);
        task.setTaskList(taskList1);
        task2.setTaskList(taskList1);

        //When
        taskListDao.save(taskList1);
        int id = taskList1.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
