package com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.rest.response;

import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.model.v1.CreditTransaction;

import java.util.List;

public class CreditTransactionResponse {
    private String status;
    private String message;

    private CreditTransaction creditTransaction;
    private List<CreditTransaction> creditTransactions;

    public CreditTransaction getCreditTransaction() {
        return creditTransaction;
    }

    public String getStatus() {
        return status;
    }

    public List<CreditTransaction> getCreditTransactions() {
        return creditTransactions;
    }

    public String getMessage() {
        return message;
    }


    public CreditTransactionResponse(String status, String message, CreditTransaction creditTransaction)
    {
        this.status = status;
        this.message = message;
        this.creditTransaction = creditTransaction;
    }

    public CreditTransactionResponse(String status, String message, List<CreditTransaction> creditTransactions)
    {
        this.status = status;
        this.message = message;
        this.creditTransactions = creditTransactions;
    }

    public CreditTransactionResponse(String status, String message)
    {
        this.status = status;
        this.message = message;
    }
}
