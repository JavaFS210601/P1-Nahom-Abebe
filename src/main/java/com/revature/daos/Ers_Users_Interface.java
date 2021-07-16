package com.revature.daos;

import java.util.List;


import com.revature.models.Ers_users;


public interface Ers_Users_Interface {
	
	
	public List<Ers_users> getAllUsers();
	
	
	
	public boolean addUsers(Ers_users ers_users);
	
	public boolean destroyeUsers(int id);

	Ers_users getUsersrByName(int id);



	Ers_users getUsersrByName(String name);



}
