package com.online.booking.repo;

import com.online.booking.models.LocationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<LocationModel,Integer> {
}
