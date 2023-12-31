package com.online.booking.enums;

public  enum PaymentMode{
        CASH("Cash"),
        CREDIT_CARD("Credit Card"),
        DEBIT_CARD("Debit card"),
    ;
    private String name;

    PaymentMode(String s){
        this.name=s;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}