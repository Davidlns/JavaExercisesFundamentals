package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String n1 =  sc.nextLine().replace(",",".").trim();
        double number =  Double.parseDouble(n1);

        System.out.println("Enter the second number: ");
        String n2 =  sc.nextLine().replace(",",".").trim();
        double number2 =  Double.parseDouble(n2);

        if(number > number2){
            System.out.println("%.2f is greater than %.2f".formatted(number,number2));
        }else if(number < number2){
            System.out.println("%.2f is greater than %.2f".formatted(number2,number));
        }else{
            System.out.println("The two numbers are the same.");
        }
    }
}
