package com.online.booking.service.impl;

import com.online.booking.models.UserModel;
import com.online.booking.repo.UserRepository;
import com.online.booking.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(UserModel user) {

    }

    @Override
    public boolean updateUserByID(final UserModel userModel) {

        // find if user is present in DB or not.. // SELECT * from users where userID = 12;
        Optional<UserModel> option = userRepository.findById(userModel.getUserID());
        // if user not present
        if(option.isEmpty()){
            LOG.error("No user found with userID : " + userModel.getUserID());
            return false;
        }



        boolean result = false;
        // fetch user that is present by given ID
        UserModel user = option.get();
        // update required fields
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setAddresses(userModel.getAddresses());
        user.setEmail(userModel.getEmail());
        user.setMobNum(userModel.getMobNum());

        try {
            // save updated user to DB
            userRepository.save(user);
            LOG.info("User with " + userModel.getUserID() + " updated successfully");
            result = true;
        }catch (Exception ex){
            LOG.error("Exception occurred while saving user with ID " + userModel.getUserID());
            result = false;
        }
        return result;
    }

    @Override
    public boolean deleteUserByID(int userID) {
        return false;
    }

    @Override
    public List<UserModel> fetchAllPassenger() {
        return null;
    }
}
