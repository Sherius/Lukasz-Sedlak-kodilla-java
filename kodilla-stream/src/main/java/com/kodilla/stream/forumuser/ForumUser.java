package com.kodilla.stream.forumuser;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final int birthDate;
    private final int postCount;

    public ForumUser(int userId, String userName, char sex, int birthDate, int postCount) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (getUserId() != forumUser.getUserId()) return false;
        if (getSex() != forumUser.getSex()) return false;
        if (getBirthDate() != forumUser.getBirthDate()) return false;
        if (getPostCount() != forumUser.getPostCount()) return false;
        return getUserName() != null ? getUserName().equals(forumUser.getUserName()) : forumUser.getUserName() == null;
    }

    @Override
    public int hashCode() {
        int result = getUserId();
        result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
        result = 31 * result + (int) getSex();
        result = 31 * result + getBirthDate();
        result = 31 * result + getPostCount();
        return result;
    }
}