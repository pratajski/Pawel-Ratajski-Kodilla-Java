package com.kodilla.testing.shape;

public class Figures {
    String name;
    public Figures(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o){
        final Figures e = (Figures) o;
        return this.name.equals(e.name);
    }

    @Override
    public int hashCode(){
        int result = name.hashCode();
        return result;
    }




    //End
}
