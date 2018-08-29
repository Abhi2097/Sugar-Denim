package com.niit.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDao;
import com.niit.models.User;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
public UserController(){
	System.out.println("UserController Bean is Created");
	System.out.println("LoginController Bean is Created");
}

@RequestMapping(value="/admin/saveuser")
public String saveCateogry(@ModelAttribute("user") User user, Model model)
{
	userDao.saveUser(user);
	System.out.println("User saved");
	return "redirect:/admin/adduser";
	
}

/*@RequestMapping("/admin/saveuserlogin")
public String saveRegistration(@ModelAttribute("user") User user,
		 Model model) {
     
    
   userDao.saveUser(user);
   System.out.println("data saved");
    
    return "redirect:/login";
}*/
}


