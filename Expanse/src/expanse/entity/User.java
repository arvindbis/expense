package expanse.entity;

import java.sql.Timestamp;

public class User {
	private String username;
	private String password;
	private long userID;
	private String name;
	private String email;
	private Timestamp lastLogin;
	private long teamID;
	
	public User(){
		
	}
	
	public User(String username, String password){
		setUserID(0);
		setUsername(username);
		setPassword(password);
	}
	
	public User(long userID, String username, String password, String name, String email) {
		setUserID(userID);
		setUsername(username);
		setPassword(password);
		setName(name);
		setEmail(email);
	}
	
	public User(long userID, String username, String password, String name, String email,Timestamp lastAccess) {
		setUserID(userID);
		setUsername(username);
		setPassword(password);
		setName(name);
		setEmail(email);
		setLastLogin(lastAccess);
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public Timestamp getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public long getTeamID() {
		return teamID;
	}

	public void setTeamID(long teamID) {
		this.teamID = teamID;
	}

	public String getLastLoginString(){
		return getLastLogin().toString();
	}
		
}
