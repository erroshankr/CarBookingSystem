package com.online.booking.repo;

import com.online.booking.models.PaymentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentStatusRepository extends CrudRepository<PaymentStatus,String>{
}
