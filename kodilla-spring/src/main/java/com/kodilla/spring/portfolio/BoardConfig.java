package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Bean
    public Board board() {
        return new Board(getListToDo(), getListInProgress(), getListDone());
    }

    @Bean
    public TaskList getListToDo() {
        return new TaskList();
    }

    @Bean
    public TaskList getListInProgress() {
        return new TaskList();
    }

    @Bean
    public TaskList getListDone() {
        return new TaskList();
    }


}
