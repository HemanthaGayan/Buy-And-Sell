package com.payments.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payments.exception.ResourceNotFoundException;
import com.payments.model.Shipp;
import com.payments.repo.ShipRepo;

@RestController
@RequestMapping("/api/v2")
public class ShipController {
	
	
	@Autowired
	private ShipRepo shiprepo;
	
	@GetMapping("/ship")
	public List<Shipp> getAllShippDetails(){
		
		
		return shiprepo.findAll();
		
		
	}
	
	@GetMapping("/ship/{shipId}")
	public ResponseEntity<Shipp> getShippDetailById(@PathVariable(value="shipId") Long shipId) throws ResourceNotFoundException{
		
		Shipp ship = shiprepo.findById(shipId) .orElseThrow(() -> new ResourceNotFoundException("Payment  not found on :: "+ shipId));
		
		 return ResponseEntity.ok().body(ship);
		
	}
	
	@PostMapping("/ship")
	public Shipp createShipPayment(@Valid @RequestBody Shipp ship) {
		
		return shiprepo.save(ship);
		
		
	}
	
	@PutMapping("/ship/{shipId}")
	public ResponseEntity<Shipp> updateShipDetail(@PathVariable(value="shipId") Long shipId,@Valid @RequestBody Shipp shipdetail)throws ResourceNotFoundException{
		
		Shipp shipk = shiprepo.findById(shipId).orElseThrow(() -> new ResourceNotFoundException("User not found on :: "+ shipId));
		
		shipk.setDate_shipped(shipdetail.getDate_shipped());
		
		shipk.setShipping_amount(shipdetail.getShipping_amount());
		shipk.setOrderId(shipdetail.getOrderId());
		shipk.setUpdatedAt(new Date());
		
		final Shipp shipupdater = shiprepo.save(shipk);
		
		return ResponseEntity.ok(shipupdater);
		
		
	}
	
	@DeleteMapping("/ship/{shipId}")
	public Map<String, Boolean> deleteShip(@PathVariable(value="shipId") Long shipId)throws Exception{
		
		Shipp ship = shiprepo.findById(shipId).orElseThrow(() -> new ResourceNotFoundException("User not found on :: "+ shipId));
		
		
		shiprepo.delete(ship);;
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", true);
		return response;
		
	}

}
