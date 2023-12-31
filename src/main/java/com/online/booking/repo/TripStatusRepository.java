package com.online.booking.repo;

import com.online.booking.models.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripStatusRepository extends CrudRepository<Trip,Integer> {
}
