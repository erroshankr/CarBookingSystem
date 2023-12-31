package com.online.booking.models;

import com.online.booking.enums.TripStatus;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripID;
    private String source;

    private String destination;

    private double distance;

    private Timestamp pickupTime;

    private Timestamp dropOffTime;

    private double fare;

    private int vehicleID;  // foreign key
    private int reviewID;
    private int paymentID;

    private TripStatus status;

    public TripStatus getStatus(){
        return status;
    }

    public void setStatus(TripStatus status) {
        if(status == TripStatus.RUNNING)
            this.status = TripStatus.RUNNING;
        else if(status == TripStatus.COMPLETED)
            this.status = TripStatus.COMPLETED ;
        else
            this.status = TripStatus.INVALID;

    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public Timestamp getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(Timestamp dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public Timestamp getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Timestamp pickupTime) {
        this.pickupTime = pickupTime;
    }


    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }






}
