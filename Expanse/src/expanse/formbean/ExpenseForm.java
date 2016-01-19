package expanse.formbean;

import org.apache.struts.validator.ValidatorForm;

public class ExpenseForm extends ValidatorForm {
	private int expenseType;
	private int expenseDay;
	private int expenseMonth;
	private int expenseYear;
	private double amount;
	private long categoryID;
	private String description;
	
	
	public int getexpenseType() {
		return expenseType;
	}
	public void setexpenseType(int expenseType) {
		this.expenseType = expenseType;
	}
	public int getexpenseDay() {
		return expenseDay;
	}
	public void setexpenseDay(int expenseDay) {
		this.expenseDay = expenseDay;
	}
	public int getexpenseMonth() {
		return expenseMonth;
	}
	public void setexpenseMonth(int expenseMonth) {
		this.expenseMonth = expenseMonth;
	}
	public int getexpenseYear() {
		return expenseYear;
	}
	public void setexpenseYear(int expenseYear) {
		this.expenseYear = expenseYear;
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
	
	
}
