package com.online.booking.models;

import com.online.booking.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

public class DriverModel extends UserModel {

    public DriverModel(){
        this.setRole(UserRole.DRIVER);
    }
}
