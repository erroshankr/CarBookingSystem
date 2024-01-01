package com.online.booking.models;

import com.online.booking.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "riders")
public class RiderModel extends UserModel {

    public RiderModel(){
        this.setRole(UserRole.RIDER);
    }
}
