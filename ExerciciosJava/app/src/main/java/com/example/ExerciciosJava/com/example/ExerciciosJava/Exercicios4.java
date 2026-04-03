package com.example.ExerciciosJava;
import java.util.Scanner;
//receba o nome de um vendedor, seu salário fixo, total de vendas no mês

public class Exercicios4 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = reader.nextLine().trim();
        
        System.out.println("Enter your fixed salary: ");
        String s = reader.nextLine().replace(",", ".").trim();
        double salary = Double.parseDouble(s);
        
        System.out.println("Enter the total value of sales made this month: ");
        String sa = reader.nextLine().replace(",", ".").trim();
        double sales = Double.parseDouble(sa);
        
        if(salary < 0 || sales < 0){
            System.out.println("Invalid data. Please try again with positive numbers.");
        }
        else{
            double  commission = sales * 0.15;
            double total = salary + commission;
            
            System.out.println("Fixed salary: %.2f\n Commission: %.2f\n".formatted(salary,commission));
            System.out.println("The total earnings are %.2f".formatted(total));
        }
    }
}
