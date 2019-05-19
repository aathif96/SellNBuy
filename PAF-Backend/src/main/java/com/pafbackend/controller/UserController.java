package com.pafbackend.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pafbackend.model.User;
import com.pafbackend.service.UserService;

@RequestMapping(path = "/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path="serviceCheck")
	public String serviceCheck() {
		return "Service is Working";
	}
	
	@GetMapping(path = "/getAll")
	public List<User> getAll() {
		return userService.getAllusers();
	}

	@PostMapping(path="/save")
	public String saveUser(@Valid User user) {
		return this.userService.saveUser(user);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String deleteUser(@PathVariable(name="id") int id) {
		return this.userService.deleteUser(id);
	}
}