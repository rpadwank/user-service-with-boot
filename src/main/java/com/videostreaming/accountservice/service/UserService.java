package com.videostreaming.accountservice.service;

import com.videostreaming.accountservice.entity.UserProfile;

public interface UserService {

	UserProfile createProfile(UserProfile profile);
	boolean userLogin(String email,String password);
	void updateProfile(UserProfile profile);
}
