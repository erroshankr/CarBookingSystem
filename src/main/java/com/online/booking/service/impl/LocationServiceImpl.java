package com.online.booking.service.impl;

import com.online.booking.models.LocationModel;
import com.online.booking.service.LocationService;

public class LocationServiceImpl implements LocationService {

    @Override
    public double calculateDistance(final LocationModel source, final LocationModel destination) {
        return Math.sqrt(Math.pow(destination.getLongitude()- source.getLongitude(),2) + Math.pow(destination.getLatitude()- source.getLatitude(),2));
    }
}
