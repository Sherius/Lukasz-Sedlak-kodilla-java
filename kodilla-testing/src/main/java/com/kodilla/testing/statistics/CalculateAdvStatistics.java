package com.kodilla.testing.statistics;


import com.sun.org.glassfish.external.statistics.Statistic;

class CalculateAdvStatistic {
    Statistic statistic;
    private int userCount = 0;
    private int userPosts = 0;
    private int userComments = 0;
    private double averagePostPerUser = 0;
    private double averageCommentsPerUser = 0;
    private double averageCommentsPerPosts = 0;

    public CalculateAdvStatistic(Statistic statistic){
        this.statistic = statistic;
        this.userCount = userCount;
        this.userPosts = userPosts;
        this.userComments = userComments;
        this.averageCommentsPerPosts = averageCommentsPerPosts;
        this.averagePostPerUser = averagePostPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
    }

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

}
