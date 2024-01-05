package com.online.booking.service.impl;

import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.models.PassengerModel;
import com.online.booking.models.UserModel;
import com.online.booking.repo.UserRepository;
import com.online.booking.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;


    @Override
    public void createUser(UserModel user) {
        userRepository.save(user);
    }

    @Override
    public void updateUserByID(UserModel userModel) throws UserNotFoundException {
        Optional<UserModel> option = userRepository.findById(userModel.getUserID());

        if(option.isEmpty()){
            LOG.error("No user found with userID : " + userModel.getUserID());

        }
        UserModel user = option.get();

        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setAddresses(userModel.getAddresses());
        user.setEmail(userModel.getEmail());
        user.setMobNum(userModel.getMobNum());
        userRepository.save(user);

    }


    @Override
    public void deleteUserByID(int userID)throws UserNotFoundException {
        Optional<UserModel> option = userRepository.findById(userID);

        if(option.isEmpty()){
            throw new UserNotFoundException("User not found with ID " + userID );
        }
        UserModel user = option.get();

        userRepository.delete(user);
    }

    @Override
    public UserModel fetchUserByID(int userID) throws UserNotFoundException {
        Optional<UserModel> option = userRepository.findById(userID);
        if (option.isEmpty()) {

            throw new UserNotFoundException("User not found with ID: " + userID);
        }

        LOG.info("User found successfully with ID :" + userID );

        return option.get();
    }

    @Override
    public List<UserModel> fetchAllUser() {

        return userRepository.findAll();
    }



}
