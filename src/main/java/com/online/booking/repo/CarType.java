package com.online.booking.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarType extends CrudRepository<CarType,String> {
}
