package com.kodilla.testing.forum.statistics;




class CalculateAdvStatistics {
    Statistics statistics;
    int userCount = 0;
    int userPosts = 0;
    int userComments = 0;
    int averagePostPerUser = 0;
    int averageCommentsPerUser = 0;
    int averageCommentsPerPosts = 0;

    public CalculateAdvStatistics(Statistics statistics){
        this.statistics = statistics;
        if(statistics.usersNames().size()!=0) {
            this.averagePostPerUser = avgPostForUser(statistics);
            this.averageCommentsPerUser = averageCommentsPerUser(statistics);
        }
        if(statistics.postsCount()!=0)
            this.averageCommentsPerPosts = averageCommentsPerPosts(statistics);

        this.userCount = userCount(statistics);
        this.userPosts = userPosts(statistics);
        this.userComments = userComments(statistics);
    }

    public void showStatistics(){
        System.out.println("Average posts for user: " + getAveragePostPerUser());
        System.out.println("Average comments for user: " + getAverageCommentsPerUser());
        System.out.println("Average comments for post: "+getAverageCommentsPerPosts());
    }




    public int averageCommentsPerPosts(Statistics statistics) {
        return statistics.commentsCount()/statistics.postsCount();
    }

    public int averageCommentsPerUser(Statistics statistics) {
        return statistics.commentsCount() / statistics.usersNames().size();
    }
    public int avgPostForUser(Statistics statistics){
        return statistics.postsCount() / statistics.usersNames().size();
    }
    public int userComments(Statistics statistics) {
        return statistics.commentsCount();
    }

    public int userPosts(Statistics statistics) {
        return statistics.postsCount();
    }

    public int userCount(Statistics statistic) {
        return statistic.usersNames().size();
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

    public int getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }



    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }


}
