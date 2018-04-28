package com.kodilla.stream.beautifier;

public class PoemBeautifier{

    public void executedecorator(String a, PoemDecorator poemDecorator){
        String result = poemDecorator.decorator(a);
        System.out.println(result +" " +a +" " +result);
    }

    public void upperdecorator(String a, PoemDecorator poemDecorator){
        String result = poemDecorator.decorator(a);
        System.out.println(result.toUpperCase() +" " +a +" " +result.toUpperCase());
    }

    public void lowerdecorator(String a, PoemDecorator poemDecorator){
        String result = poemDecorator.decorator(a);
        System.out.println(result.toLowerCase() +" " +a +" " +result.toLowerCase());
    }

}
