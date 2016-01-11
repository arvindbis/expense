package expanse.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import expanse.dao.UserDAO;
import expanse.entity.User;
import expanse.formbean.RegistrationForm;

public class RegistrationAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		RegistrationForm data = (RegistrationForm)form;
		UserDAO dao = new UserDAO();
		try{
			dao.open();
			User user = new User(0,data.getUsername(),data.getPassword(),data.getName(),data.getEmail());
			dao.resgisterUser(user);
			return mapping.findForward("success");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dao.close();
		}
		return mapping.findForward("failure");
	}

}
