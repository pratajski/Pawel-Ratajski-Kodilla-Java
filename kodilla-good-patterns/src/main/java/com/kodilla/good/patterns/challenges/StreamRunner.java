package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class StreamRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().values().stream()
                .flatMap(Collection::stream).map(String -> String + " !")
                .forEach(System.out::println);

     //



    }
}
