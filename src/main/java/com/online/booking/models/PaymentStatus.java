package com.online.booking.models;

import jakarta.persistence.Table;

@Table(name="paymentstatus")
public enum PaymentStatus{
        PENDING,
        PROCESSING,
        SUCCESS,
        FAILURE

    }