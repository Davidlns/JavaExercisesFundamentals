package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the total value of sale: ");
        String sale = reader.nextLine().replaceAll(" ","").trim();
        double valueSale = Double.parseDouble(sale);

        System.out.println("Enter the number of installments (1 to 5): ");
        int installments = reader.nextInt();

        if (installments < 1 || installments > 5) {
            System.out.println("the number of installments must be between 0 and 5");
        }else{
            double valueInstallments =  valueSale / installments;
            System.out.println("%d installments of $%.2f".formatted(installments, valueInstallments));
        }

    }
}
