package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Celcius: ");
        double celcius = reader.nextDouble();

        double fahrenheit = (9 * celcius + 160) / 5;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
