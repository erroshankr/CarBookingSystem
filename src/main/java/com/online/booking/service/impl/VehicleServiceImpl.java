package com.online.booking.service.impl;

import com.online.booking.models.VehicleModel;
import com.online.booking.service.VehicleService;

import java.util.HashMap;
import java.util.Map;

import java.util.List;

public class VehicleServiceImpl  implements VehicleService {
    private Map<Integer, VehicleModel> vehicleDatabase = new HashMap<>();
    @Override
    public void createVehicle(VehicleModel vehicle) {

    }

    @Override
    public void editVehicleByID(int vehicleID) {
        if (VehicleModel.containsKey(vehicleID)) {
            VehicleModel.put(vehicleID);
        } else {
            System.out.println("Error: Vehicle with ID " + vehicleID + " not found.");
        }

    }

    @Override
    public void deleteVehicleByID(int vehicleID) {
        if (vehicleDatabase.containsKey(vehicleID)) {
            vehicleDatabase.remove(vehicleID);
        } else {
            System.out.println("Error: Vehicle with ID " + vehicleID + " not found.");
        }

    }

    @Override
    public VehicleModel fetchVehicleByID(int vehicleID) {
        if (vehicleDatabase.containsKey(vehicleID)) {
            return vehicleDatabase.get(vehicleID);
        } else {
            System.out.println("Error: Vehicle with ID " + vehicleID + " not found.");
            return null;
        }
    }


    @Override
    public List<VehicleModel> fetchAllVehicles() {
        return null;
    }
}
