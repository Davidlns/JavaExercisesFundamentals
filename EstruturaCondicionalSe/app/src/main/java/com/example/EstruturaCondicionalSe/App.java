package com.example.EstruturaCondicionalSe;
import java.util.Scanner;
//Relational operators ---- >, <, >=, <=, ==, !=
// Logic operators ------ &&, ||, !

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua média:  ");
        double media = leitor.nextDouble();
        
        if(media >= 7){
            if(media == 10){
                System.out.println("Aprovado com nota máxima!!");
            }
            else{
                System.out.println("Aprovado!!");
            }
        }
        else{
            System.out.println("Reprovado!!");
        }
    }
}
