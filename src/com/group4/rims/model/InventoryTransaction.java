
package com.group4.rims.model;

public class InventoryTransaction {

    private int transactionId;
    private int ingredientId;
    private int staffId;
    private String transactionType;
    private int quantity;
    private String transactionDate;
    private String remarks;
    
    public InventoryTransaction (){
        
    }

    public InventoryTransaction(int transactionId, int ingredientId, int staffId, 
                                String transactionType, int quantity, String transactionDate, 
                                String remarks) {
        
        this.transactionId = transactionId;
        this.ingredientId = ingredientId;
        this.staffId = staffId;
        this.transactionType = transactionType;
        this.quantity = quantity;
        this.transactionDate = transactionDate;
        this.remarks = remarks;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
}
