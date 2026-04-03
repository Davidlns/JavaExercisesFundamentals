package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the cost price: ");
        String cost = reader.nextLine().replace(",","").trim();
        double costPrice = Double.parseDouble(cost);

        System.out.println("Enter the product's profit percentage: ");
        String p = reader.nextLine().replace(",","").trim();
        double percent = Double.parseDouble(p);
        double salePrice = costPrice + ((costPrice * percent) / 100);

        System.out.println("The sale price is: " + salePrice);


    }
}
