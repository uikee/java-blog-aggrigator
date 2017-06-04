package com.upuna.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upuna.jba.entity.User;
import com.upuna.jba.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public Object findUser(int id) {
		return userRepository.findOne(id);
	}

}
