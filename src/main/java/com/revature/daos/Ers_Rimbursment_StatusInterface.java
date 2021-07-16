package com.revature.daos;

import java.util.List;


import com.revature.models.Ers_reimbursment_status;

public interface Ers_Rimbursment_StatusInterface {
	 
	List<Ers_reimbursment_status> getAllReimbursmentStatus();
    public Ers_reimbursment_status getReimbursmentById(int id); //take in an int, find the avenger with that id
	
	public boolean addReimbursmentStatus(Ers_reimbursment_status reimbursmentStatus); //take in an Avenger object, put it in the database
	
	public boolean killReimbursmentr(int id);
}
