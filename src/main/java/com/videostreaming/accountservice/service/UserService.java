package com.videostreaming.accountservice.service;

import com.videostreaming.accountservice.entity.UserProfile;

public interface UserService {

	public UserProfile createProfile(UserProfile profile);
	public UserProfile userLogin(String email,String password);
	public void updateProfile(UserProfile profile);
}
