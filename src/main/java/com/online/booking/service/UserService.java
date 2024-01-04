package com.online.booking.service;

import com.online.booking.models.LocationModel;
import com.online.booking.models.PassengerModel;
import com.online.booking.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void createUser(UserModel user);
    boolean updateUserByID(final UserModel userModel);
    boolean deleteUserByID(int userID);
    List<UserModel> fetchAllPassenger();

}



//