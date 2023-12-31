package com.online.booking.repo;

import com.online.booking.models.TripModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<TripModel,Integer> {
    List<TripModel> findAllByDriver(int driverID);
    TripModel findByID(int tripID);

}

