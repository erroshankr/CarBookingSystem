package com.online.booking.service;

import com.online.booking.exceptions.PassengerNotFoundException;
import com.online.booking.models.PassengerModel;
import com.online.booking.models.UserModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PassengerService extends UserService{
    void createPassenger(final PassengerModel passenger);
    void updatePassengerByID(final PassengerModel passengerModel) throws PassengerNotFoundException;
    void deletePassengerByID(int userID) throws PassengerNotFoundException;


    PassengerModel fetchPassengerByID(int userID) throws PassengerNotFoundException;
    List<UserModel>fetchAllPassenger();

}
