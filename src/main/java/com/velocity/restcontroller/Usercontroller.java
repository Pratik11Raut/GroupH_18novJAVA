package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.*;
import com.velocity.service.*;
@RestController
public class Usercontroller {
	@Autowired
	private UserService userService;
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") Integer id ){
		User user =userService.getUser(id);
		return user;
		
	}

}
