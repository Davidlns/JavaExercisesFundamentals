package com.example.ExerciciosJava;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        double sumSales = 0;
        double sumCost = 0;
        double numProducts = 40;
        double sallingPrice;
        double costPrice;
        
        for(int index = 1; index < numProducts; index++){
            System.out.println("Enter the cost price of product %d: ".formatted(index));
            costPrice = reader.nextDouble();
            System.out.println("Enter the salling price of product %d: ".formatted(index));
            sallingPrice = reader.nextDouble();
            
            double difference = sallingPrice - costPrice;
            
            if(sallingPrice > costPrice){
                System.out.println("Cost price: %.2f, Salling price: %.2f".formatted(costPrice,sallingPrice));
                System.out.println("Profit of %.2f in product %d\n".formatted(difference, index));
            }else if(sallingPrice < costPrice){
                System.out.println("Cost price: %.2f, Salling price: %.2f".formatted(costPrice,sallingPrice));
                System.out.println("Loss of %.2f in product %d\n".formatted(difference,index));
            }else{
                System.out.println("Cost price: %.2f, Salling price: %.2f".formatted(costPrice,sallingPrice));
                System.out.println("Equality in product %d\n".formatted(index));
            }
            
            sumSales += sallingPrice;
            sumCost += costPrice;
            
        }
        
         double averageSales = sumSales / numProducts ;
         double averageCost = sumCost / numProducts;
            
         System.out.println("The total average cost is: %.2f".formatted(averageCost));
         System.out.println("The total average sale is: %.2f\n".formatted(averageSales));
    }
}
