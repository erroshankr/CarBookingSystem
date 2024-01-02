package com.online.booking.service;

import org.springframework.stereotype.Service;

@Service
public interface PassengerService extends UserService{

    int findTotalRides(int riderID);
}
