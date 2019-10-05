package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, Object> newMap = forum.getUserList().stream()
               .filter(forumUser -> forumUser.getPostCount() > 1)
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate() < 1999)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));
        System.out.println(newMap);

    }
}