/*
W pakiecie com.kodilla.testing.forum.statistics utwórz klasę obliczającą następujące statystyki:

    liczbę użytkowników,-
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
    int postsQuantity;
    int commentsQuantity;
    private List<String>usernames = new ArrayList<>();
    Statistics statistics;

    public CalculateStatistics(int postsQuantity, int commentsQuantity, List<String> usernames) {
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
        this.usernames = usernames;
    }

    @Override
    public List<String> usersNames() {

        return usernames;
    }

    @Override
    public int postsCount() {
        return postsQuantity;
    }

    @Override
    public int commentsCount() {
        return commentsQuantity;
    }

    public int usersQuantity (){
        int quantityUsers = usernames.size();
        return quantityUsers;
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public void showStatistics(){

    }
}
