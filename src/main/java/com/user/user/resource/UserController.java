package com.user.user.resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.user.model.User;
import com.user.user.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@PostMapping("/create")
	public String createUser(@RequestBody User user) {
		repository.save(user);
		return "Addded user";
	}
}
