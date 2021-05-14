package com.app.training.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.training.Requests.UserRequest;
import com.app.training.Responses.UserResponse;
import com.app.training.services.UserService;
import com.app.training.shared.dto.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser() {
		return "getUser was called";
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		UserDto createdUser = userService.createUser(userDto);
		
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(createdUser, userResponse);
		
		return userResponse;
	}
	
	@PutMapping
	public String updtaeUser() {
		return "updtaeUser was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "deleteUser was called";
	}
	
}
