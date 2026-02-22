package com.example.lld.adapter;

public interface BankAPI {

    TransferStatus transfer(int amount);

    int checkBalance();

}
