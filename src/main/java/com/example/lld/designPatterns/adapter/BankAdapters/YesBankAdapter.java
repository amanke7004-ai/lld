package com.example.lld.designPatterns.adapter.BankAdapters;

import com.example.lld.designPatterns.adapter.BankAPI;
import com.example.lld.designPatterns.adapter.TransferStatus;
import com.example.lld.designPatterns.adapter.YesBankAPI;

public class YesBankAdapter implements BankAPI {

    private final YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public TransferStatus sendMoney(Double amount, String transferFrom, String transferTo, String pin) {
        Long senderId = Long.parseLong(transferFrom);
        Long receiverId = Long.parseLong(transferTo);
        String transferStatus = yesBankAPI.transferMoney(amount, senderId, receiverId, pin);
        if("success".equalsIgnoreCase(transferStatus)){
            return TransferStatus.SUCCESS;
        }
        return TransferStatus.FAILURE;
    }

    @Override
    public Double checkBalance(String userId, String pin) {
        Long userIdLong = Long.parseLong(userId);
        return yesBankAPI.checkBalance(userIdLong, pin);
    }
}
