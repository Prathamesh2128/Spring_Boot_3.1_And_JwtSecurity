package com.app.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	public HomeController() {
		System.out.println("in ctor of "+getClass());
	}
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers()
	{
		System.out.println("Getting Users...");
		return this.userService.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getLoggedUser(Principal principle) {
		return principle.getName();
	}
}
