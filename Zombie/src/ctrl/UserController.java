package ctrl;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.ForgetBean;
import bean.LoginBean;
import entity.User;
import service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping("login.do")
	public String checkLogin(LoginBean login, Map model, HttpSession session) {
		System.out.println("In controller: " + login.getUserId() + "\t" + login.getPassword());
		User user = service.authenticate(login);
		if (user != null) {
			session.setAttribute("User", user);
			return "dashboard";
		} else {
			model.put("Prompt", "userId/password is incorrect");
			return "home";
		}
	}

	@RequestMapping("forget.do")
	public String forgetPassword(ForgetBean forget, Map model, HttpSession session) {
		if (service.validate(forget)) {
			session.setAttribute("Id", forget.getUserId());
			return "change";
		} else {
			model.put("Invalid", "user and email is not matching");
			return "forget";
		}
	}

	@RequestMapping("change.do")
	public String changePass(LoginBean change, Map model, HttpSession session) {
		change.setUserId((String) session.getAttribute("Id"));
		if (service.changePassword(change)) {
			model.put("Prompt", "Password Successfully changed");
			return "home";                
		} else {
			model.put("Invalid", "Password does not match");
			return "change";
		}
	}

	@RequestMapping("register.do")
	public String persist(User user, Map model) {
		
		if (service.persist(user)) {
			model.put("Prompt", "Thank you for registering");
			return "home";
		} else {
			model.put("Invalid", "User ID already exists");
			return "register";
		}
	}

	@RequestMapping("logout.do")
	public String logout(Map model, HttpSession session) {
		session.invalidate();
		model.put("Prompt", "Logout Successfully");
		return "home";

	}
}
