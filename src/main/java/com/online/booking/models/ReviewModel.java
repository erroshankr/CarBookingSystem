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
    private UserModel reviewer;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reviewee", referencedColumnName = "userID")
    private UserModel reviewee;
    private int reviewerID;

    private int revieweeID;

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

    public UserModel getReviewer() {
        return reviewer;
    }

    public void setReviewer(RiderModel reviewer) {
        this.reviewer = reviewer;
    }

    public UserModel getReviewee() {
        return reviewee;
    }

    public void setReviewee(DriverModel reviewee) {
        this.reviewee = reviewee;
    }
}