package com.online.booking.repo;

import com.online.booking.models.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripStatusRepository extends CrudRepository<Trip,Integer> {
}
