package com.example.ExerciciosJava;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter the first data: ");
        String first = reader.nextLine();
        String copy = first;
        
        System.out.println("Enter the second data: ");
        String second = reader.nextLine();
        
        first = second;
        second = copy;
        
        System.out.println("FIRST: %s\n".formatted(first));
        System.out.println("SECOND: %s\n".formatted(second));
        
    }
}
