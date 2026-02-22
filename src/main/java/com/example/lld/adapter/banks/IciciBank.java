package com.example.lld.adapter.banks;

public class IciciBank {
    private Integer initialBalance = 1000;
    public String transfer(int amount){
        int balance = checkBalance();
        if(balance > amount){
            initialBalance -= amount;
            return "TRANSFER_DONE";
        }else{
            System.out.println("Insufficient balance");
            return "INSUFFICIENT_BALANCE";
        }
    }

    public int checkBalance(){
        return  initialBalance;
    }
}
