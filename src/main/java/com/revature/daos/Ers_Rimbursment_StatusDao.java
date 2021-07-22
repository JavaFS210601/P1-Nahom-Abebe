package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.revature.models.Ers_reimbursment_status;
import com.revature.utils.ConnectionUtil;

public class Ers_Rimbursment_StatusDao implements Ers_Rimbursment_StatusInterface{
	

	@Override
	public List<Ers_reimbursment_status> getAllReimbursmentStatus() {

		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "SELECT * FROM \"EmployeeRs\".ers_reimbursement_status;"; //write your sql statement to send to the DB
			
			Statement s = conn.createStatement(); //create a statement object to execute our query
			
			ResultSet rs = s.executeQuery(sql); //put the result of the query into the ResultSet 
												//(Execute the query into it!)
			
			List<Ers_reimbursment_status> statusList = new ArrayList<>(); //create a new ArrayList to hold all the Avengers
			
			
			
			while(rs.next()) { //while there are still rows in our ResultSet
				
				//make a new Avenger object for each row
				Ers_reimbursment_status a = new Ers_reimbursment_status (
					rs.getInt("reimb_status_id "),
					rs.getString("reimb_status"),
				         null 
				);
				
				
				statusList.add(a);
			}
			
			return statusList;
			
			
		} catch (SQLException e) {
			System.out.println("Get all avengers failed!");
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Ers_reimbursment_status getReimbursmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addReimbursmentStatus(Ers_reimbursment_status reimbursmentStatus) {
		
		try (Connection conn = ConnectionUtil.getConnection()) {

			// This is the way I want to get the current date in the appropriate format
			
			String sql = "INSERT INTO \"EmployeeRs\".ers_reimbursement (reimb_status_id, reimb_status)"
					+ "VALUES (?, ?);"; // these are parameters!!! We have to now specify the value of each "?"

			PreparedStatement ps = conn.prepareStatement(sql); // we use PreparedStatements for SQL commands with
																// parameters

			// use the PreparedStatement object to insert values into the SQL query
			// the values will come from the Employee object we sent in
			// this requires two arguments, the number of the "?", and the value to give it
			
			
			ps.setInt(1, reimbursmentStatus.getReimb_status_id());
			ps.setString(2, reimbursmentStatus.getReimb_status());
			
			ps.executeUpdate(); // we use executeUpdate for inserts, updates, and deletes.	

		} catch (SQLException e) {
			System.out.println("Add employee failed!");
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean killReimbursmentr(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	


}
