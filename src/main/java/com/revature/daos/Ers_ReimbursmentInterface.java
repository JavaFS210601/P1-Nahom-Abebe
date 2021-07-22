package com.revature.daos;

import java.util.List;

import com.revature.models.Ers_reimbursement;



public interface Ers_ReimbursmentInterface {

	public  List<Ers_reimbursement> getAllReimbursment();
    public Ers_reimbursement getReimbursmentById(int id); 
    
	public boolean addReimbursment(Ers_reimbursement reimbursment); 
	
	public boolean killReimbursmentr(int id);
	
	public boolean pendingRimbursment(int amount);
	
	boolean approveRimbursment(int amount);
	
	
	

}
