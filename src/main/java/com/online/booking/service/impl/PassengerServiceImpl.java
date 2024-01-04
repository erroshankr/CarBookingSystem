package com.online.booking.service.impl;

import com.online.booking.enums.UserRole;
import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.models.PassengerModel;
import com.online.booking.models.UserModel;
import com.online.booking.repo.UserRepository;
import com.online.booking.service.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PassengerServiceImpl extends UserServiceImpl implements PassengerService {
    private static final Logger LOG = LoggerFactory.getLogger( PassengerServiceImpl.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public void createPassenger(final PassengerModel passenger) {
        passenger.setRole(UserRole.RIDER);
        userRepository.save(passenger);
    }

    @Override
    public void updatePassengerByID(PassengerModel passengerModel) throws UserNotFoundException {
        Optional<UserModel> option = userRepository.findById(passengerModel.getUserID());

        if(option.isEmpty()){
            LOG.error("No user found with userID : " + passengerModel.getUserID());

        }
        UserModel user = option.get();

        user.setFirstName(passengerModel.getFirstName());
        user.setLastName(passengerModel.getLastName());
        user.setAddresses(passengerModel.getAddresses());
        user.setEmail(passengerModel.getEmail());
        user.setMobNum(passengerModel.getMobNum());
        userRepository.save(user);

    }

    @Override
    public void deletePassengerByID(int userID) throws UserNotFoundException {
        Optional<UserModel> option = userRepository.findById(userID);

        if(option.isEmpty()){
            throw new UserNotFoundException("Passenger not found with ID " + userID );
        }
        UserModel passenger = option.get();

        userRepository.delete(passenger);
    }

    @Override
    public PassengerModel fetchPassengerByID(int userID) throws UserNotFoundException {
        Optional<UserModel> option = userRepository.findById(userID);
        if (option.isEmpty()) {

            throw new UserNotFoundException("Passenger not found with ID: " + userID);
        }

        LOG.info("Passenger  found successfully with ID :" + userID );
        return (PassengerModel) option.get();
    }


    @Override
    public List<UserModel> fetchAllPassenger() {
        return userRepository.findAll();
    }


    public int findTotalRides(int riderID) {
        return 0;
    }
}
