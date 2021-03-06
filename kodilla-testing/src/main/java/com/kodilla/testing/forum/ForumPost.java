package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
    String postBody;
    String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getPostBody() {
        return postBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumPost)) return false;

        ForumPost forumPost = (ForumPost) o;

        if (getPostBody() != null ? !getPostBody().equals(forumPost.getPostBody()) : forumPost.getPostBody() != null)
            return false;
        return getAuthor() != null ? getAuthor().equals(forumPost.getAuthor()) : forumPost.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result = getPostBody() != null ? getPostBody().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        return result;
    }
}
