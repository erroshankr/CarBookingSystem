package com.online.booking.service.impl;

import com.online.booking.exceptions.TripNotFoundException;
import com.online.booking.models.TripModel;
import com.online.booking.models.UserModel;
import com.online.booking.repo.TripRepository;
import com.online.booking.service.TripService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TripServiceImpl implements TripService {

    private static final Logger LOG = LoggerFactory.getLogger(TripServiceImpl.class);
    @Autowired
    private TripRepository tripRepository;


    @Override
    public  void createTrip(final TripModel trip){
        tripRepository.save(trip);
    }
    @Override
    public void editTripByID(final TripModel tripModel) throws TripNotFoundException {
        Optional<TripModel> option = tripRepository.findById(tripModel.getTripID());
        if(option.isEmpty()){
            throw new TripNotFoundException("No trip found with tripID : " + tripModel.getTripID());
        }

        TripModel trip = option.get();

            trip.setSource(tripModel.getSource());
            trip.setDestination(tripModel.getDestination());
            trip.setDistance(tripModel.getDistance());
            trip.setPickupTime(tripModel.getPickupTime());
            trip.setDropOffTime(tripModel.getDropOffTime());
            trip.setReview(tripModel.getReview());

                tripRepository.save(trip);
    }
    @Override
    public  void deleteTripByID(final int tripID) throws TripNotFoundException{

        Optional<TripModel> option = tripRepository.findById(tripID);
        if(option.isEmpty()){
            throw new TripNotFoundException("No trip found with tripID : " + tripID);
        }

        TripModel trip = option.get();

            tripRepository.deleteById(trip.getTripID());

    }
    @Override
    public TripModel fetchTripByID(final int tripID)throws TripNotFoundException{

        Optional<TripModel> option = tripRepository.findById(tripID);
        if(option.isEmpty())
        {
            throw new TripNotFoundException(" No trip found with ID : " + tripID);
        }
        LOG.info("Trip with ID " + tripID + " found successfully");
        return option.get();
    }

    @Override
    public List<TripModel> fetchAllTrips(){
        List<TripModel> findAll  =  tripRepository.findAll();
        return findAll;

    }
}
