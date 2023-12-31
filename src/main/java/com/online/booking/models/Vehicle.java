package com.online.booking.models;

import com.online.booking.enums.CarType;
import com.online.booking.enums.Color;
import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    private CarType type;
    private String regNum;
    private Color color;



    private String model;
    private int seatCapacity;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleID;
    private int driverID;
    private int locationID;
    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }




}
