package com.online.booking.repo;

import com.online.booking.models.CarType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTypeRepository extends CrudRepository<CarType,String> {
}
