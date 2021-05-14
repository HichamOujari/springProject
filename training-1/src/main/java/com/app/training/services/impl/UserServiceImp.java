package com.app.training.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.training.entities.UserEntity;
import com.app.training.repositories.UserRepository;
import com.app.training.services.UserService;
import com.app.training.shared.dto.UserDto;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto user) {
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setUserId("user Id");
		userEntity.setEncryptedPassword("Encrypted pass");
		
		UserEntity newUser = userRepository.save(userEntity);
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(newUser, userDto);
		
		return userDto;
	}
	
}
