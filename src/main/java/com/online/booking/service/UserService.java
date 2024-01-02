package com.online.booking.service;

import com.online.booking.models.LocationModel;
import com.online.booking.models.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void createUser(UserModel userModel);
    LocationModel getCurrentLocation(int userID);

}
