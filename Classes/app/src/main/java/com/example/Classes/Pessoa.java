package com.example.Classes;

public class Pessoa {
    //Atributos
   private float weight;
   private float height;
   
   public Pessoa(float weight, float height){
       this.weight = weight;
       this.height = height;
   }
    
    public float calcularIMC(){
        float imc = weight / (height * height);
        return imc;
    } 
    public void setWeight(float weight){
        // Data validation can be done here.
        this.weight = weight;
    }
    public float getWeight(){
        return weight;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getHeight(){
        return height;
    }
}
