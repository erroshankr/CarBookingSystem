package com.online.booking.models;

import com.online.booking.enums.TripStatus;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "trips")
public class TripModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripID;      // primary key

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="source_id",referencedColumnName = "locationID")
    private LocationModel source;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dest_id",referencedColumnName = "locationID")
    private LocationModel destination;

    private double distance;

    private Timestamp pickupTime;

    private Timestamp dropOffTime;

    private double fare;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="driver_id",referencedColumnName = "userID")
    private DriverModel driver;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="passenger_id",referencedColumnName = "userID")
    private PassengerModel passenger;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="vehicle_id",referencedColumnName = "vehicleID")
    private VehicleModel vehicle;  // foreign key

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id",referencedColumnName = "reviewID")
    private ReviewModel review;    // foreign key

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id",referencedColumnName = "paymentID")
    private PaymentModel payment;   // foreign key

    @Enumerated(EnumType.STRING)
    private TripStatus status;


    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public LocationModel getSource() {
        return source;
    }

    public void setSource(LocationModel source) {
        this.source = source;
    }

    public LocationModel getDestination() {
        return destination;
    }

    public void setDestination(LocationModel destination) {
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


    public VehicleModel getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleModel vehicle) {
        this.vehicle = vehicle;
    }

    public ReviewModel getReview() {
        return review;
    }

    public void setReview(ReviewModel review) {
        this.review = review;
    }

    public PaymentModel getPayment() {
        return payment;
    }

    public void setPayment(PaymentModel payment) {
        this.payment = payment;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public DriverModel getDriver() {
        return driver;
    }

    public void setDriver(DriverModel driver) {
        this.driver = driver;
    }

    public PassengerModel getPassenger() {
        return passenger;
    }

    public void setPassenger(PassengerModel passenger) {
        this.passenger = passenger;
    }
}
