package com.online.booking.models;

import jakarta.persistence.Table;

@Table(name="paymentmode")
public  enum PaymentMode{
        CASH,
        CREDIT_CARD,
        DEBIT_CARD,
    }