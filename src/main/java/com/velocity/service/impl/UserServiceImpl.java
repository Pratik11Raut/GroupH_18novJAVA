package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.User849;
import com.velocity.model.User851;
import com.velocity.repository.UserRepository849;
import com.velocity.repository.UserRepository851;
import com.velocity.service.UserService;

@Service
	public class UserServiceImpl implements UserService {
		//inject repository 
		@Autowired
		private UserRepository849 userRepository849;
		@Override
		public User849 getUser849(Integer id) {
			// TODO Auto-generated method stub
			//User user = userRepositoty.findById(id);
	User849 user849 =userRepository849.findById(id).get();
  	     
		return user849;
		}
		@Autowired
		private UserRepository851 userRepository851;
		@Override
		public User851 getUser851(Integer id) {
			// TODO Auto-generated method 
		User851 user =userRepository851.findById(id).get();
			return user;
			
		}
		@Override
		public User851 saveUser(User851 user) {
			// TODO Auto-generated method stub
		
			return userRepository851.save(user);
		}
	}
		
		
