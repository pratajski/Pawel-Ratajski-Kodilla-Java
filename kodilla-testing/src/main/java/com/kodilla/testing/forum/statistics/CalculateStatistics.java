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

public class CalculateStatistics implements Statistics{
  //  Statistics statistics;

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double advPostsUser;
    private List<String>usernames = new ArrayList<>();

    public void calculateAdvStatistics(Statistics statistics){
        this.usernames = statistics.usersNames();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        this.advPostsUser = postsQuantity / (usernames.size()+1);
        this.usersQuantity = usernames.size();
    }


    @Override
    public List<String> usersNames() {

        return usernames;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public double getAdvPostsUser() {
        return advPostsUser;
    }

    @Override
    public int postsCount() {
        return postsQuantity;
    }

    @Override
    public int commentsCount() {
        return commentsQuantity;
    }

    public void showStatistics(){
        System.out.println("Users Quantity");
        System.out.println("Posts Quantity");
        System.out.println("Comments Quantity");
    }
}
