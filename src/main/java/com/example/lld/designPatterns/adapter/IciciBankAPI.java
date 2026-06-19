package com.example.lld.designPatterns.adapter;

public class IciciBankAPI {

    public boolean moveMoney(double amount, String transferFrom, String transferTo, Long pin){
        System.out.println("Inside moveMoney method of IciciBankAPI");
        if(amount > 0 && balanceCheck(transferFrom, pin) > amount){
            return true;
        }
        return false;
    }

    public Double balanceCheck(String userId, Long pin){
        // Do business logic Authentication check  etc
        System.out.println("Inside balanceCheck method of IciciBankAPI");
        return 1500.00;
    }
}
