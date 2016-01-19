package expanse.dao.impl;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import expanse.dao.DAO;
import expanse.entity.ExpenseType;
import expanse.entity.Category;


public class InitDAO extends DAO {
	public List<ExpenseType> loadExpeseType() throws SQLException, ClassNotFoundException{
		List<ExpenseType> expenseTypes = new ArrayList<ExpenseType>();
		String query ="select expanse_type_id, type from expanse_type";
		open();
		setStmt(getConnection().prepareStatement(query));
		if(getStmt() == null)
			System.out.println("stmt is null");
		ResultSet set = getStmt().executeQuery();
		if(set == null)
			System.out.println("result set is null");
		setResult(set);
		while(getResult().next()){
			expenseTypes.add(new ExpenseType(getResult().getLong(1),getResult().getString(2)));
		}
		close();
		return expenseTypes;
	}
	
	public List<Category> loadCategories() throws SQLException, ClassNotFoundException{
		List<Category> categories = new ArrayList<Category>();
		String query ="select category_id, name from category";
		open();
		setStmt(getConnection().prepareStatement(query));
		setResult(getStmt().executeQuery());
		while(getResult().next()){
			categories.add(new Category(getResult().getLong(1),getResult().getString(2)));
		}
		close();
		return categories;
	}
}
