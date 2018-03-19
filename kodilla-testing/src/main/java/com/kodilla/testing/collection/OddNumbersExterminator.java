package com.kodilla.testing.collection;
/*
W utworzonym pakiecie stwórz klasę OddNumbersExterminator posiadającą metodę exterminate(ArrayList<Integer> numbers)

        przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
        która zwraca również kolekcję ArrayList liczb typu Integer, stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
*/


import java.util.ArrayList;

public class OddNumbersExterminator {
    public static void exterminate(ArrayList<Integer> numbers){
       for (Integer n: numbers) {
           if (n % 2 == 0) {
               System.out.println("Liczba parzysta: " + n);
           }else {
               System.out.println("Liczba nieparzysta: " + n);
           }
       }

    }
}
