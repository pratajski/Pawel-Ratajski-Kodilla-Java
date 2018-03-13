package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int resultCalculatorAdd = calculator.add(2,2);
        int resultCalculatorSubtract = calculator.subtract(2,2);
            if ((resultCalculatorAdd == 4)&&(resultCalculatorSubtract == 0)){
                System.out.println("Calculator is OK");
            }else {
                System.out.println("Calculator Error!");
            }










    }
}