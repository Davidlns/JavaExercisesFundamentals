package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double carCost;
        double distributorPercent = 28;
        double taxPercent = 45;

        System.out.print("Enter the car cost: ");
        String carCostString = sc.nextLine().replace(",", ".").trim();
        carCost = Double.parseDouble(carCostString);

        double generalCosts = ((carCost * distributorPercent) / 100) + ((carCost * taxPercent) / 100);
        double salePrice = carCost + generalCosts;

        System.out.println("The sale price is: " + salePrice);

    }
}
