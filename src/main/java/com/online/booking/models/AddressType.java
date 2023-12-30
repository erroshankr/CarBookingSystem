package com.online.booking.models;

import jakarta.persistence.Table;

@Table(name ="addresstypes")
public enum AddressType {
    HOME,
    WORK,
    OTHERS
}
