package com.example.Heritage;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        Seller tcar = new Seller();
        tcar.setName("David");
        tcar.setSalary(5000.0f);
        tcar.setCpf("48196701829");
        tcar.setDateOfBirth(new Date());
        tcar.setCommissionPerItem(100.0f);
        tcar.setTotalItemsSold(10);
        
        System.out.println("The total salary of seller is: %.2f".formatted(tcar.calculateSalary()));
        
        Driver bred = new Driver();
    }
}
