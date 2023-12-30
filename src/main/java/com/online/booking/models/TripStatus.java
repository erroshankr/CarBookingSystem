package com.online.booking.models;

import jakarta.persistence.Table;

@Table(name = "tripstatus")
public enum TripStatus {
    COMPLETED,
    RUNNING,
    INVALID


}
