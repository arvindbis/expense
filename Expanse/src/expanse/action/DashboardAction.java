package expanse.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import expanse.dao.impl.ExpenseDAO;
import expanse.entity.User;

public class DashboardAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		long userID = ((User) request.getSession().getAttribute("loggedUser")).getUserID(); 
		try{
			
			request.setAttribute("expenses", new ExpenseDAO().getAllExpense(userID));
		}catch(SQLException e){
			e.printStackTrace();
		}
		return mapping.findForward("success");
	}

}
