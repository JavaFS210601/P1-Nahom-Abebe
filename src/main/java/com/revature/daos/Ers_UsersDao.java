package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.revature.models.Ers_users;
import com.revature.utils.ConnectionUtil;

public class Ers_UsersDao implements  Ers_Users_Interface{

	@Override
	public List<Ers_users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	
	public Ers_users getUsersrByName(String name) {

		try(Connection conn = ConnectionUtil.getConnection()) {
			
			String sql = "SELECT * FROM \"EmployeeRs\".ers_users WHERE ers_username = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name); //set our wildcard to the parameter given in the method
			
			ResultSet rs = ps.executeQuery(); //the results of our query will be put into the ResultSet object
			
			if(rs.next()) { //we won't need a while loop, we're only expecting one result
				
				//Just for the sake of showing you a different way to populate a Home object...
				//...using the setters instead of the constructor like we did in getAllAvengers()	
				Ers_users users = new Ers_users(); //instantiate an empty home object
				
				//use the setters to populate its fields
				users.getErs_user_id();
				users.getErs_username(rs.getString("Ers_username"));
				users.getErs_password(rs.getString("Ers_password"));
				users.getUser_first_name(rs.getString("User_first_name"));
				users.getUser_last_name(rs.getString("User_last_name"));
				users.getUser_email(rs.getString("User_email"));
				
				
				
			
				return users; //return the home object
			}
		
			
		} catch (SQLException e) {
			System.out.println("Couldn't get reimbursment");
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	
	
	
	@Override
	public Ers_users getUsersrByName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUsers(Ers_users ers_users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean destroyeUsers(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	

	


	

}
