package com.kodilla.kalkulator;

public class Calculator {

    public void addNumbers() {
        System.out.println("Good job!");
    }

    public void subtractNumbers() {
        System.out.println("Works well :)");
    }

    public static void main (String args []) {

        Calculator calculator = new Calculator();
        calculator.addNumbers();
        calculator.subtractNumbers();
    }
}
