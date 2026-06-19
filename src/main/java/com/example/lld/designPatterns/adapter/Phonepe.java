package com.example.lld.designPatterns.adapter;


import com.example.lld.designPatterns.adapter.BankAdapters.YesBankAdapter;

public class Phonepe {
//    private final BankAPI bankAPI = new IciciBankAdapter();
    private  final BankAPI bankAPI = new YesBankAdapter();

    public void balanceTransfer(String transferFrom, String transferTo, Double amount, String pin){
        TransferStatus transferStatus = bankAPI.sendMoney(amount, transferFrom, transferTo, pin);
        System.out.println("Balance Transfer :: " + transferStatus);
    }

    public void getBalance(String userId, String pin){
        Double balance = bankAPI.checkBalance(userId, pin);
        System.out.println("Current Balance :: " + balance);

    }





}
