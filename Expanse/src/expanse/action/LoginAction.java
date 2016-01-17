package expanse.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import expanse.dao.impl.UserDAO;
import expanse.entity.User;
import expanse.formbean.LoginForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserDAO dao = new UserDAO();
		try{
			LoginForm formData = (LoginForm)form;
			dao.open();
			User user = new User(formData.getUsername(),formData.getPassword());
			System.out.println("Authicating User");
			if(dao.authicateUser(user)){
				System.out.println("User Authenticated");
				request.getSession().setAttribute("loggedUser", user);
				dao.updateLastLogin(user);
				return mapping.findForward("success");
			}
			System.out.println("Authication Failed");
		return mapping.findForward("failure");
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			dao.close();
		}
		return mapping.findForward("failure");
	}

}
