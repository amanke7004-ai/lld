package com.example.lld.adapter.bankAdapter;

import com.example.lld.adapter.BankAPI;
import com.example.lld.adapter.TransferStatus;
import com.example.lld.adapter.banks.IciciBank;

public class IciciBankAdapter implements BankAPI {

//    @Autowired
    IciciBank iciciBank = new IciciBank();
    @Override
    public TransferStatus transfer(int amount) {
        String status = iciciBank.transfer(amount);
        switch (status) {
            case "TRANSFER_DONE" : {
                System.out.println("amount sent successfully");
                return TransferStatus.SUCCESS;
            }
            case "INSUFFICIENT_BALANCE" : {
                System.out.println("amount transfer declined due to insufficient balance");
                return TransferStatus.DECLINED;
            }
            default : {
                System.out.println("UNDEFINED STATUS : " + status);
                return TransferStatus.FAILURE;
            }
        }
    }

    @Override
    public int checkBalance() {
        return iciciBank.checkBalance();
    }
}
