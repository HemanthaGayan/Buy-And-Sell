package com.payments.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payments.model.Shipp;

@Repository
public interface ShipRepo  extends JpaRepository<Shipp, Long>{

}
