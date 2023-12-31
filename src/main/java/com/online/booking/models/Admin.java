package com.online.booking.models;

import com.online.booking.enums.UserRole;

public class Admin extends User{

    public Admin(){
        this.setRole(UserRole.ADMIN);
    }
}
