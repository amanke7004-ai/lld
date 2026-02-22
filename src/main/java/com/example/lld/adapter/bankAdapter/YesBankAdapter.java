package com.example.lld.adapter.bankAdapter;

import com.example.lld.adapter.BankAPI;
import com.example.lld.adapter.TransferStatus;
import com.example.lld.adapter.banks.YesBank;

public class YesBankAdapter implements BankAPI {

//    @Autowired
    
    private YesBank yesBank = new YesBank();

    @Override
    public TransferStatus transfer(int amount) {
        boolean transferDone;
        try {
            transferDone = yesBank.transfer(amount);
        }catch (Exception e){
            transferDone = false;
            System.out.println("Error in transferring balance");
        }
        //using this adapter to convert the status from boolean to Enum
        return transferDone ? TransferStatus.SUCCESS : TransferStatus.FAILURE;
    }

    @Override
    public int checkBalance() {
        return yesBank.checkBalance();
    }
}
