package com.pratiti.training.Collections;

import java.util.ArrayList;

import java.util.List;

class User{
	String username;
	String password;
	public User() {
		
	}
	public User(String username, String password) {
	
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
}

class UserManager {
	List<User> users;
	
	UserManager(){
		users = new ArrayList<>();
		users.add(new User("Rohit", "112233"));
		users.add(new User("Rutwik", "222233"));
		users.add(new User("Pratik", "332233"));
		
	}
	
	boolean isValidUser(String username, String password) {
		
		return users
					.stream()
					.anyMatch(info -> info.username.equals(username) && info.getPassword().equals(password));
//		for(User userr: users) 
//			if(userr.getUsername().equals(username) && userr.getPassword().equals(password))
//				return true;
//		return false;
			
	}
		
//		for(int i=0; i<users.size(); i++) {
//		Contains cannot be used here as it takes objects as parameter
//			if(users.contains(username) && users.contains(password))
//				return true;
//		}
			
}

public class Application {

	public static void main(String[] args) {
		
		UserManager mgr = new UserManager();
		boolean isValid = mgr.isValidUser("Rohit", "112233");
		
		if(isValid)
			System.out.println("Success!");
		else
			System.out.println("Failure!");
	}
}





















