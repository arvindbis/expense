package expanse.init;


import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import expanse.dao.impl.InitDAO;



public class InitServlet implements ServletContextListener {
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void contextInitialized(ServletContextEvent context) {
		loadCollections(context);
		
	}
       
  
    

	private void loadCollections(ServletContextEvent context){
		try {
			InitDAO dao = new InitDAO();
			context.getServletContext().setAttribute("expenseTypes", dao.loadExpeseType());
			System.out.println("Expenses types Loaded successfully");
			context.getServletContext().setAttribute("categories", dao.loadCategories());
			System.out.println("Categories Loaded successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
