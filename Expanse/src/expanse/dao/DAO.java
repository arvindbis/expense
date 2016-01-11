package expanse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public abstract class DAO {

	private final static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final static String dbUser = "system";
	private final static String dbpassword = "honour";
	private final static String driver = "oracle.jdbc.driver.OracleDriver";

	protected Connection connection;
	protected ResultSet result;
	protected PreparedStatement stmt;
	
	public void open() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		connection = DriverManager.getConnection(url,dbUser,dbpassword);
	}

	public void close() throws SQLException{
		if(connection != null && !connection.isClosed())
			connection.close();
		if(result != null && !result.isClosed())
			result.close();
		if(stmt != null && !stmt.isClosed())
			stmt.close();
	}
	

	public boolean isOpen() throws Exception {
		if(connection != null && !connection.isClosed())
			return true;
		return false;
	}
	
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public ResultSet getResult() {
		return result;
	}

	public void setResult(ResultSet result) {
		this.result = result;
	}

	public PreparedStatement getStmt() {
		return stmt;
	}

	public void setStmt(PreparedStatement stmt) {
		this.stmt = stmt;
	}
}
