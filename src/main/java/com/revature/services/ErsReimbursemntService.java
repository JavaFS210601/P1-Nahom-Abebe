package com.revature.services;

import java.util.List;

import com.revature.daos.Ers_ReimbursmentDao;
import com.revature.daos.Ers_ReimbursmentInterface;

import com.revature.models.Ers_reimbursement;

public class ErsReimbursemntService {

	private Ers_ReimbursmentInterface aDAO = new Ers_ReimbursmentDao();
	public List<Ers_reimbursement> getAllReimbursment() {
		return aDAO.getAllReimbursment();
	}
}
