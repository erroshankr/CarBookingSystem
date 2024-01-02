package com.online.booking.service.impl;

import com.online.booking.service.PassengerService;

public class PassengerServiceImpl extends UserServiceImpl implements PassengerService {
    @Override
    public int findTotalRides(int riderID) {
        return 0;
    }

    public static void main(String[] args) {
        PassengerService passengerService = new PassengerServiceImpl();
     //   riderService.findTotalRides(riderID);
    }
}
