package com.example.ExerciciosJava;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        String n = reader.nextLine().replace(",", ".");
        double number = Double.parseDouble(n);
        
        if(number >= 100 && number <= 200){
            System.out.println("\nThe number is between 100 and 200");
        }else{
            System.out.println("\nOutside the range of 100 to 200");
        }
    }
}
