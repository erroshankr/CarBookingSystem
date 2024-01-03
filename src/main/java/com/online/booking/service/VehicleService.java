package com.online.booking.service;

import com.online.booking.models.VehicleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {
    void createVehicle(VehicleModel vehicle);
    boolean editVehicleByID(int vehicleID);
    boolean deleteVehicleByID(int vehicleID);
    boolean fetchVehicleByID(int vehicleID);
    List<VehicleModel> fetchAllVehicles();
}
