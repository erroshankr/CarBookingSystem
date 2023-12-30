package com.online.booking.models;

import jakarta.persistence.Table;

@Table(name="cartype")
public enum CarType {
    SEDAN,
    HATCHBACK,
    SUV

}
