package com.example.ExerciciosJava;
import java.util.Scanner;
//Divide the total distance by the total fuel consumption to obtain the average fuel consumption.

public class Exercicio3 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter the total distance traveled:  ");
        String dis = reader.nextLine().replace(",",".").trim();
        double distance = Double.parseDouble(dis);
        
        System.out.println("Enter the total fuel consumed: ");
        String f = reader.nextLine().replace(",",".").trim();
        double fuel = Double.parseDouble(f);
        
        if (fuel <= 0){
            System.out.println("Fuel must be greater than zero!");
        }else{
            double averageConsumption = distance / fuel;
            System.out.println("The average consumption is %.2f km/L".formatted(averageConsumption));
        }  
    }
}
