package com.online.booking.models;

import jakarta.persistence.*;

@Entity
@Table(name="reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewID;
    private int rating;
    private String comment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reviewer", referencedColumnName = "userID")
    private Rider reviewer;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reviewee", referencedColumnName = "userID")
    private Driver reviewee;

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

    public Rider getReviewer() {
        return reviewer;
    }

    public void setReviewer(Rider reviewer) {
        this.reviewer = reviewer;
    }

    public Driver getReviewee() {
        return reviewee;
    }

    public void setReviewee(Driver reviewee) {
        this.reviewee = reviewee;
    }
}