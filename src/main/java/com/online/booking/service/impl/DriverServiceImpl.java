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

import java.util.List;
import java.util.Optional;

public class DriverServiceImpl extends UserServiceImpl implements DriverService  {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TripService tripService;

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
