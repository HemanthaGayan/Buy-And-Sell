package com.payments.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payments.model.Payments;

@Repository
public interface PaymentsRepo extends JpaRepository<Payments, Long> {

}
