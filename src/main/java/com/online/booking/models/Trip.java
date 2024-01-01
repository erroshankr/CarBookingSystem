package com.online.booking.models;

import com.online.booking.enums.TripStatus;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripID;      // primary key
    private String source;

    private String destination;

    private double distance;

    private Timestamp pickupTime;

    private Timestamp dropOffTime;

    private double fare;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="vehicle_id",referencedColumnName = "vehicleID")
    private Vehicle vehicle;  // foreign key

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id",referencedColumnName = "reviewID")
    private Review review;    // foreign key

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id",referencedColumnName = "paymentID")
    private Payment payment;   // foreign key

    @Enumerated(EnumType.STRING)
    private TripStatus status;


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


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }
}
