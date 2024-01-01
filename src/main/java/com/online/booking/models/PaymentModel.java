package com.online.booking.models;

import com.online.booking.enums.PaymentMode;
import com.online.booking.enums.PaymentStatus;
import jakarta.persistence.*;

@Entity
@Table(name="payments")
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PaymentID", unique = true)
    private  int paymentID;
    private PaymentMode paymentMode;
    private PaymentStatus status;
    private int amount;

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



}
