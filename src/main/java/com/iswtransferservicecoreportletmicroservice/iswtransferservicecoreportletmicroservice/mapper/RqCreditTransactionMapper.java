package com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.mapper;

import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.model.v1.CreditTransaction;

public class RqCreditTransactionMapper extends CreditTransaction {
    private String restStatus;
    private String restMessage;

    private CreditTransaction creditTransaction;

    public CreditTransaction getCreditTransaction() {
        return creditTransaction;
    }

    public String getRestStatus() {
        return restStatus;
    }

    public String getRestMessage() {
        return restMessage;
    }


    public RqCreditTransactionMapper(String restStatus, String restMessage, CreditTransaction creditTransaction)
    {
        this.restStatus = restStatus;
        this.restMessage = restMessage;
        this.creditTransaction = creditTransaction;
    }
//    private Long id;
//
//    private Long institutionId;
//
//    private String transactionReference, initiatingInstitutionCode, clientRef, accountNumber, destinationInstitutionCode, currencyCode, inquiryDateTime, creditDateTime, status, channel, terminalId, mobileNumber, emailAddress, paymentLocation, additionalInfo,inquiryInstitutionReference, creditInstitutionReference, inquiryRemoteResponseCode, creditRemoteResponseCode, inquiryRemoteResponseMessage, creditRemoteResponseMessage, tsInquiryResponseCode, tsCreditResponseCode, middlewareCreditResponseCode, accountName, accountType, address, action, countryCode,  inquiryProcessTime, creditProcessTime, creditRemoteProcessTime, bankVerificationNumber, kycLevel, narration;
//
//    public String transaction_reference;
//
//    private Double transactionAmount, creditTransactionAmount;
//
//    private String channelCode;
//
//    private Boolean canCredit;
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getInstitutionId() {
//        return institutionId;
//    }
//
//    public void setInstitutionId(Long institutionId) {
//        this.institutionId = institutionId;
//    }
//
//    public String getTransactionReference() {
//        return transactionReference;
//    }
//
//    public void setTransactionReference(String transactionReference) {
//        this.transactionReference = transactionReference;
//    }
//
//    public String getInitiatingInstitutionCode() {
//        return initiatingInstitutionCode;
//    }
//
//    public void setInitiatingInstitutionCode(String initiatingInstitutionCode) {
//        this.initiatingInstitutionCode = initiatingInstitutionCode;
//    }
//
//    public String getClientRef() {
//        return clientRef;
//    }
//
//    public void setClientRef(String clientRef) {
//        this.clientRef = clientRef;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getDestinationInstitutionCode() {
//        return destinationInstitutionCode;
//    }
//
//    public void setDestinationInstitutionCode(String destinationInstitutionCode) {
//        this.destinationInstitutionCode = destinationInstitutionCode;
//    }
//
//    public String getCurrencyCode() {
//        return currencyCode;
//    }
//
//    public void setCurrencyCode(String currencyCode) {
//        this.currencyCode = currencyCode;
//    }
//
//    public String getInquiryDateTime() {
//        return inquiryDateTime;
//    }
//
//    public void setInquiryDateTime(String inquiryDateTime) {
//        this.inquiryDateTime = inquiryDateTime;
//    }
//
//    public String getCreditDateTime() {
//        return creditDateTime;
//    }
//
//    public void setCreditDateTime(String creditDateTime) {
//        this.creditDateTime = creditDateTime;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getChannel() {
//        return channel;
//    }
//
//    public void setChannel(String channel) {
//        this.channel = channel;
//    }
//
//    public String getTerminalId() {
//        return terminalId;
//    }
//
//    public void setTerminalId(String terminalId) {
//        this.terminalId = terminalId;
//    }
//
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    public String getPaymentLocation() {
//        return paymentLocation;
//    }
//
//    public void setPaymentLocation(String paymentLocation) {
//        this.paymentLocation = paymentLocation;
//    }
//
//    public String getAdditionalInfo() {
//        return additionalInfo;
//    }
//
//    public void setAdditionalInfo(String additionalInfo) {
//        this.additionalInfo = additionalInfo;
//    }
//
//    public String getInquiryInstitutionReference() {
//        return inquiryInstitutionReference;
//    }
//
//    public void setInquiryInstitutionReference(String inquiryInstitutionReference) {
//        this.inquiryInstitutionReference = inquiryInstitutionReference;
//    }
//
//    public String getCreditInstitutionReference() {
//        return creditInstitutionReference;
//    }
//
//    public void setCreditInstitutionReference(String creditInstitutionReference) {
//        this.creditInstitutionReference = creditInstitutionReference;
//    }
//
//    public String getInquiryRemoteResponseCode() {
//        return inquiryRemoteResponseCode;
//    }
//
//    public void setInquiryRemoteResponseCode(String inquiryRemoteResponseCode) {
//        this.inquiryRemoteResponseCode = inquiryRemoteResponseCode;
//    }
//
//    public String getCreditRemoteResponseCode() {
//        return creditRemoteResponseCode;
//    }
//
//    public void setCreditRemoteResponseCode(String creditRemoteResponseCode) {
//        this.creditRemoteResponseCode = creditRemoteResponseCode;
//    }
//
//    public String getInquiryRemoteResponseMessage() {
//        return inquiryRemoteResponseMessage;
//    }
//
//    public void setInquiryRemoteResponseMessage(String inquiryRemoteResponseMessage) {
//        this.inquiryRemoteResponseMessage = inquiryRemoteResponseMessage;
//    }
//
//    public String getCreditRemoteResponseMessage() {
//        return creditRemoteResponseMessage;
//    }
//
//    public void setCreditRemoteResponseMessage(String creditRemoteResponseMessage) {
//        this.creditRemoteResponseMessage = creditRemoteResponseMessage;
//    }
//
//    public String getTsInquiryResponseCode() {
//        return tsInquiryResponseCode;
//    }
//
//    public void setTsInquiryResponseCode(String tsInquiryResponseCode) {
//        this.tsInquiryResponseCode = tsInquiryResponseCode;
//    }
//
//    public String getTsCreditResponseCode() {
//        return tsCreditResponseCode;
//    }
//
//    public void setTsCreditResponseCode(String tsCreditResponseCode) {
//        this.tsCreditResponseCode = tsCreditResponseCode;
//    }
//
//    public String getMiddlewareCreditResponseCode() {
//        return middlewareCreditResponseCode;
//    }
//
//    public void setMiddlewareCreditResponseCode(String middlewareCreditResponseCode) {
//        this.middlewareCreditResponseCode = middlewareCreditResponseCode;
//    }
//
//    public String getAccountName() {
//        return accountName;
//    }
//
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//
//    public String getAccountType() {
//        return accountType;
//    }
//
//    public void setAccountType(String accountType) {
//        this.accountType = accountType;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getAction() {
//        return action;
//    }
//
//    public void setAction(String action) {
//        this.action = action;
//    }
//
//    public String getCountryCode() {
//        return countryCode;
//    }
//
//    public void setCountryCode(String countryCode) {
//        this.countryCode = countryCode;
//    }
//
//    public String getInquiryProcessTime() {
//        return inquiryProcessTime;
//    }
//
//    public void setInquiryProcessTime(String inquiryProcessTime) {
//        this.inquiryProcessTime = inquiryProcessTime;
//    }
//
//    public String getCreditProcessTime() {
//        return creditProcessTime;
//    }
//
//    public void setCreditProcessTime(String creditProcessTime) {
//        this.creditProcessTime = creditProcessTime;
//    }
//
//    public String getCreditRemoteProcessTime() {
//        return creditRemoteProcessTime;
//    }
//
//    public void setCreditRemoteProcessTime(String creditRemoteProcessTime) {
//        this.creditRemoteProcessTime = creditRemoteProcessTime;
//    }
//
//    public String getBankVerificationNumber() {
//        return bankVerificationNumber;
//    }
//
//    public void setBankVerificationNumber(String bankVerificationNumber) {
//        this.bankVerificationNumber = bankVerificationNumber;
//    }
//
//    public String getKycLevel() {
//        return kycLevel;
//    }
//
//    public void setKycLevel(String kycLevel) {
//        this.kycLevel = kycLevel;
//    }
//
//    public String getNarration() {
//        return narration;
//    }
//
//    public void setNarration(String narration) {
//        this.narration = narration;
//    }
//
//    public Double getTransactionAmount() {
//        return transactionAmount;
//    }
//
//    public void setTransactionAmount(Double transactionAmount) {
//        this.transactionAmount = transactionAmount;
//    }
//
//    public Double getCreditTransactionAmount() {
//        return creditTransactionAmount;
//    }
//
//    public void setCreditTransactionAmount(Double creditTransactionAmount) {
//        this.creditTransactionAmount = creditTransactionAmount;
//    }
//
//    public String getChannelCode() {
//        return channelCode;
//    }
//
//    public void setChannelCode(String channelCode) {
//        this.channelCode = channelCode;
//    }
//
//    public Boolean getCanCredit() {
//        return canCredit;
//    }
//
//    public void setCanCredit(Boolean canCredit) {
//        this.canCredit = canCredit;
//    }
}
