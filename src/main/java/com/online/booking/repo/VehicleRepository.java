package com.online.booking.repo;

import com.online.booking.models.VehicleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<VehicleModel,Integer> {
}
