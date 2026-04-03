package com.example.Heritage;
import java.util.Date;

public class Seller extends Employee{

    private int totalItemsSold;
    private float commissionPerItem;
    
    //constructor
    public Seller(){
        super();
    }
    
    //methods
    public float calculateSalary(){
        return super.getSalary() + (this.commissionPerItem * this.totalItemsSold);
    }
    
    //getters and setters

    public int getTotalItemsSold() {
        return totalItemsSold;
    }

    public void setTotalItemsSold(int totalItemsSold) {
        this.totalItemsSold = totalItemsSold;
    }

    public float getCommissionPerItem() {
        return commissionPerItem;
    }

    public void setCommissionPerItem(float commissionPerItem) {
        this.commissionPerItem = commissionPerItem;
    }
    
    
    
       
}
