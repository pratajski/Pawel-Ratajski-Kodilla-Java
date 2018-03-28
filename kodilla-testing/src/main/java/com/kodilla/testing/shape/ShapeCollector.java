package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    ArrayList<String> figuresList = new ArrayList<>();




    public void addFigure(Shape shape){
        this.shape = shape;
        figuresList.add(shape);
        //
       // return 10;
    }

    public boolean removeFigure(Shape shape){

        return true;
    }

    public int getFigure(int n){
        return 0;
    }

    public int showFigures(int figureNumber){

        return 0;
    }
}
