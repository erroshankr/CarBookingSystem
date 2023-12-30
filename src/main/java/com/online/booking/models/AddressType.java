package com.online.booking.models;

import jakarta.persistence.Table;

@Table(name ="addressestypes")
public enum AddressType {
    HOME,
    WORK,
    OTHERS
}
