	package com.greenstar.registration.registration.controller;

import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greenstar.registration.registration.model.UserCredential;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.greenstar.registration.registration.model.User;
import com.greenstar.registration.registration.service.UserRepository;

@Controller
@RequestMapping(path="/userService")

public class RegistrationController {

	@Autowired
	private UserRepository userRepository;
	
	/*
	 * @GetMapping(path="/add")
	 * 
	 * public @ResponseBody String addUser(@RequestParam String name,
	 * 
	 * @RequestParam String email) {
	 * 
	 * User newUser = new User(); newUser.setName(name); newUser.setEmail(email);
	 * userRepository.save(newUser);
	 * 
	 * return "user added successfully"; }
	 */
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	 @CrossOrigin(origins = "http://localhost:4200")  
	@PostMapping(path="/getuser")
	public @ResponseBody String findUserById(@RequestBody UserCredential credential,
			HttpServletRequest request
			) {
	
		//JSONPObject jsonobj = new JSONPObject("success", false);
		String jsonStatus = "{\"success\":\"false\"}";
		
		System.out.println("email------------------------------"+credential.getUserName()+"  "+credential.getPassword());
		List<User> user = userRepository.findByEmail(credential.getUserName());
		ListIterator<User> ltr = user.listIterator(); 
		while(ltr.hasNext()) {
			
			User userobj = ltr.next(); 
			if(userobj.getPassword().equalsIgnoreCase(credential.getPassword())) {
				System.out.println("true");
			//	request.getSession().setAttribute("USER_DATA"+userobj.getEmail(), userobj);
				//jsonobj = new JSONPObject("success", true);
				jsonStatus = "{\"success\":\"true\"}";
			}
		//	User userfromsession = (User)request.getSession(false).getAttribute("USER_DATA"+userobj.getEmail());
			//System.out.println("session data"+request.getSession(false).getAttribute("USER_DATA"+userobj.getEmail());
		//	System.out.println("session data"+userfromsession.getEmail());
		}
		 System.out.println("default flag"+jsonStatus);
			return jsonStatus;
		
		
	}
}
