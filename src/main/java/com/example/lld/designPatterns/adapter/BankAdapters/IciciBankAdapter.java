package com.example.lld.designPatterns.adapter.BankAdapters;

import com.example.lld.designPatterns.adapter.BankAPI;
import com.example.lld.designPatterns.adapter.IciciBankAPI;
import com.example.lld.designPatterns.adapter.TransferStatus;

public class IciciBankAdapter implements BankAPI {

    private final IciciBankAPI iciciBankAPI = new IciciBankAPI();
    @Override
    public TransferStatus sendMoney(Double amount, String transferFrom, String transferTo, String pin) {
        Long longPin = Long.parseLong(pin);
        boolean transferSuccess = iciciBankAPI.moveMoney(amount, transferFrom, transferTo, longPin);
        return transferSuccess ? TransferStatus.SUCCESS : TransferStatus.FAILURE;
    }

    @Override
    public Double checkBalance(String userId, String pin) {
        Long longPin = Long.parseLong(pin);
        return iciciBankAPI.balanceCheck(userId, longPin);
    }
}
