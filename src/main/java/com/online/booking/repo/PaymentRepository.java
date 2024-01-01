package com.online.booking.repo;

import com.online.booking.models.PaymentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentModel,Integer> {
}
