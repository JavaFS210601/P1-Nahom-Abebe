package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.revature.models.Ers_reimbursement;
import com.revature.models.Ers_reimbursment_status;
import com.revature.models.Ers_reimbursment_type;
import com.revature.models.Ers_users;
import com.revature.utils.ConnectionUtil;

public class Ers_ReimbursmentDao implements Ers_ReimbursmentInterface {
	
	private Ers_Users_Interface userDao = new Ers_UsersDao();

	@Override
	public List<Ers_reimbursement> getAllReimbursment() {
try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "SELECT * FROM \"EmployeeRs\".ers_reimbursment;"; //write your sql statement to send to the DB
			
			Statement s = conn.createStatement(); //create a statement object to execute our query
			
			ResultSet rs = s.executeQuery(sql); //put the result of the query into the ResultSet 
												//(Execute the query into it!)
			
			List<Ers_reimbursement> reimbursmentList = new ArrayList<>(); //create a new ArrayList to hold all the reimbursement
			
			
			
			while(rs.next()) { //while there are still rows in our ResultSet
				
				//make a new  reimbursement list object for each row
				Ers_reimbursement reimbu = new Ers_reimbursement (
						
								
			rs.getInt("reim_id"),
              rs.getInt("reimb_amount"),
			rs.getDate("reim_submited"),
			rs.getDate("reim_resloved"),
			rs.getString("reimb_description"),
			rs.getString("reimb_recept"),	
			rs.getString("reim_autor"),
			rs.getString("reim_reslover"),
			rs.getInt("reim_status_id"),
				rs.getInt("reim_type_id"),
				null
						
						);
				
				
				if(rs.getString("ers_users_fk") != null) {
					reimbu.setErs_user_fk(userDao.getUsersrByName(rs.getString("ers_users_fk")));
					
					
				}
				
				
				reimbursmentList.add(reimbu);
			}
			
			
			return reimbursmentList;
			
			
		} catch (SQLException e) {
			System.out.println("Get all avengers failed!");
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Ers_reimbursement getReimbursmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addReimbursment(Ers_reimbursement reimbursment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean killReimbursmentr(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	}


