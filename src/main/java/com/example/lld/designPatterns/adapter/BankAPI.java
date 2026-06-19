package com.example.lld.designPatterns.adapter;

public interface BankAPI {

    TransferStatus sendMoney(Double amount, String transferFrom, String transferTo, String pin);

    Double checkBalance(String userId, String pin);
}
