package com.fernandoperez;

public class Main {

    public static void main(String[] args) {
        String entry = "15 7 1 1 + - / 3 * 2 1 1 + + -";//"3 8 + 5 -";
        Calculator calc = new Calculator();
        System.out.println(calc.operate(entry));

    }
}
