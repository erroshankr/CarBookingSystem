package com.online.booking.repo;

import com.online.booking.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdminRepository extends CrudRepository<Admin,Integer> {

}
