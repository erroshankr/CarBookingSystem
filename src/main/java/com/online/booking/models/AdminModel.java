package com.online.booking.models;

import com.online.booking.enums.UserRole;

public class AdminModel extends UserModel {

    public AdminModel(){
        this.setRole(UserRole.ADMIN);
    }
}
