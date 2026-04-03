package com.example.Classes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Pessoa person = new Pessoa();
        
        System.out.println("Enter the person's weight:   ");
        person.setWeight(reader.nextFloat());
        System.out.println("Enter the perso's height:   ");
        person.setHeight(reader.nextFloat());
        
        person.getWeight();
        
        System.out.println("The IMC = %.2f".formatted(person.calcularIMC()));
    }
}
