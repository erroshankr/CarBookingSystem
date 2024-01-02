package com.online.booking.models;

import jakarta.persistence.*;

@Entity
@Table(name="locations")
public class LocationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationID;
    private double latitude;
    private double longitude;


    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

