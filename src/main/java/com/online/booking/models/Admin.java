package com.online.booking.models;

public class Admin extends User{

    public Admin(){
        this.setRole(UserRole.ADMIN);
    }
}
