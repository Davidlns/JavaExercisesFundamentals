package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Write the first number: ");
        String num1 = reader.nextLine().replace(",",".");
        double number1 = Double.parseDouble(num1);
        
        System.out.println("Write the second number: ");
        String num2 = reader.nextLine().replace(",",".");
        double number2 = Double.parseDouble(num2);
        String menu;
        
        do{
                System.out.println("Select the type of operation: \n 1.Sum \n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Close application:\n");
                menu = reader.nextLine().trim();
                switch(menu)
                {

                    case "1":
                       double sum = number1 + number2;
                       System.out.println("The sum: %.2f  +  %.2f = %.2f\n".formatted(number1,number2,sum));
                       break;
                    case "2":
                        double difference = number1 - number2;
                        System.out.println("The subtraction: %.2f  -  %.2f = %.2ff\n".formatted(number1,number2,difference));
                        break;
                    case "3":
                        double product = number1 * number2;
                        System.out.println("The Multiplication: %.2f  *  %.2f = %.2ff\n".formatted(number1,number2,product));
                        break;
                    case "4":
                        if(number2 != 0 ){
                            double quotient = number1 / number2;
                            System.out.println("The division: %.2f / %.2f = %.2ff\n".formatted(number1,number2,quotient));
                            break;
                        }else{
                            System.out.println("Division by zero is not allowed. Try again using a different number!!f\n");
                            menu = "5";
                            break;
                        }
                    case "5":
                        System.out.println("finished program!!");
                        break;
                    default: 
                        System.out.println("Invalid option!");
                }
        }while(!menu.equals("5"));
    }
}
