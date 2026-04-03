package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[]args){
        Scanner  reader = new Scanner(System.in);
        
        System.out.println("Write the first number: ");
        String num1 = reader.nextLine().replace(",", ".");
        double number1 = Double.parseDouble(num1);
        
        System.out.println("Write the second number");
        String num2 = reader.nextLine().replace(",",".");
        double number2 = Double.parseDouble(num2);
        
        double sum = number1 + number2;
        System.out.println("A soma de %.2f + %.2f = %.2f".formatted(number1,number2,sum));
    }
}
