package com.example.VetoresExercicios;
import java.util.Scanner;

public class ExercicioMedio {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        double[] vectorNotes = new double[5];
        double sumNotes = 0;
        
        for(int index = 0; index < vectorNotes.length; index++){
            boolean validNote = false;
            
            while(!validNote){
                try{
                    System.out.println("Enter the note %d: ".formatted(index+1));
                    String input = reader.nextLine().replace(",", ".").trim();
                    double validate = Double.parseDouble(input);
                    
                    if(validate > 10 || validate < 0){
                        throw new IllegalArgumentException("Invalid rating. 0 to 10 only.");
                    }
                    
                    vectorNotes[index] = validate;
                    sumNotes += validate;
                    validNote = true;
                    
                } catch (NumberFormatException e) {
                    System.out.println("Error: Enter only numbers.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred.");
                }
            }
        }
        
        double average = sumNotes / vectorNotes.length;
        if(average >= 7){
            System.out.println("Approved!!");
        }else if(average < 5){
            System.out.println("Failed!!");
        }else{
            System.out.println("Recovery!!");
        }
    }
}
