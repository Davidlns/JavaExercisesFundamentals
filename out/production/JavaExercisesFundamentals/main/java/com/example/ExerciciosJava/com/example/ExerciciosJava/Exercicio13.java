package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        String n =  sc.nextLine().replace(",",".").trim();
        double number = Double.parseDouble(n);

        if (number > 10){
            System.out.println("The number is greater than 10");
        }
    }
}
