package com.EducationalLoanPortal.demo.Model;



import java.util.List;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loanapplication")
public class LoanApplicationModel {
	
	 @Id
	private Id loanid;
	private String loantype;
	private String applicantName;
	private String applicantAdddress;
	private String applicantMobile;
	private String applicantEmail;
	private String applicantAadhaar;
	private String applicantPan;
	private String applicantSalary;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	public Id getLoanid() {
		return loanid;
	}
	public void setLoanid(Id loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantAdddress() {
		return applicantAdddress;
	}
	public void setApplicantAdddress(String applicantAdddress) {
		this.applicantAdddress = applicantAdddress;
	}
	public String getApplicantMobile() {
		return applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAadhaar() {
		return applicantAadhaar;
	}
	public void setApplicantAadhaar(String applicantAadhaar) {
		this.applicantAadhaar = applicantAadhaar;
	}
	public String getApplicantPan() {
		return applicantPan;
	}
	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}
	public String getApplicantSalary() {
		return applicantSalary;
	}
	public void setApplicantSalary(String applicantSalary) {
		this.applicantSalary = applicantSalary;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	@Override
	public String toString() {
		return "LoanApplicationModel [loanid=" + loanid + ", loantype=" + loantype + ", applicantName=" + applicantName
				+ ", applicantAdddress=" + applicantAdddress + ", applicantMobile=" + applicantMobile
				+ ", applicantEmail=" + applicantEmail + ", applicantAadhaar=" + applicantAadhaar + ", applicantPan="
				+ applicantPan + ", applicantSalary=" + applicantSalary + ", loanAmountRequired=" + loanAmountRequired
				+ ", loanRepaymentMonths=" + loanRepaymentMonths + "]";
	}
	public List<LoanApplicationModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public LoanApplicationModel save(LoanApplicationModel lobj) {
		// TODO Auto-generated method stub
		return null;
	}
	public Optional<UserModel> findById(int loanId2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
	