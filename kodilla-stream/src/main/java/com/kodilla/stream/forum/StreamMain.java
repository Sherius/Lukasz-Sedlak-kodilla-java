package com.kodilla.stream.forum;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

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