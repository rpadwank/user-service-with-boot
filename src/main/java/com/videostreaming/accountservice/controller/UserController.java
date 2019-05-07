
package com.videostreaming.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videostreaming.accountservice.entity.UserProfile;
import com.videostreaming.accountservice.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

	@Autowired
	private UserService service;
	@PostMapping("/user")
	public ResponseEntity<UserProfile> registerNewAccount(@RequestBody UserProfile profile ) {
		UserProfile p= service.createProfile(profile);
		return new ResponseEntity<UserProfile>(p,HttpStatus.CREATED);
	}
	@RequestMapping("/update")
	public ResponseEntity<UserProfile> update() {
		UserProfile profile= new UserProfile();
		return new ResponseEntity<UserProfile>(service.createProfile(profile),HttpStatus.OK);
	}
	@GetMapping("/user/{email}/{password}")
	public ResponseEntity<UserProfile> userLogin(@PathVariable String email, @PathVariable String password) {
		System.out.println(email);
		UserProfile profile = service.userLogin(email, password); 
		if(profile!=null) {
			return new ResponseEntity<UserProfile>(profile, HttpStatus.OK);
		}
		return new ResponseEntity<UserProfile>(HttpStatus.UNAUTHORIZED);
		
		
	}
}
