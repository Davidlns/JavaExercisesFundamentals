package com.example.EstruturaWhile;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String studentName;
        int studentAge;
        int totalStudents = 10;
        
        while(totalStudents > 0){
            System.out.println("Enter the name of student: ");
           studentName = reader.nextLine();
           
           System.out.println("Enter the age of student: ");
           studentAge = reader.nextInt();
           reader.nextLine();
           
           System.out.println("The Student name is:  %s and the student age is: %d".formatted(studentName,studentAge));
           totalStudents--;
           
        }
    }
}
