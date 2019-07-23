package com.assignmenttask.model;

public class DetailsModel {
    private String dateTime;
    private String transactionType;
    private String transactionID;
    private String amount;

    public DetailsModel(String dateTime, String transactionType,String transactionID, String amount) {
        this.dateTime = dateTime;
        this.transactionType = transactionType;
        this.transactionID = transactionID;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
