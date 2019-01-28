package com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.service;

import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.model.v1.CreditTransaction;

import java.util.List;

public interface CreditTransactionService {
    Object getTransactionByTransactionReference(String transactionRef);
    Object getTransactionByClientRef(String clientRef);

    Object getTransactionByFilterParameters(String initiatinInstitutionCode,
                                            String destinationInstitutionCode,
                                            String inquiryDateTime,
                                            String creditDateTime,
                                            String status,
                                            String terminalId,
                                            String channel);
}
