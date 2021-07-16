package com.revature.daos;

import java.util.List;

import com.revature.models.Ers_reimbursement;



public interface Ers_ReimbursmentInterface {

	List<Ers_reimbursement> getAllReimbursment();
    public Ers_reimbursement getReimbursmentById(int id); //take in an int, find the avenger with that id
   
	public boolean addReimbursment(Ers_reimbursement reimbursment); //take in an Avenger object, put it in the database
	
	public boolean killReimbursmentr(int id);
	
	
	
	
	

}
