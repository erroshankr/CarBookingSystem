package com.online.booking.service;

import com.online.booking.enums.CarType;
import com.online.booking.exceptions.InvalidLocationException;
import org.springframework.stereotype.Service;

@Service
public interface CalculationService
{
    double FARE_PER_KILOMETER_HATCHBACK = 8;
    double FARE_PER_KILOMETER_SEDAN = 10;
    double FARE_PER_KILOMETER_SUV = 12;

    double calculateTotalFare(int sourceLocID, int destLocID, CarType type) throws InvalidLocationException;

}
