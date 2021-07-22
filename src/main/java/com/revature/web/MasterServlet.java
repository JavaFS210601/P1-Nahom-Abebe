package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.Ers_ReimbursemntController;
import com.revature.controllers.Ers_reimbursment_statusController;
import com.revature.controllers.Ers_reimbursment_typeController;
import com.revature.controllers.Ers_user_rolesController;
import com.revature.controllers.Ers_usersContoller;
import com.revature.controllers.LoginControler;


public class MasterServlet extends HttpServlet {
	private Ers_ReimbursemntController ac = new Ers_ReimbursemntController();
	
	private Ers_usersContoller uc = new Ers_usersContoller();
			
	private Ers_reimbursment_statusController rsc = new Ers_reimbursment_statusController();
	private Ers_reimbursment_typeController rtc = new Ers_reimbursment_typeController();
	private  Ers_user_rolesController urc = new  Ers_user_rolesController();
	
	
	private  LoginControler lc = new  LoginControler();
	
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("application/json"); //set the content of our response object to be JSON
		
		//by default, Tomcat will send back a successful status code (200) if a request gets handled.
		//since we have a master servlet that takes all requests, this means all requests will get hendled.
		//this can lead to problems - we don't want a 200 if the request isn't handled correctly
		//thus, by default, we'll set the status code to 404, and change it in our code upon success.
		res.setStatus(404);
		
		
		//Now we want to write some code that will determine where requests get sent.
		
		String URI = req.getRequestURI().replace("/P1-Nahom-Abebe/", "");
		//getting the request URI, and stripping out the base URL
		//so we'll just be left with the endpoint (e.g. "avengers", "login") to use in a switch
		System.out.println(URI);
		switch(URI) {
		
		case "Ers_reimbursment": //adding functionality to make the user have to log in before accessing all avengers
		
			//if(req.getSession(false) != null) { //if there is an active Session (which means the user is logged in)
				ac.getAllReimbursment(res); //doGet all reimbursment
			//} else {
				//res.setStatus(403); //forbidden - they aren't logged in so they can't get the goods
				
			//}
			
			break;
			
			
//          case "Ers_users": 
//			
//        	  uc.addReimbursment()
//			break;
//			
//          case "Ers_reimbursment_status": 
//  			
//        	  rsc.getAllReimbursmentStatus(res);
//  			break;
//  			
//          case "Ers_reimbursment_type": 
//  			
//        	  rtc.getAllReimbursment(res);
//  			break;
//		
//			
//		case "Ers_user_role": 
//			
//			urc.getAllReimbursment(res);
//			break;
			
//		case "addReimbursment":
//			ac.addReimbursment(res);
//			break;
			
            case "login": 
  			
  			lc.login(req, res);
  			break;
			
		}
		
	}
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
		//this sends every POST request to the doGet method, why???
		//I only want one switch statement in this Servlet. It can get very messy otherwise
		//and we'll differentiate get from post in the controllers instead of the servlet.
		
	}
	
}
