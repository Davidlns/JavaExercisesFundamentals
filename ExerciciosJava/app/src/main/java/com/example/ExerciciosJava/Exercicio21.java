package com.example.ExerciciosJava;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int index = 1;
        int dataNumber;
        
        while(index <= 5){
            System.out.println("Enter a number: ");
            dataNumber = reader.nextInt();
            
            if(dataNumber < 0){
                System.out.println("\nThe number %d is negative".formatted(dataNumber));
                index++;
            } else if(dataNumber > 0){
                System.out.println("\nThe number %d is positive".formatted(dataNumber));
                index++;
            }else{
                System.out.println("\nZERO!!");
                index++;
            }
        }
    }
}
