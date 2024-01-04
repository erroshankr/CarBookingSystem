package com.online.booking.service;

import com.online.booking.models.LocationModel;
import org.springframework.stereotype.Service;

@Service
public interface LocationService {

    double calculateDistance(final LocationModel source, final LocationModel destination);
}
