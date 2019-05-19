package com.pafbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pafbackend.model.User;
import com.pafbackend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private RoleRepository roleRepository;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User findUserByEmail(String email) {
		try {
			return userRepository.findByEmail(email);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<User> getAllusers() {
		return this.userRepository.findAll();
	}

	@Override
	public String saveUser(User user) {
		try {
			User u = new User();
			u.setActive(1);
			u.setEmail(user.getEmail());
			u.setFirstname(user.getFirstname());
			u.setLastname(user.getLastname());
			u.setPassword(user.getPassword());
			u.setRoles(user.getRoles());
			 
			userRepository.save(u);
			return "Saved";
		} catch (Exception e) {
			return "Failed";
		}
	}

	@Override
	public String deleteUser(int id) {
		try {
			this.userRepository.deleteById(id);
			return "Deleted";
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed";
		}
	}

}
