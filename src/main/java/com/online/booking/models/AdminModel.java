package com.online.booking.models;

import com.online.booking.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "admins")
public class AdminModel extends UserModel {

    public AdminModel(){
        this.setRole(UserRole.ADMIN);
    }
}
