package com.example.payments.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payments.exception.ResourceNotFoundException;
import com.example.payments.model.Payments;
import com.example.payments.repository.PaymentRepository;

@RestController
@RequestMapping("/api/v1")
public class PaymentsController {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@GetMapping("/payments")
	public List<Payments> getAllPayments(){
		
		return paymentRepository.findAll();
	}
	
	
	@GetMapping("/payments/{paymentId}")
	public ResponseEntity<Payments> getPaymentById(@PathVariable(value="paymentId") Long paymentId)throws ResourceNotFoundException{
		
	Payments payments = paymentRepository.findById(paymentId)
			 .orElseThrow(() -> new ResourceNotFoundException("Payment  not found on :: "+ paymentId));
	 return ResponseEntity.ok().body(payments);
		
		
		
	}
	
	@PostMapping("/payments")
	public Payments createPayment(@Valid @RequestBody Payments payment) {
		return paymentRepository.save(payment);
		
	}
	
	
	
	
}
