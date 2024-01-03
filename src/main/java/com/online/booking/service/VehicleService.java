package com.online.booking.service;

import com.online.booking.models.VehicleModel;
import com.online.booking.exceptions.VehicleNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface VehicleService {
    void createVehicle(final VehicleModel vehicle);
    void editVehicleByID(final VehicleModel vehicleModel) throws VehicleNotFoundException, SQLException;
    void deleteVehicleByID(final int vehicleID) throws VehicleNotFoundException;
    VehicleModel fetchVehicleByID(final int vehicleID) throws VehicleNotFoundException;
    List<VehicleModel> fetchAllVehicles ();
}
