package com.example.lld.adapter;

import com.example.lld.adapter.bankAdapter.IciciBankAdapter;

import java.util.Scanner;

public class Client {


    public static void main(String[] args) {

        BankAPI bankAPI = new IciciBankAdapter();
        int currBalance = bankAPI.checkBalance();
        System.out.println("Opening Balance : " + currBalance);
        TransferStatus status;
        do{
            System.out.println("Enter amount to be transferred :  ");
            int transferAmount = new Scanner(System.in).nextInt();
            status = bankAPI.transfer(transferAmount);
        }while(status == TransferStatus.SUCCESS);


    }
}
