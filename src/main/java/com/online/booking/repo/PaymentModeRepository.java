package com.online.booking.repo;

import com.online.booking.models.PaymentMode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentModeRepository extends CrudRepository<PaymentMode,Long>{
}
