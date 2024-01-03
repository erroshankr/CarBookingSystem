package com.online.booking.service;

import com.online.booking.models.VehicleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {
    void createVehicle(final VehicleModel vehicle);
    boolean editVehicleByID(final VehicleModel vehicleModel);
    boolean deleteVehicleByID(final int vehicleID);
    boolean fetchVehicleByID(final int vehicleID);
    List<VehicleModel> fetchAllVehicles();
}
