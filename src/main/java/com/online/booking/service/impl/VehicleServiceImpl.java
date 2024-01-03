package com.online.booking.service.impl;

import com.online.booking.models.VehicleModel;
import com.online.booking.service.VehicleService;


import java.util.List;

public class VehicleServiceImpl  implements VehicleService {
    private int lastVehicleID = -1;


    @Override
    public void createVehicle(VehicleModel vehicle) {

    }

    @Override
    public boolean editVehicleByID(int vehicleID) {
        if(vehicleID <= lastVehicleID && vehicleID >= 0) {

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteVehicleByID(int vehicleID) {
        if (vehicleID <= lastVehicleID && vehicleID >= 0) {

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean fetchVehicleByID(int vehicleID) {
        if (vehicleID <= lastVehicleID && vehicleID >= 0) {

            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<VehicleModel> fetchAllVehicles() {
        return null;
    }
}
