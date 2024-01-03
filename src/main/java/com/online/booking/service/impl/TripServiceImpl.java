package com.online.booking.service.impl;

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
    private TripRepository tripRepo;
    @Autowired
    private TripModel tripModel;


    public  TripModel createTrip(TripModel trip){
        tripRepo.save(trip);
        LOG.info("Created a new trip successfully");
        return trip;
    }

    public boolean editTripByID(int tripID){
        Optional<TripModel> updateTrip = tripRepo.findById(tripModel.getTripID());
        if(updateTrip.isEmpty()){
            LOG.error("No trip found with tripID : " + tripModel.getTripID());
            return false;
        }
        boolean result = false;
        TripModel trip = updateTrip.get();

            trip.setSource(tripModel.getSource());
            trip.setDestination(tripModel.getDestination());
            trip.setDistance(tripModel.getDistance());
            trip.setPickupTime(tripModel.getPickupTime());
            trip.setDropOffTime(tripModel.getDropOffTime());
            trip.setReview(tripModel.getReview());
            try {
                tripRepo.save(trip);
                LOG.info("Updated successfully");
                result = true;
            }catch(Exception e)
            {
                LOG.error("Exception occurred while saving trip with ID " + tripModel.getTripID());
                result = false;
            }

        return result ;
    }

    public  boolean deleteTripByID(int tripID){
        Optional<TripModel> deleteTrip = tripRepo.findById(tripModel.getTripID());
        if(deleteTrip.isEmpty()){
            LOG.error("No trip found with tripID : " + tripModel.getTripID());
            return false;
        }
        boolean result = false;
        TripModel trip = deleteTrip.get();
          try{
            tripRepo.deleteById(trip.getTripID());
            LOG.info("Trip with " + trip.getTripID() + " deleted successfully");
            result = true ;
          }catch(Exception e){
              LOG.error("Exception occurred while saving trip with ID " + trip.getTripID());
              result = false;

          }
        return result ;
    }

    public TripModel fetchTripByID(int tripID){
        TripModel findTrip = tripRepo.findById(tripModel.getTripID()).orElse(null);
        if(findTrip != null)
        {
            LOG.info("Found Successfully " + findTrip.getTripID());
            return findTrip;
        }
        return null;
    }


    public List<TripModel> fetchAllTrips(){
        List<TripModel> findAll  = (List<TripModel>) tripRepo.findAll();
        return findAll;

    }
}
