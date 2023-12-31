package com.online.booking.enums;

public enum AddressType {
    HOME("Home"),
    WORK("Work"),
    OTHERS("Others");

   private String name;

   AddressType(String s){
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
