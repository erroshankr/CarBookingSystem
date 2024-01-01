package com.online.booking.models;

import jakarta.persistence.*;

@Entity
@Table(name="reviews")
public class Review {
    private int rating;
    private String comment;


    private int reviewerID;

    private int revieweeID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reviewer",referencedColumnName = "userID")
    private Rider rider;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reviewee",referencedColumnName = "userID")
    private Driver driver;

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getReviewerID() {
        return reviewerID;
    }


    public void setReviewerID(int reviewerID) {
        this.reviewerID = reviewerID;
    }

    public int getRevieweeID() {
        return revieweeID;
    }

    public void setRevieweeID(int revieweeID) {
        this.revieweeID = revieweeID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewID;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

}
