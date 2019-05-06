
package com.videostreaming.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videostreaming.accountservice.entity.UserProfile;
import com.videostreaming.accountservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	@RequestMapping("/create")
	public ResponseEntity<UserProfile> create() {
		UserProfile profile= new UserProfile("asd", "qqqq", "asd@gmail.com", "123456@", "new");
		return new ResponseEntity<UserProfile>(service.createProfile(profile),HttpStatus.OK);
	}
	@RequestMapping("/update")
	public ResponseEntity<UserProfile> update() {
		UserProfile profile= new UserProfile();
		return new ResponseEntity<UserProfile>(service.createProfile(profile),HttpStatus.OK);
	}
	@RequestMapping("/login")
	public String login() {
		
		String email="asd";
		String password="1111";
		if(service.userLogin(email,password ))
			return "success";
		else
			return "fail";
		
	}
}
