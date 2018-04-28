package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
       System.out.println("Calculating expressions with lambdas");
       ExpressionExecutor expressionExecutor = new ExpressionExecutor();
       expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
       expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
       expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
       expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

       System.out.println("Calculating expression with method references");
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

       System.out.println("Upiększacz");
       PoemBeautifier poemBeautifier = new PoemBeautifier();
       poemBeautifier.executedecorator("tekst do upiększenia", dec -> "ABC");
       poemBeautifier.executedecorator("upiększamy gwiazdkami", dec -> "***");
       poemBeautifier.upperdecorator("drukowany upiększacz", dec -> "oOo");
       poemBeautifier.lowerdecorator("mały upiększacz", dec -> "WwW");

       System.out.println("Using Stream to generate even numbers from 1 to 20");
       NumbersGenerator.generateEven(20);

    }
}
