package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(1, "List",  "FirstList");
        taskListDao.save(taskList);
        int duration = taskList.getId();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName("Lee");

        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.delete(taskList);
    }
}
