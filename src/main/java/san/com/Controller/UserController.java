package san.com.Controller;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import san.com.DAO.UserDAO;
import san.com.Model.User;

@Controller
public class UserController {
	
@RequestMapping(value = "/users")   //when url with / on default GET is called, it will show just string due to
	
public void  chkUser2() {
		
		//return "index page is called";
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("DAObean.xml");
	
	//Get the EmployeeDAO Bean
	UserDAO userDAO = ctx.getBean("userDAO", UserDAO.class);
	
	//Run some tests for JDBC CRUD operations
	User user = new User();
	int rand = new Random().nextInt(1000);
	user.setId(rand);
	user.setName("Panku");
	user.setPass("Dev");
	
	//Create
	userDAO.save(user);
	
		
	System.out.println("DONE");
	
		}
}
