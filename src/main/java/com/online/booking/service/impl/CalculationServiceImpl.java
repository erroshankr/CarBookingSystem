package com.online.booking.service.impl;
import com.online.booking.enums.CarType;
import com.online.booking.enums.UserRole;
import com.online.booking.exceptions.InvalidLocationException;
import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.models.DriverModel;
import com.online.booking.models.LocationModel;
import com.online.booking.models.TripModel;
import com.online.booking.models.UserModel;
import com.online.booking.repo.LocationRepository;
import com.online.booking.repo.UserRepository;
import com.online.booking.service.CalculationService;
import com.online.booking.service.LocationService;
import com.online.booking.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CalculationServiceImpl implements CalculationService {

  @Autowired
  private LocationRepository locationRepository;
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private LocationService locationService;

  @Autowired
  private TripService tripService;

  @Override
  public double calculateTotalFare(int sourceLocID, int destLocID, CarType carType) throws InvalidLocationException {

    Optional<LocationModel> option1 = locationRepository.findById(sourceLocID);
    Optional<LocationModel> option2 = locationRepository.findById(destLocID);m6n
    double farePerKilometer;
    // Determine the fare rate based on the car type6jbthyfjt7d
    List<TripModel> trips = tripService.fetchAllTripsByDriverID(driver.getUserID());
    double sum = 0.0;
    for (TripModel trip: trips) {
       sum += trip.getFare();
    }dt byjtjdtvjuvjr
    return sum;
  }
}

