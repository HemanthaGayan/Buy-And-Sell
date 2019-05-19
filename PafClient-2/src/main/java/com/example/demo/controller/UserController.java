package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.*;
import com.example.demo.service.UserClientService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserClientService userClientService;
	
	//getall All usrs 
		@GetMapping("/allusers")
	    public String getAll(Model model){
	        model.addAttribute("user", userClientService.getAllUsers());
	        return "Allusers";
	    }
	
	@GetMapping("/adduser")
	public String getAddUser(@ModelAttribute User user) {
		return "usrRegister";
	}
		
	@PostMapping("/adduser")
	public String addUser(@ModelAttribute User user,Model model) {
		userClientService.createUser(user);
		model.addAttribute("user", model);
        return "redirect:allusers";
		/*
		 * userClientService.createUser(user); model.addAttribute("user",); return
		 * "usrRegister";
		 */
	}
	
	@GetMapping("/delete")
	public String godeleteUser(@ModelAttribute User user) {
		
		return "userdelete";
				
	}
	
	@PostMapping("/delete")
	public String deleteUser(@ModelAttribute User user) {
		
		userClientService.userDelete(user);
		return "login";
	}
	
	/*
	@GetMapping
	 @RequestMapping("/{id}")
    public String getById(@PathVariable String id, Model model){
        model.addAttribute("user", userClientService.findUserById(id));
        return "login";
    }
	*/
	
	
	//map edit user page
	@GetMapping("/edituser")
	public String findUser(@ModelAttribute User user) {
		
		return "edituser";
				
	}
	
	// find id from edit user page and return that to update user page with user object
	@PostMapping("/updateuser")
	public String findUserUpdate(@ModelAttribute User user, Model model) {
		
		User userone = userClientService.findUserById(user.getId());
		 model.addAttribute("user", userone);
		 
		 return "userupdate";
		
	}
		
}
