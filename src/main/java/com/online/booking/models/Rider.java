package com.online.booking.models;

public class Rider extends User{

    public Rider(){
        this.setRole(UserRole.RIDER);
    }
}
