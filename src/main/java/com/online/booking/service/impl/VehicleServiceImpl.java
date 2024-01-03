package com.online.booking.service.impl;


import com.online.booking.models.VehicleModel;
import com.online.booking.repo.VehicleRepository;
import com.online.booking.service.VehicleService;

import com.online.booking.exceptions.VehicleNotFoundException;
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
       vehicleRepository.save(vehicle);
    }

    @Override
    public void editVehicleByID(final VehicleModel vehicleModel) throws VehicleNotFoundException {
        Optional<VehicleModel> option = vehicleRepository.findById(vehicleModel.getVehicleID());
        // SELECT * from vehicles where vehicleID=12;
        if(option.isEmpty()){
            throw new VehicleNotFoundException("No user found with userID : " + vehicleModel.getVehicleID());
        }
        VehicleModel vehicle = option.get();
        vehicle.setCartype(vehicleModel.getCartype());
        vehicle.setColour(vehicleModel.getColour());
        vehicle.setDriver(vehicleModel.getDriver());
        vehicle.setSeatCapacity(vehicleModel.getSeatCapacity());
        vehicle.setModel(vehicleModel.getModel());
        vehicle.setRegNum(vehicleModel.getRegNum());

        vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicleByID(final int vehicleID) throws VehicleNotFoundException {

        Optional<VehicleModel> option = vehicleRepository.findById(vehicleID);

        if(option.isEmpty()){
            throw new VehicleNotFoundException("Vehicle with ID " + vehicleID + " not found");
        }
        VehicleModel vehicle = option.get();
        // delete vehicle from DB
        vehicleRepository.delete(vehicle);
    }

    @Override
    public VehicleModel fetchVehicleByID(final int vehicleID) throws VehicleNotFoundException {

        Optional<VehicleModel> option = vehicleRepository.findById(vehicleID);
        if (option.isEmpty()) {
            // return null; // 1st approach
            // throw a custom exception
            throw new VehicleNotFoundException("No vehicle found with ID: " + vehicleID);
        }

        LOG.info("Vehicle with ID " + vehicleID + " found successfully");
        return option.get();
    }

    @Override
    public List<VehicleModel> fetchAllVehicles() {
        return vehicleRepository.findAll(); // SELECT * from vehicles;
    }
}

// JPARepo(C) --> ListCrudRepo(P) --> CRUDRepo(GP)
