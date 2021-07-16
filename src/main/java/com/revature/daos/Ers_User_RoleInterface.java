package com.revature.daos;

import java.util.List;


import com.revature.models.Ers_user_roles;


public interface Ers_User_RoleInterface {
	public List<Ers_user_roles> getAlluserRole();
	
	public boolean addUsers(Ers_user_roles ers_users);
	public boolean killUsersRole(int id);

}
