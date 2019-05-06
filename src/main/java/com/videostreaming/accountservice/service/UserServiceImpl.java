package com.videostreaming.accountservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videostreaming.accountservice.dao.UserDao;
import com.videostreaming.accountservice.entity.UserProfile;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	@Override
	public UserProfile createProfile(UserProfile profile) {
		return dao.save(profile);
	}

	@Override
	public boolean userLogin(String email, String password) {
	
		UserProfile profile= dao.getOne(email);
		if(profile.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}

	@Override
	public void updateProfile(UserProfile profile) {
			dao.save(profile);
	}

}
