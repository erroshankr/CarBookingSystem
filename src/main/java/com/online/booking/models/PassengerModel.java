package com.online.booking.models;

import com.online.booking.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "riders")
public class PassengerModel extends UserModel {

    public PassengerModel(){
        this.setRole(UserRole.RIDER);
    }
}
