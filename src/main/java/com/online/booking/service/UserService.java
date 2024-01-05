package com.online.booking.service;

import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void createUser(final UserModel user);

    void updateUserByID(final UserModel userModel) throws UserNotFoundException;


    void deleteUserByID(int userID) throws UserNotFoundException;


    UserModel fetchUserByID(int userID) throws UserNotFoundException;
    List<UserModel>fetchAllUser();

}
