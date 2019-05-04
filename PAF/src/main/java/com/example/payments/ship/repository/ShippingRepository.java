package com.example.payments.ship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.payments.ship.model.Shippingd;

@Repository
public interface ShippingRepository extends JpaRepository<Shippingd, Long> {

}
