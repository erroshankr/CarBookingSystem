package com.online.booking.models;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="reviews")
public class Review {
    private int rating;
    private String comment;
    @Id
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
