package com.example.VetoresExercicios;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       int[] numbersVector = new int[5];
       
       for(int index = 0; index < numbersVector.length; index++){
           System.out.println("Enter number " + (index + 1) + ": ");
           numbersVector[index] = reader.nextInt();
       }
       for(int index = 0; index < numbersVector.length; index++){
           System.out.println("Number position [%d]: %d".formatted(index,numbersVector[index]));
       }
       reader.close();
       
    }
}
