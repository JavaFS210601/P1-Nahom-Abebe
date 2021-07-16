package com.revature.daos;

import java.util.List;


import com.revature.models.Ers_reimbursment_type;

public interface Ers_Rimbursment_TypeInterface {
public List< Ers_reimbursment_type> getAllAvengers(); 
	
	public  Ers_reimbursment_type getAvengerById(int id); 
	
	public boolean addAvenger( Ers_reimbursment_type avenger); 
	
	public boolean killAvenger(int id); 

}
