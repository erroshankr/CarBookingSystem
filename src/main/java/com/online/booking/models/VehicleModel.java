package com.online.booking.models;

import com.online.booking.enums.CarType;
import com.online.booking.enums.Color;
import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class VehicleModel {
    private CarType type;
    private String regNum;
    private Color color;

    @Column(nullable = false)
    private String model;
    private int seatCapacity;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id",referencedColumnName = "userID")
    private DriverModel driver;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id",referencedColumnName = "locationID")
    private LocationModel location;

    @Enumerated(EnumType.STRING)
    private CarType cartype;

    @Enumerated(EnumType.STRING)
    private Color colour;

    public static boolean containsKey(int vehicleID) {
        return false;
    }

    public static void put(int vehicleID) {
    }

    public CarType getCartype() {
        return cartype;
    }

    public void setCartype(CarType cartype) {
        this.cartype = cartype;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }



    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public DriverModel getDriver() {
        return driver;
    }

    public void setDriver(DriverModel driver) {
        this.driver = driver;
    }

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

    public int getId() {
        return 0;
    }
}
