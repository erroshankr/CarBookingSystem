package com.online.booking.service;

import com.online.booking.models.TripModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TripService {

    TripModel createTrip(TripModel trip);

    boolean editTripByID(int tripID);

    boolean deleteTripByID(int tripID);

    TripModel fetchTripByID(int tripID);

    List<TripModel> fetchAllTrips();

}
