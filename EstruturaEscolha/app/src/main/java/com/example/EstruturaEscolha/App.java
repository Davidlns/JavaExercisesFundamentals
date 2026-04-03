package com.example.EstruturaEscolha;

public class App {
    
    public static void main(String[] args) {
        
        int codigoProduto = 2;
        
        switch(codigoProduto){
            case 1:
                System.out.println("Teste1");
                break;
            case 2:
                System.out.println("Teste2");
                break;
            case 3:
                System.out.println("Teste3");
                break;
            default:
                System.out.println("Teste4");
                break;
        }
    }
}
