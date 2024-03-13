package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.*;
import com.velocity.service.*;
@RestController
public class Usercontroller {
	@Autowired
	private UserService userService;
	@GetMapping("/getUser849/{id}")
	public User849 getUser849(@PathVariable("id") Integer id ){
		User849 user849 =userService.getUser849(id);
		return user849;
		
	}

	@Autowired
	private  PremiumDetailsService  premiumDetailsService;
	@PostMapping("/saveUser")
	public User851 saveUser( @RequestBody User851 user) {
		User851 user1= userService.saveUser(user);
		List<PremiumDetails851> list=user.getPremiumDetailsList();
		for (PremiumDetails851 premiumDetails851 : list) {
			premiumDetails851.setUserid(user.getId());
			 premiumDetailsService.savePremiumDetails(premiumDetails851);
			
		}
		return user1;
	}
	@GetMapping("/getUser851/{id}")
	public User851 getUser851(@PathVariable("id") Integer id) {
		return userService.getUser851(id);
		
		
	}


}
