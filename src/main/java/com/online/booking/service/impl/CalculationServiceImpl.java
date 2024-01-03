package com.online.booking.service.impl;
import com.online.booking.enums.CarType;
import com.online.booking.models.LocationModel;
import com.online.booking.models.UserModel;
import com.online.booking.service.CalculationService;

public class CalculationServiceImpl implements CalculationService {
  @Override
  public double calculateTotalFare(int sourceLocID, int destLocID, CarType carType) {
    double farePerKilometer;

    // Determine the fare rate based on the car type
    switch (carType) {
      case HATCHBACK:
        farePerKilometer = FARE_PER_KILOMETER_HATCHBACK;
        break;
      case SEDAN:
        farePerKilometer = FARE_PER_KILOMETER_SEDAN;
        break;
      case SUV:
        farePerKilometer = FARE_PER_KILOMETER_SUV;
        break;
      default:
        throw new IllegalArgumentException("Invalid car type");
    }

    int distance = calculateDistance(sourceLocID, destLocID);
    double totalFare = distance * farePerKilometer;

    return totalFare;
  }

  private int calculateDistance(int sourceLocID, int destLocID) {
    return Math.abs(destLocID - sourceLocID);
  }
  @Override
  public double findTotalEarning(int driverID) {
    return 0;
  }
}

