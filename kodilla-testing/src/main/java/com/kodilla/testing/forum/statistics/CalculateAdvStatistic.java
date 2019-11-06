package com.kodilla.testing.forum.statistics;




class CalculateAdvStatistics {
    private Statistics statistics;
    private int userCount = 0;
    private int userPosts = 0;
    private int userComments = 0;
    double averagePostPerUser = 0;
    double averageCommentsPerUser = 0;
    double averageCommentsPerPosts = 0;

    public CalculateAdvStatistics(Statistics statistics){
        this.statistics = statistics;
        if(statistics.usersNames().size()!=0) {
            this.averagePostPerUser = avgPostForUser();
            this.averageCommentsPerUser = averageCommentsPerUser();
        }
        if(statistics.postsCount()!=0)
            this.averageCommentsPerPosts = averageCommentsPerPosts();

        this.userCount = userCount();
        this.userPosts = userPosts();
        this.userComments = (int) userComments();
    }

    public void showStatistics(){
        System.out.println("Average posts for user: " + getAveragePostPerUser());
        System.out.println("Average comments for user: " + getAverageCommentsPerUser());
        System.out.println("Average comments for post: "+getAverageCommentsPerPosts());
    }




    public double averageCommentsPerPosts( ) {
        return statistics.commentsCount()/statistics.postsCount();
    }

    public double averageCommentsPerUser( ) {
        return statistics.commentsCount() / statistics.usersNames().size();
    }
    public double avgPostForUser( ){
        return statistics.postsCount() / statistics.usersNames().size();
    }
    private double userComments( ) {
        return statistics.commentsCount();
    }

    private int userPosts( ) {
        return statistics.postsCount();
    }

    private int userCount( ) {
        return statistics.usersNames().size();
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getUserPosts() {
        return userPosts;
    }

    public void setUserPosts(int userPosts) {
        this.userPosts = userPosts;
    }

    public int getUserComments() {
        return userComments;
    }

    public void setUserComments(int userComments) {
        this.userComments = userComments;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }



    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }


}
