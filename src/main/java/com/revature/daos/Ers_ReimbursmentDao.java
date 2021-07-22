package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.revature.models.Ers_reimbursement;
import com.revature.utils.ConnectionUtil;

public class Ers_ReimbursmentDao implements Ers_ReimbursmentInterface {
	
	private Ers_Users_Interface userDao = new Ers_UsersDao();

	@Override
	public List<Ers_reimbursement> getAllReimbursment() {
		try (Connection conn = ConnectionUtil.getConnection()) { // try to establish a DB connection, so we can run a
			// query

			ResultSet rs = null; // initialize an empty ResultSet that will store the results of our query

			String sql = "SELECT * FROM \"EmployeeRs\".ers_reimbursement;"; // write the query, assign it to a String variable

			Statement s = conn.createStatement(); // creating an object to send the query to our DB

			rs = s.executeQuery(sql); // execute the query (sql) using our Statement object (s), put it in our
// ResultSet (rs)

			List<Ers_reimbursement> statusList = new ArrayList<>(); // create a List that will be populated with the returned
			// employees

			while (rs.next()) { // while there are results left in the ResultSet (rs)

// Create a new player Object from each returned record
				Ers_reimbursement status = new Ers_reimbursement(rs.getInt("reimb_id"),
						rs.getInt("reimb_amount"),
                        rs.getString("reim_submitted"),
                        rs.getString("reimb_resolved"), 
                        rs.getString("reimb_description"),
                        rs.getString("reimb_receipt"),
                        rs.getInt("reimb_author"), 
                        rs.getInt("reimb_resolver"),
                        rs.getInt("reimb_status_id"),
                        rs.getInt("reimb_type_id"),
                        null,
                        null, 
                        null
                        );

				if(rs.getString("ers_users_fk") != null) {
					
					//a.setHome_fk(hDAO.getHomeByName(rs.getString("home_fk")));
					status.setErs_user_fk(userDao.getUsersrByName(rs.getString("ers_users_fk")));
					
					//set the Avenger's home_fk equal to the home object returned by getHomeByName
					//the getHomeByName method gets its parameter from the home_fk column returned by the SQL query
					//in this way, we can get an entire Home object with just our home_fk!
					
					//the logic given as a parameter in the setHome_fk() method will return a Home object...
					//and set it as the Home field in the new Avenger object
				}
               statusList.add(status);

			}

			return statusList; // Finally, if successful, return the List of Employees

		} catch (SQLException e) { // if something goes wrong accessing our data, it will get caught
			System.out.println("Something went wrong when trying to access your DB");
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
		try (Connection conn = ConnectionUtil.getConnection()) {

			// This is the way I want to get the current date in the appropriate format
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // date formatter formats dates

			Date date = new Date(0); // new date from java.util package

			String reim_submittedDate = dateFormat.format(date); // make a String that represents today's date in the format we
														// want (line 69)

			// we're going to create a SQL statement using parameters to insert a new
			
			
			
			
			// Employee
			String sql = "INSERT INTO \"EmployeeRs\".ers_reimbursement (reim_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_recept, reimb_autor, reimb_reslover, reimb_status_id, reimb_type_id)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"; // these are parameters!!! We have to now specify the value of each "?"

			PreparedStatement ps = conn.prepareStatement(sql); // we use PreparedStatements for SQL commands with
																// parameters

			// use the PreparedStatement object to insert values into the SQL query
			// the values will come from the Employee object we sent in
			// this requires two arguments, the number of the "?", and the value to give it
			
			
			ps.setInt(1, reimbursment.getReim_id());
			ps.setInt(2, reimbursment.getReimb_amount());
			ps.setDate(3, java.sql.Date.valueOf(reim_submittedDate));
			ps.setDate(4, java.sql.Date.valueOf(sql));
			ps.setString(5, reimbursment.getReimb_description());
			ps.setString(6, reimbursment.getReimb_recept());
			ps.setInt(7, reimbursment.getReimb_autor());
			ps.setInt(8, reimbursment.getReimb_reslover());
			ps.setInt(9, reimbursment.getPower_status_id());
			ps.setInt(10, reimbursment.getReimb_type_id());
			
			
			 // this takes our Java Date, and turns it into a SQL
																// Date.

			// this method actually executes the SQL command that we built
			ps.executeUpdate(); // we use executeUpdate for inserts, updates, and deletes.

			// send confirmation to the console if successful	

		} catch (SQLException e) {
			System.out.println("Add employee failed!");
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean killReimbursmentr(int id) {
		
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "DELETE * FROM \"EmployeeRs\".ers_reimbursement;";
			//String sql = "DELETE FROM \"project_one\".players WHERE player_id = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, id);

			ps.executeUpdate();

			System.out.println("pending" + id);

		} catch (SQLException e) {
			System.out.println("pending failed!");
			e.printStackTrace();
		}
		
		
		return false;
	}
	@Override
	public boolean pendingRimbursment(int amount) {
		
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "DELETE * FROM \"EmployeeRs\".ers_reimbursement;";
			//String sql = "DELETE FROM \"project_one\".players WHERE player_id = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, amount);

			ps.executeUpdate();

			System.out.println("pending" + amount);

		} catch (SQLException e) {
			System.out.println("pending failed!");
			e.printStackTrace();
		}
		
		
		return false;
	
	}
	@Override
	public boolean approveRimbursment(int amount) {

		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "DELETE * FROM \"EmployeeRs\".ers_reimbursement;";
			//String sql = "DELETE FROM \"project_one\".players WHERE player_id = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, amount);

			ps.executeUpdate();

			System.out.println("pending" + amount);

		} catch (SQLException e) {
			System.out.println("pending failed!");
			e.printStackTrace();
		}
		
		
		return false;
		
	

	}
	}


