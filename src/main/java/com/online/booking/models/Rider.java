package com.online.booking.models;

import com.online.booking.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "riders")
public class Rider extends User{

    public Rider(){
        this.setRole(UserRole.RIDER);
    }
}
