package com.kodilla.testing.main;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 3;

        if(calculator.add(a, b) == a + b){
            System.out.println("Add OK");
        } else {
            System.out.println("Add NOK");
        }

        if(calculator.subtract(a, b) == a - b){
            System.out.println("Subtract OK");
        } else {
            System.out.println("Subtract NOK");
        }

    }
}
