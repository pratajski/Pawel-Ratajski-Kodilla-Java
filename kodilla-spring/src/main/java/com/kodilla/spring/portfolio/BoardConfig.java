package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("task1")
    Board board;

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    @Bean
    public TaskList getTask() {
        return new TaskList();
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }


    @Bean(name = "task1")
    @Scope("prototype")
    public Board getBoardOne() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "task2")
    @Scope("prototype")
    public Board getBoardTwo() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "task3")
    @Scope("prototype")
    public Board getBoardThree() {
        return new Board(toDoList, inProgressList, doneList);
    }

}
