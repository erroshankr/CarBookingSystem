package com.online.booking.enums;

public enum PaymentStatus{
        PENDING("Pending"),
        PROCESSING("Processing"),
        SUCCESS("Success"),
        FAILURE("Failure");

    private String name;

    PaymentStatus(String s){
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