package com.example.EstruturaFor;
import java.util.Scanner;

public class QtdeAlunos {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        String studentName;
        int studentAge;
        
        for(int totalStudents = 10; totalStudents > 0; totalStudents--){
            System.out.println("The Student name: ");
            studentName = reader.nextLine();
            
            System.out.println("The student age: ");
            studentAge = reader.nextInt();
            reader.nextLine();
            
            System.out.println("The student name is: %s \nThe student age is: %d\n".formatted(studentName,studentAge));
        }
    }
}
