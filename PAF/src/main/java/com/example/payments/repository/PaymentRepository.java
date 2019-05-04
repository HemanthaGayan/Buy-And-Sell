package com.example.payments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.payments.model.Payments;

@Repository
public interface PaymentRepository  extends JpaRepository<Payments, Long>{


}
