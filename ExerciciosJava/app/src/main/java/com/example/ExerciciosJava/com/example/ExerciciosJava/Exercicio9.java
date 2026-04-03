package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deposit an amount: ");
        String d =  sc.nextLine().replace(",",".").trim();
        double deposit = Double.parseDouble(d);
        double percent = deposit * 0.007;

        System.out.println("Amount deposited: " + deposit);
        System.out.println("Yield after 1 month: %.2f".formatted(deposit + percent));
        System.out.println("Surrendered: %.2f".formatted(percent));
    }
}
