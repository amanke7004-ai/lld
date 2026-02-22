package com.example.lld.adapter.banks;

public class YesBank {
    private Integer initialBalance;
    public boolean transfer(int amount){
        int balance = checkBalance();
        if(balance > amount){
            initialBalance -= amount;
            System.out.println("Amount successfully transferred, new Balance : " + initialBalance);
        }else{
            System.out.println("Insufficient balance. REQUIRED : " +  amount + " available : " + balance);
            throw new RuntimeException("InsufficientBalanceException");
        }
        return true;
    }

    public int checkBalance(){
        if(initialBalance == null) {
            initialBalance = (int) (Math.random() * 1000);
        }
        return  initialBalance;
    }


}
