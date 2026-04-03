package com.example.VetoresExercicios;
import java.util.Scanner;

public class ExercicioAvançado {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        String[] names = new String[10];
        
        for(int index = 0; index < names.length; index++){
            System.out.println("Register student %d: ".formatted(index + 1));
            names[index] = reader.nextLine();
        }
        
        System.out.println("Search for a student: ");
        String searchName = reader.nextLine().trim();
        boolean found = false;
        
        for(int index = 0; index < names.length; index++){
            if(searchName.equalsIgnoreCase(names[index])){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("\nStudent found!");
        }else{
            System.out.println("\nStudent not found!");
        }
    }
}
