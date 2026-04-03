package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter data A: ");
        String A =  reader.nextLine();
        System.out.println("Enter data B: ");
        String B = reader.nextLine();

        String C = A;
        A = B;
        B = C;

        System.out.println("Data A: %s\nData B: %s".formatted(A, B, C));
    }
}
