package com.online.booking.service;

import com.online.booking.models.VehicleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {
    void createVehicle(VehicleModel vehicle);
    void editVehicleByID(int vehicleID);
    void deleteVehicleByID(int vehicleID);
    VehicleModel fetchVehicleByID(int vehicleID);
    List<VehicleModel> fetchAllVehicles();
}
