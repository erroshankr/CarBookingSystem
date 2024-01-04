package com.online.booking.service.impl;

import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.models.PassengerModel;
import com.online.booking.service.DriverService;

public class DriverServiceImpl extends UserServiceImpl implements DriverService  {

    @Override
    public double findTotalEarnings(int driverID) {
        return 0;
    }


    public static void main(String[] args) {
        DriverService driverService = new DriverServiceImpl();
     //   driverService.findTotalEarnings();
     //   driverService.createUser(UserModel);

    }

    @Override
    public void createUser(PassengerModel passenger) {

    }

    @Override
    public void updateUserByID(PassengerModel passengerModel) throws UserNotFoundException {

    }
}
