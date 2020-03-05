package com.kodilla;

class Calculator
{
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.addAToB(3, 5);
        int resultSubstract = calculator.substractAFromB(17,3);

        System.out.println("Result Add " + resultAdd);
        System.out.println("Result Substract " + resultSubstract);

    }
}