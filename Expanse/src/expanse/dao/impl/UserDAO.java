package expanse.dao.impl;



import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.sql.Date;

import expanse.dao.DAO;
import expanse.entity.User;

public class UserDAO extends  DAO {
	
	public boolean authicateUser(User user) throws SQLException{
		String query = "select user_id, username, password,last_login,name,team_id,email from users where username=? and password=?";
		setStmt(getConnection().prepareStatement(query));
		getStmt().setString(1,user.getUsername());
		getStmt().setString(2, user.getPassword());
		setResult(getStmt().executeQuery());
		while(getResult().next()){
			if(user.getPassword().equals(getResult().getString("password")) && user.getUsername().equals(getResult().getString("username"))){
				user.setUserID(getResult().getLong("user_id"));
				user.setName(getResult().getString("name"));
				user.setLastLogin(getResult().getTimestamp("last_login"));
				user.setEmail(getResult().getString("email"));
				user.setTeamID(getResult().getLong("team_id"));
				user.setTeamMembers(populateTeam(user.getTeamID(), user.getUserID()));
				return true;
			}
		}
		return false;
	}
	
	private Set<User> populateTeam(long teamID,long currentUserID) throws SQLException {
		Set<User> team = new HashSet<User>();
		String query = "select user_id,username,password,name,email,last_login from users where team_id=? and user_id!=?";
		setStmt(getConnection().prepareStatement(query));
		getStmt().setLong(1,teamID);
		getStmt().setLong(2, currentUserID);
		setResult(getStmt().executeQuery());
		while(getResult().next()){
			team.add(new User(getResult().getLong(1),getResult().getString(2),getResult().getString(3), getResult().getString(4), getResult().getString(5),getResult().getTimestamp(6)));
		}
		return team;
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

	public void updateLastLogin(User user) throws SQLException {
		String query = "update users set last_login=? where user_id=?";
		setStmt(getConnection().prepareStatement(query));
		getStmt().setTimestamp(1, new Timestamp(Calendar.getInstance().getTimeInMillis()));
		getStmt().setLong(2,user.getUserID());
		getStmt().execute();
		
	}
	
}
