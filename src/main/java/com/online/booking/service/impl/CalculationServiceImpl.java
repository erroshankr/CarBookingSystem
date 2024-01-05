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
    Optional<LocationModel> option2 = locationRepository.findById(destLocID);

    if (!option1.isPresent() || !option2.isPresent()){
      throw new InvalidLocationException("Invalid source or destination");
    }

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

    double distance = locationService.calculateDistance(option1.get(), option2.get());
    return (distance * farePerKilometer);
  }


  @Override
  public double findTotalEarning(int driverID) throws UserNotFoundException {
    // SELECT SUM(FARE) from trips where driver_id= driverID;
    Optional<UserModel> user = userRepository.findByIdAndRole(driverID, UserRole.DRIVER);
    if (user.isEmpty()){
      throw new UserNotFoundException("Invalid UserID");
    }
    final DriverModel driver = (DriverModel) user.get();
    List<TripModel> trips = tripService.fetchAllTripsByDriverID(driver.getUserID());
    double sum = 0.0;
    for (TripModel trip: trips) {
       sum += trip.getFare();
    }
    return sum;
  }
}

