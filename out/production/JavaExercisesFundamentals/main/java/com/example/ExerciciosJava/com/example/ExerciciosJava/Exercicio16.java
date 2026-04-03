package com.example.ExerciciosJava;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        String status;
        System.out.println("Student Name: ");
        String studentName = reader.nextLine();
        
        System.out.println("Enter your first note: ");
        String n1 = reader.nextLine().replace(",", ".").trim();
        double noteOne = Double.parseDouble(n1);
        if(noteOne < 0 || noteOne > 10){
            System.out.println("Invalid Note, please try again");
        }else{
            System.out.println("Enter your second note: ");
            String n2 = reader.nextLine().replace(",", ".").trim();
            double noteTwo = Double.parseDouble(n2);
            if(noteTwo < 0 || noteTwo > 10){
                System.out.println("Invalid Note, please try again");
            }else{
                System.out.println("Enter your third note: ");
                String n3 = reader.nextLine().replace(",", ".").trim();
                double noteThree = Double.parseDouble(n3);
                if(noteThree < 0 || noteThree > 10){
                    System.out.println("Invalid Note, please try again");
                }else{
                    double average = (noteOne + noteTwo + noteThree) / 3;
                    if(average >= 7){
                        status = "Approved!!";
                        System.out.println("\nName: %s\nAverage: %.2f\nStatus: %s\n".formatted(studentName,average,status));
                    }else if(average < 5){
                        status = "Reprobated!!";
                        System.out.println("\nName: %s\nAverage: %.2f\nStatus: %s\n".formatted(studentName,average,status));
                    }else{
                        status = "Recovery";
                        System.out.println("\nName: %s\nAverage: %.2f\nStatus: %s\n".formatted(studentName,average,status));
                    }   
                }
            }
        }             
    }
}
