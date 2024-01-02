package com.online.booking.models;

import jakarta.persistence.*;

@Entity
@Table(name="reviews")
public class ReviewModel {
    private int rating;
    private String comment;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reviewer", referencedColumnName = "userID")
    private PassengerModel reviewer;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reviewee", referencedColumnName = "userID")
    private DriverModel reviewee;

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

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

    public PassengerModel getReviewer() {
        return reviewer;
    }

    public void setReviewer(PassengerModel reviewer) {
        this.reviewer = reviewer;
    }

    public DriverModel getReviewee() {
        return reviewee;
    }

    public void setReviewee(DriverModel reviewee) {
        this.reviewee = reviewee;
    }
}