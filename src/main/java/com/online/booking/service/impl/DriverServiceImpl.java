package com.online.booking.service.impl;

import com.online.booking.enums.UserRole;
import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.models.DriverModel;
import com.online.booking.models.TripModel;
import com.online.booking.models.UserModel;
import com.online.booking.repo.UserRepository;
import com.online.booking.service.DriverService;
import com.online.booking.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public class DriverServiceImpl extends UserServiceImpl implements DriverService  {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TripService tripService;

    @Override
    public double findTotalEarning(int driverID, Timestamp duration) throws UserNotFoundException {
        // find total earning of a driver today.
        // driverID -> driverModel : not working
        // driverID,timestamp :  All Trips by a driver
         // SELECT * from trips where driver_id = 123 and dropofftime = duration;(last 2 day) -->> all trips by driver : Not working
        // SELECT SUM(FARE) from trips where driver_id = 123 AND dropOddTime < 1day;
        // tripStatus= completed
        // SELECT SUM(FARE) from trips where driver_id = 123 AND DATE(dropOddTime) = CURDATE(); --> HW
        return 0;
    }

    // 12.05AM : 5th Jan
    // 2AM : 5th jan
    // 8PM : 5thjan

}
