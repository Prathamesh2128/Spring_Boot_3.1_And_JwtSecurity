package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.app.entities.User;

@Service
public class UserService {
	private List<User>store = new ArrayList<>();
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Prathamesh Shinde", "prathamesh@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Durga Shinde", "durga@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Jayesh Kadam", "jayesh@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ashwini Mane", "ashwini@gmail.com"));
	}
	public List<User>getUsers(){
		return this.store;
	}
}
