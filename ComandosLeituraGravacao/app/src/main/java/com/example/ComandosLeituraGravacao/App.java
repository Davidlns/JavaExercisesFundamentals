package com.example.ComandosLeituraGravacao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();
        
        System.out.println("Texto que será exibido no console!");
        System.out.print("Print sem ln para não pular linhas!");
    }
}
