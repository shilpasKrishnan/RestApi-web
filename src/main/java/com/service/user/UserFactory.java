package com.service.user;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {
	
	public List<User> getUsers(){
		List<User> userList =  new ArrayList<User>();
		User user1 = new User(1,"shilpa","QA");
		User user2 = new User(2,"john","Developer");
		
		userList.add(user1);
		userList.add(user2);
		
		return userList;

	}
 
}
