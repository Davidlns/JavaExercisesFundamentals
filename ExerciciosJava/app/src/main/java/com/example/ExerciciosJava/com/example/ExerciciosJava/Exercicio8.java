package com.example.ExerciciosJava;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;

        double exchange = 5.16;


        do{
            System.out.println("Choose the exchange rate option: \n1 - Dollar to Real\n2-Real to Dollar\n3-Finish");
            menu = sc.nextLine().trim();

            if(menu.equals("1")){
                System.out.println("Enter the value in dollars: ");
                String dollars = sc.nextLine().replaceAll(",", ".").trim();
                double dollar = Double.parseDouble(dollars);

                double real = dollar * exchange;
                System.out.println("Real: " + real);

                System.out.println("Deseja continuar? (S/N)");
                String continuar = sc.nextLine().replaceAll(",", ".").trim();

                if(continuar.trim().equalsIgnoreCase("N")){
                    System.out.println("Program Finished!!");
                    break;
                }else if(!continuar.equalsIgnoreCase("S")) {
                    System.out.println("Invalid input!!");
                    break;
                }

            }else if(menu.equals("2")){
                System.out.println("Enter the value in real: ");
                String r = sc.nextLine().replaceAll(",", ".").trim();
                double real = Double.parseDouble(r);

                double dollar = real / exchange;
                System.out.println("Dollar: " + dollar);

                System.out.println("Deseja continuar? (S/N)");
                String continuar = sc.nextLine().replaceAll(",", ".").trim();

                if(continuar.trim().equalsIgnoreCase("N")){
                    System.out.println("Program Finished!!");
                    break;
                }else if(!continuar.equalsIgnoreCase("S")) {
                    System.out.println("Invalid input!!");
                    break;
                }

            }else if(menu.equals("3")){
                System.out.println("Program Finished!!");
                break;
            }else{
                System.out.println("Invalid input!! Try again");
            }
        }while(!menu.equals(3));
    }
}
