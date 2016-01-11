package expanse.dao;



import java.sql.SQLException;
import java.util.Calendar;
import java.sql.Date;
import expanse.entity.User;

public class UserDAO extends  DAO {
	
	public boolean authicateUser(User user) throws SQLException{
		String query = "select user_id, username, password from users where username=? and password=?";
		setStmt(getConnection().prepareStatement(query));
		getStmt().setString(1,user.getUsername());
		getStmt().setString(2, user.getPassword());
		setResult(getStmt().executeQuery());
		while(getResult().next()){
			if(user.getPassword().equals(getResult().getString("password")) && user.getUsername().equals(getResult().getString("username"))){
				user.setUser_id(getResult().getLong("user_id"));
				return true;
			}
		}
		return false;
	}
	
	public void resgisterUser(User user) throws SQLException{
		String query = "insert into users (user_id,username,password,name,email,registration_date) values (user_seq.nextval,?,?,?,?,?)";
		setStmt(getConnection().prepareStatement(query));
		getStmt().setString(1, user.getUsername());
		getStmt().setString(2,user.getPassword());
		getStmt().setString(3,user.getName());
		getStmt().setString(4,user.getEmail());
		getStmt().setDate(5, new Date(Calendar.getInstance().getTimeInMillis()));
		getStmt().execute();
			
	}
	
}
