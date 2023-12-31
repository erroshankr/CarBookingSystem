package com.online.booking.models;

import jakarta.persistence.*;

@Entity
@Table(name="reviews")
public class Review {
    private int rating;
    private String comment;


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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewId;

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

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

}
