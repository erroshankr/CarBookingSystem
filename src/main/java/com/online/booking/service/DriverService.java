package com.online.booking.service;

import com.online.booking.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface DriverService extends UserService{

    double findTotalEarning(int driverID) throws UserNotFoundException;
}
