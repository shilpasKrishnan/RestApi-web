package com.service.user;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user/service")
public class UserServices {
	// private UserDao userDao = new UserDao();
	UserFactory userFactory = new UserFactory();

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers() {
		System.out.println("Inside GET USER");
		return userFactory.getUsers();

	}

	@POST
	@Path("/add")
	public void addUser() {
		System.out.println("Inside ADD USER");
	}

}
