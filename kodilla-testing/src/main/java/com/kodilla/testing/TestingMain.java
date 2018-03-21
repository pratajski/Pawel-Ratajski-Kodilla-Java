package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;
import java.util.Random;

public class TestingMain {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<10;i++) {
            Random number = new Random();
            int numbers = number.nextInt(100);
            list.add(numbers);

        }

        OddNumbersExterminator.exterminate(list);
        System.out.println(OddNumbersExterminator.exterminate(list));
    }
}