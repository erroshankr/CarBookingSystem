package com.online.booking.service;

import com.online.booking.exceptions.TripNotFoundException;
import com.online.booking.exceptions.UserNotFoundException;
import com.online.booking.exceptions.VehicleNotFoundException;
import com.online.booking.models.TripModel;
import com.online.booking.models.VehicleModel;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface TripService {

    void createTrip(final TripModel trip);

    void editTripByID(final TripModel tripModel) throws TripNotFoundException;

    void deleteTripByID(final int tripID) throws TripNotFoundException;

    TripModel fetchTripByID(final int tripID)throws TripNotFoundException;

    List<TripModel> fetchAllTrips();

    List<TripModel> fetchAllTripsByDriverID(final int driverID) throws UserNotFoundException;

}
