package expanse.entity;

public class User {
	private String username;
	private String password;
	private long user_id;
	private String name;
	private String email;
	
	public User(){
		
	}
	
	public User(String username, String password){
		setUser_id(0);
		setUsername(username);
		setPassword(password);
	}
	
	public User(long user_id, String username, String password, String name, String email) {
		setUser_id(user_id);
		setUsername(username);
		setPassword(password);
		setName(name);
		setEmail(email);
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
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
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
	
	
	
}
