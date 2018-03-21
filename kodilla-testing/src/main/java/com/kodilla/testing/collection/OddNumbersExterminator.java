package com.kodilla.testing.collection;
/*
W utworzonym pakiecie stwórz klasę OddNumbersExterminator posiadającą metodę exterminate(ArrayList<Integer> numbers)

        przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
        która zwraca również kolekcję ArrayList liczb typu Integer, stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
*/


import java.util.ArrayList;

public class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<>();
       // ArrayList<Integer> odd = new ArrayList<>();
       for (Integer n: numbers) {
           if (n % 2 == 0) {
               even.add(n);
           }
       }
    return even;
    }
}
