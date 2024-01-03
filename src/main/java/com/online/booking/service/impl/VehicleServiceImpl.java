package com.online.booking.service.impl;


import com.online.booking.models.VehicleModel;
import com.online.booking.repo.VehicleRepository;
import com.online.booking.service.VehicleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
import java.util.Optional;



public class VehicleServiceImpl  implements VehicleService {
    private static final Logger LOG = LoggerFactory.getLogger( VehicleServiceImpl .class);
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void createVehicle(final VehicleModel vehicle) {
        try {

            vehicleRepository.save(vehicle);
            LOG.info("Vehicle created successfully with ID: " + vehicle.getVehicleID());
        } catch (Exception ex) {
            LOG.error("Exception occurred while creating a new vehicle");

        }

    }

    @Override
    public boolean editVehicleByID(final VehicleModel vehicleModel) {
        Optional<VehicleModel> option = vehicleRepository.findById(vehicleModel.getVehicleID());

        if(option.isEmpty()){
            LOG.error("No user found with userID : " + vehicleModel.getVehicleID());
            return false;
        }
        boolean result = false;
        VehicleModel vehicle = option.get();
        vehicle.setCartype(vehicleModel.getCartype());
        vehicle.setColour(vehicleModel.getColour());
        vehicle.setDriver(vehicleModel.getDriver());
        vehicle.setSeatCapacity(vehicleModel.getSeatCapacity());
        vehicle.setModel(vehicleModel.getModel());
        vehicle.setRegNum(vehicleModel.getRegNum());
        try {

            vehicleRepository.save(vehicle);
            LOG.info("Vehicle with " + vehicleModel.getVehicleID() + " updated successfully");
            result = true;
        }catch (Exception ex){
            LOG.error("Exception occurred while saving vehicle with ID " + vehicleModel.getVehicleID());
            result = false;
        }
        return result;
    }

    @Override
    public boolean deleteVehicleByID(final int vehicleID) {

        Optional<VehicleModel> option = vehicleRepository.findById(vehicleID);

        if(option.isEmpty()){
            LOG.error("No vehicle found with ID: " + vehicleID);
            return false;
        }
        boolean result = false;

        VehicleModel vehicle = option.get();
        try {
            // delete vehicle from DB
            vehicleRepository.delete(vehicle);
            LOG.info("Vehicle with ID " + vehicleID + " deleted successfully");
            result = true;
        } catch (Exception ex) {
            LOG.error("Exception occurred while deleting vehicle with ID " + vehicleID);
            result = false;
        }
        return result;
    }

    @Override
    public boolean fetchVehicleByID(final int vehicleID) {
        Optional<VehicleModel> option = vehicleRepository.findById(vehicleID);

        if (option.isEmpty()) {
            LOG.error("No vehicle found with ID: " + vehicleID);
            return false;
        }
        LOG.info("Vehicle with ID " + vehicleID + " found successfully");
        return true;
    }

    @Override
    public List<VehicleModel> fetchAllVehicles() {
        return null;
    }
}
