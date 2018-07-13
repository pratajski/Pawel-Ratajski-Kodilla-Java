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

    @Bean
    public TaskList getTask() {
        return new TaskList();
    }

    @Bean(name = "task1")
    @Scope("prototype")
    public Board getBoardOne() {
        return new Board();
    }

    @Bean(name = "task2")
    @Scope("prototype")
    public Board getBoardTwo() {
        return new Board();
    }

    @Bean(name = "task3")
    @Scope("prototype")
    public Board getBoardThree() {
        return new Board();
    }


}
