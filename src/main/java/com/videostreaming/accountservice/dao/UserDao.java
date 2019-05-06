package com.videostreaming.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videostreaming.accountservice.entity.UserProfile;

@Repository
public interface UserDao extends JpaRepository<UserProfile, String> {

}
