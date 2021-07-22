package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.revature.models.Ers_reimbursement;

import com.revature.services.ErsReimbursemntService;

public class Ers_ReimbursemntController {
	private ErsReimbursemntService as = new ErsReimbursemntService();
	private ObjectMapper om = new ObjectMapper(); 
	
	//whenever you're working with HttpServletRequests/Responses, your method will need to throw an IOException
	public void getAllReimbursment(HttpServletResponse res) throws IOException {
		
		//get the List of Avengers from the service layer (which got it from the dao layer)
		List<Ers_reimbursement> reimbursmentList = as.getAllReimbursment();
		
		//turn that List in a JSON String
		String json = om.writeValueAsString(reimbursmentList);

		//put the JSON into the response object (res)
		res.getWriter().print(json);
		
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
		
	}
	
	
public void addReimbursment(HttpServletResponse res) throws IOException {
	    List<Ers_reimbursement> addReimbursment = as.addReimbursment();
		JsonParser url = null;
		//get the List of Avengers from the service layer (which got it from the dao layer)
	    Ers_reimbursement graph = om.readValue(url, Ers_reimbursement.class);
		
		//turn that List in a JSON String
		

		//put the JSON into the response object (res)
		res.getWriter().print(graph );
		
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
		
	}


}
