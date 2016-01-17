package expanse.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import expanse.dao.DAO;
import expanse.entity.Expense;

public class ExpenseDAO extends DAO {
	
	public ArrayList<Expense> getAllExpense(long userID) throws SQLException, ClassNotFoundException{
		ArrayList<Expense> expenses = new ArrayList<Expense>();
		String query = "select expanse_id,paid_by,amount,category_id,DESCRIPTION,EXPANSE_TYPE_ID,REPORTED_DATE,EXPENSE_DATE,TEAM_SIZE from expanse where paid_by=?";
		super.open();
		setStmt(getConnection().prepareStatement(query));
		getStmt().setLong(1, userID);
		setResult(getStmt().executeQuery());
		System.out.println(getResult().getFetchSize());
		while(getResult().next()){
			Expense expense = new Expense(getResult().getLong("expanse_id"),getResult().getLong("paid_by"),getResult().getDouble("amount"),getResult().getString("description"),getResult().getLong("EXPANSE_TYPE_ID"),
						getResult().getTimestamp("EXPENSE_DATE"),getResult().getTimestamp("REPORTED_DATE"),getResult().getLong("category_id"),getResult().getLong("TEAM_SIZE"));
			expenses.add(expense);
		}
		return expenses;
	}
	
}
