package com.naveenan.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveenan.demo.model.User;
import com.naveenan.demo.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired 
	UserRepository repository;
		
	@PostMapping("/user")
	public User addAlien(User user) {
		
		repository.save(user);
		return user;
	}
	
	
	  @GetMapping("/users") 
	  public List<User> getUsers() {
	  
		  return repository.findAll(); 
	  }
	  
	  @RequestMapping("/user/{id}")
		public Optional<User> getAlien(@PathVariable("id") int id) {
			
			return repository.findById((long) id);
		}
	  
	  @DeleteMapping("/user/{id}")
		public String deleteAlien(@PathVariable int id) {
			
		  User user = repository.getOne((long) id);
			repository.delete(user);
			
			return "Deleted";
		}
	  
	  @PutMapping("/user")
		public User saveOrUpdateAlien( User user) {
			
			repository.save(user);
			return user;
	  }	

}
