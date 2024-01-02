package com.online.booking.service.impl;

import com.online.booking.models.UserModel;
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
}
