package com.online.booking.models;

import com.online.booking.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "drivers")
public class Driver extends User{

    public Driver(){
        this.setRole(UserRole.DRIVER);
    }
}
