package com.revature.models;


import java.util.Date;

public class Ers_reimbursement {

	private int reim_id;
	private int reimb_amount;
	private String reimb_submitted;
	private String reimb_resolved ;
	private String reimb_description;
	private  String reimb_recept ;
	private int reimb_autor;
	private int reimb_reslover;
	private int reimb_status_id;
	private int reimb_type_id;
	//Create an class of 
	private   Ers_reimbursment_status ers_reimbursment_status_fk;
	private  Ers_reimbursment_type ers_reimbursment_type_fk;
	private  Ers_users ers_user_fk;
	public Ers_reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ers_reimbursement(int reim_id, int reimb_amount, String reimb_submitted, String reimb_resolved,
			String reimb_description, String reimb_recept, int reimb_autor, int reimb_reslover, int reimb_status_id,
			int reimb_type_id, Ers_reimbursment_status ers_reimbursment_status_fk,
			Ers_reimbursment_type ers_reimbursment_type_fk, Ers_users ers_user_fk) {
		super();
		this.reim_id = reim_id;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_recept = reimb_recept;
		this.reimb_autor = reimb_autor;
		this.reimb_reslover = reimb_reslover;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
		this.ers_reimbursment_status_fk = ers_reimbursment_status_fk;
		this.ers_reimbursment_type_fk = ers_reimbursment_type_fk;
		this.ers_user_fk = ers_user_fk;
	}
	public Ers_reimbursement(int reimb_amount, String reimb_submitted, String reimb_resolved, String reimb_description,
			String reimb_recept, int reimb_autor, int reimb_reslover, int reimb_status_id, int reimb_type_id,
			Ers_reimbursment_status ers_reimbursment_status_fk, Ers_reimbursment_type ers_reimbursment_type_fk,
			Ers_users ers_user_fk) {
		super();
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_recept = reimb_recept;
		this.reimb_autor = reimb_autor;
		this.reimb_reslover = reimb_reslover;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
		this.ers_reimbursment_status_fk = ers_reimbursment_status_fk;
		this.ers_reimbursment_type_fk = ers_reimbursment_type_fk;
		this.ers_user_fk = ers_user_fk;
	}
	public Ers_reimbursement(int int1, int int2, java.sql.Date date, java.sql.Date date2, String string, String string2,
			String string3, String string4, int int3, int int4, Object object) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ers_reimbursement [reim_id=" + reim_id + ", reimb_amount=" + reimb_amount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_description=" + reimb_description
				+ ", reimb_recept=" + reimb_recept + ", reimb_autor=" + reimb_autor + ", reimb_reslover="
				+ reimb_reslover + ", power_status_id=" + reimb_status_id + ", reimb_type_id=" + reimb_type_id
				+ ", ers_reimbursment_status_fk=" + ers_reimbursment_status_fk + ", ers_reimbursment_type_fk="
				+ ers_reimbursment_type_fk + ", ers_user_fk=" + ers_user_fk + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ers_reimbursment_status_fk == null) ? 0 : ers_reimbursment_status_fk.hashCode());
		result = prime * result + ((ers_reimbursment_type_fk == null) ? 0 : ers_reimbursment_type_fk.hashCode());
		result = prime * result + ((ers_user_fk == null) ? 0 : ers_user_fk.hashCode());
		result = prime * result + reimb_status_id;
		result = prime * result + reim_id;
		result = prime * result + reimb_amount;
		result = prime * result + reimb_autor;
		result = prime * result + ((reimb_description == null) ? 0 : reimb_description.hashCode());
		result = prime * result + ((reimb_recept == null) ? 0 : reimb_recept.hashCode());
		result = prime * result + reimb_reslover;
		result = prime * result + ((reimb_resolved == null) ? 0 : reimb_resolved.hashCode());
		result = prime * result + ((reimb_submitted == null) ? 0 : reimb_submitted.hashCode());
		result = prime * result + reimb_type_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ers_reimbursement other = (Ers_reimbursement) obj;
		if (ers_reimbursment_status_fk == null) {
			if (other.ers_reimbursment_status_fk != null)
				return false;
		} else if (!ers_reimbursment_status_fk.equals(other.ers_reimbursment_status_fk))
			return false;
		if (ers_reimbursment_type_fk == null) {
			if (other.ers_reimbursment_type_fk != null)
				return false;
		} else if (!ers_reimbursment_type_fk.equals(other.ers_reimbursment_type_fk))
			return false;
		if (ers_user_fk == null) {
			if (other.ers_user_fk != null)
				return false;
		} else if (!ers_user_fk.equals(other.ers_user_fk))
			return false;
		if (reimb_status_id != other.reimb_status_id)
			return false;
		if (reim_id != other.reim_id)
			return false;
		if (reimb_amount != other.reimb_amount)
			return false;
		if (reimb_autor != other.reimb_autor)
			return false;
		if (reimb_description == null) {
			if (other.reimb_description != null)
				return false;
		} else if (!reimb_description.equals(other.reimb_description))
			return false;
		if (reimb_recept == null) {
			if (other.reimb_recept != null)
				return false;
		} else if (!reimb_recept.equals(other.reimb_recept))
			return false;
		if (reimb_reslover != other.reimb_reslover)
			return false;
		if (reimb_resolved == null) {
			if (other.reimb_resolved != null)
				return false;
		} else if (!reimb_resolved.equals(other.reimb_resolved))
			return false;
		if (reimb_submitted == null) {
			if (other.reimb_submitted != null)
				return false;
		} else if (!reimb_submitted.equals(other.reimb_submitted))
			return false;
		if (reimb_type_id != other.reimb_type_id)
			return false;
		return true;
	}
	public int getReim_id() {
		return reim_id;
	}
	public void setReim_id(int reim_id) {
		this.reim_id = reim_id;
	}
	public int getReimb_amount() {
		return reimb_amount;
	}
	public void setReimb_amount(int reimb_amount) {
		this.reimb_amount = reimb_amount;
	}
	public String getReimb_submitted() {
		return reimb_submitted;
	}
	public void setReimb_submitted(String reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}
	public String getReimb_resolved() {
		return reimb_resolved;
	}
	public void setReimb_resolved(String reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}
	public String getReimb_description() {
		return reimb_description;
	}
	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}
	public String getReimb_recept() {
		return reimb_recept;
	}
	public void setReimb_recept(String reimb_recept) {
		this.reimb_recept = reimb_recept;
	}
	public int getReimb_autor() {
		return reimb_autor;
	}
	public void setReimb_autor(int reimb_autor) {
		this.reimb_autor = reimb_autor;
	}
	public int getReimb_reslover() {
		return reimb_reslover;
	}
	public void setReimb_reslover(int reimb_reslover) {
		this.reimb_reslover = reimb_reslover;
	}
	public int getPower_status_id() {
		return reimb_status_id;
	}
	public void setPower_status_id(int power_status_id) {
		this.reimb_status_id = power_status_id;
	}
	public int getReimb_type_id() {
		return reimb_type_id;
	}
	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}
	public Ers_reimbursment_status getErs_reimbursment_status_fk() {
		return ers_reimbursment_status_fk;
	}
	public void setErs_reimbursment_status_fk(Ers_reimbursment_status ers_reimbursment_status_fk) {
		this.ers_reimbursment_status_fk = ers_reimbursment_status_fk;
	}
	public Ers_reimbursment_type getErs_reimbursment_type_fk() {
		return ers_reimbursment_type_fk;
	}
	public void setErs_reimbursment_type_fk(Ers_reimbursment_type ers_reimbursment_type_fk) {
		this.ers_reimbursment_type_fk = ers_reimbursment_type_fk;
	}
	public Ers_users getErs_user_fk() {
		return ers_user_fk;
	}
	public void setErs_user_fk(Ers_users ers_user_fk) {
		this.ers_user_fk = ers_user_fk;
	}
	
	
	
	
	
	
	
	
	


}
