package com.example.lld.designPatterns.adapter.BankAdapters;

import com.example.lld.designPatterns.adapter.Phonepe;

public class Main {
    public static void main(String[] args) {
        Phonepe phonepe = new Phonepe();
        phonepe.balanceTransfer("121423", "53322", 12000.0, "12344");
        phonepe.getBalance("121423", "12344");
    }
}
