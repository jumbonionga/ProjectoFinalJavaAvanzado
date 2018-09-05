package com.fernandoperez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        History history = new History();
        Scanner scanner = new Scanner(System.in);
        String entry = " ";
        while(!entry.isEmpty()) {
            System.out.println("Ingrese operaci\u00F3n");
            entry = scanner.nextLine();
            if(!entry.isEmpty()) {
                history.add(entry);
                System.out.println(calc.operate(entry)+"\n");
            } else {
                System.out.println("Operaciones completadas. Mostrando historial\n");
            }
        }
//        String entry = "15 7 1 1 + - / 3 * 2 1 1 + + -";
//        String entry2 = "3 8 + 5 -";
//        String entry3 = "2 3 11 + 5 - *";

        history.quicksort();
        history.originalList();
        history.sortedList();


    }
}
