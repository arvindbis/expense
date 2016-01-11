package expanse.entity;

import java.sql.Timestamp;

public class Expense {
	private long id;
	private long paidBy;
	private double amount;
	private long categoryID;
	private String description;
	private long expenseTypeID;
	private Timestamp reportedDate;
	private Timestamp expenseDate;
	private long teamSize;
	
	public Expense(){
		
	}
	
	public Expense(long expanseID, long paidBy, double amount, String description, long expanseTypeID, Timestamp expanseDate,
			Timestamp reportedDate,long categoryID, long teamSize){
		setId(expanseID);
		setPaidBy(paidBy);
		setAmount(amount);
		setDescription(description);
		setExpenseTypeID(expanseTypeID);
		setExpenseDate(expanseDate);
		setReportedDate(reportedDate);
		setTeamSize(teamSize);
		setCategoryID(categoryID);
	}
	
	public long getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(long teamSize) {
		this.teamSize = teamSize;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(long paidBy) {
		this.paidBy = paidBy;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getExpenseTypeID() {
		return expenseTypeID;
	}
	public void setExpenseTypeID(long expenseTypeID) {
		this.expenseTypeID = expenseTypeID;
	}
	public Timestamp getReportedDate() {
		return reportedDate;
	}
	public void setReportedDate(Timestamp reportedDate) {
		this.reportedDate = reportedDate;
	}
	public Timestamp getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(Timestamp expenseDate) {
		this.expenseDate = expenseDate;
	}
}
