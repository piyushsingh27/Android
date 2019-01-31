package com.example.dashboard.calculatornew;

public class Addition extends Operation {

    //constructor
    public Addition() {

    }

    //Adds two numbers and returns result
    @Override
    public Number doCalculation(Number first, Number second){
        Double result = first.doubleValue() + second.doubleValue();

        return format(result);
    }
}
