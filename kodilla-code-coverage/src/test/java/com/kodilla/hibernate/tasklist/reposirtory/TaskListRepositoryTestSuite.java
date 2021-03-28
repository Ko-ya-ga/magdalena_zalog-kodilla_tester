package com.kodilla.hibernate.tasklist.reposirtory;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.repository.TaskListRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learning Hibernate";

    @Test
    public void testFindByListName() {

        // Given
        TaskList taskList = new TaskList("To do", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        // When
        List<TaskList> checkTasks = taskListRepository.findByListName(listName);

        // Then
        Assert.assertEquals(1, checkTasks.size());

        // Clean Up
        taskListRepository.delete(checkTasks.get(0));
    }
}
