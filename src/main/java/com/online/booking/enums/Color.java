package com.online.booking.enums;

public enum Color {
    RED("Red"),
    BLACK("Black"),
    WHITE("Write"),
    GREEN("Green"),
    YELLOW("Yellow"),
    BLUE("Blue");
    private String name;

    Color(String s){
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
