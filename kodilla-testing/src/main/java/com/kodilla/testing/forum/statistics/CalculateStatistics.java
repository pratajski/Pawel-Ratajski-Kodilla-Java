/*
W pakiecie com.kodilla.testing.forum.statistics utwórz klasę obliczającą następujące statystyki:

    liczbę użytkowników,
    liczbę postów.
    liczbę komentarzy,
    średnią liczbę postów na użytkownika,
    średnią liczbę komentarzy na użytkownika,
    średnią liczbę komentarzy na post.

Stworzona klasa powinna posiadać metodę calculateAdvStatistics(Statistics statistics), która obliczy podane powyżej wartości
i zapamięta je we właściwościach (polach) klasy. Możesz również dopisać metodę showStatistics(), która wyświetli zapamiętane
we właściwościach statystyki.

    List<String> usersNames();  // list of users names
    int postsCount();           // total quantity of forum posts
    int commentsCount();
 */

package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics{
  //  Statistics statistics;

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;
 //   private List<String>usernames = new ArrayList<>();

    public void calculateAdvStatistics(Statistics statistics){
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        if (usersQuantity == 0){
            this.averagePostsPerUser = 0;
        }else{
            this.averagePostsPerUser = (double) postsQuantity / usersQuantity;
        }

        if (usersQuantity == 0){
            this.averageCommentsPerUser = 0;
        }else{
            this.averageCommentsPerUser = (double) commentsQuantity / usersQuantity;
        }

        if (postsQuantity == 0){
            this.averageCommentsPerPost = 0;
        }else {
            this.averageCommentsPerPost = (double) commentsQuantity / postsQuantity;
        }
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void showStatistics(){
        System.out.println("Users Quantity");
        System.out.println("Posts Quantity");
        System.out.println("Comments Quantity");
    }
}
