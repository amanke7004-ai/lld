package com.example.lld.designPatterns.adapter;

public class YesBankAPI {

    public String transferMoney(double amount, Long senderId, Long receiverId, String pin){
        System.out.println("Inside transferMoney method of YesBankAPI");
        if(amount > 0 && checkBalance(senderId, pin) > amount){

            return "success";
        }
        return "failure";
    }

    public Double checkBalance(Long userId, String pin){
        // Do business logic Authentication check  etc
        System.out.println("Inside checkBalance method of YesBankAPI");
        return 13000.50;
    }
}
