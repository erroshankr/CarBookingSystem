package com.online.booking.service;

import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.models.PassengerModel;
import com.online.booking.models.UserModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PassengerService extends UserService{
    void createPassenger(final PassengerModel passenger);
    void updatePassengerByID(final PassengerModel passengerModel) throws UserNotFoundException;
    void deletePassengerByID(int userID) throws UserNotFoundException;


    PassengerModel fetchPassengerByID(int userID) throws UserNotFoundException;
    List<UserModel>fetchAllPassenger();

}
