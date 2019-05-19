package com.pafbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pafbackend.model.User;

@Service
public interface UserService {

	public User findUserByEmail(String email);

	public String saveUser(User user);
	
	public List<User> getAllusers();
	
	public String deleteUser(int id);
	
}