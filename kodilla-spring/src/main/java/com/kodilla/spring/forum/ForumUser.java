package com.kodilla.spring.forum;

import com.kodilla.spring.SpringRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;
    public ForumUser() {
        username = "John Smith";
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRunner.class, args);
    }


}
