package com.revature.models;

public class LoginDTO {

	public String username;
	public String password;

	
	//then I just want two constructors so we can instantiate LoginDTO objects
	
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LoginDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
