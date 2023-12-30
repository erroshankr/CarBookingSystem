package com.online.booking.repo;

import com.online.booking.models.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends CrudRepository<Color,String> {
}
