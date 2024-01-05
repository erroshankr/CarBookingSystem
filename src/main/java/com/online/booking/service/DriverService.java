package com.online.booking.service;

import com.online.booking.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public interface DriverService extends UserService{

    double findTotalEarning(int driverID, Timestamp duration) throws UserNotFoundException;
}
