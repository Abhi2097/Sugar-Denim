package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CartItemDao;
import com.niit.dao.ProductDao;
import com.niit.models.CartItem;
import com.niit.models.User;

@Controller  // is to create a bean in SPRING CONTAINER
public class HomeController {
	
	@Autowired
  private ProductDao productDao;
	   @Autowired
		private CartItemDao cartItemDao;
	public HomeController(){
		System.out.println("HomeController bean is Created");
	}
	

	@RequestMapping("/")
	public ModelAndView showhomePage(HttpSession session,@AuthenticationPrincipal Principal principal){
		ModelAndView mv=new ModelAndView("homePage");
		session.setAttribute("categories",productDao.getAllCategories());
		if(principal!=null) {
		String email=principal.getName();
		List<CartItem> cartItems=cartItemDao.getCart(email);
		session.setAttribute("cartSize",cartItems.size());
		System.out.println(cartItems.size());
		}
		mv.addObject("isIndexClicked",true);
		return mv;
	}

    @RequestMapping("/aboutus")
	public ModelAndView showAboutus()
	{
		ModelAndView mv=new ModelAndView("homePage");
		mv.addObject("isAboutUSClicked",true);
		return mv;
	}


    @RequestMapping(value="/login")
    public String login(){
    	return "Signin";
    }
    @RequestMapping(value="/loginerror")
    public String loginFailed(Model model){
    	model.addAttribute("error","Invalid credentials..");
    	return "Signin";
    }
    @RequestMapping(value="/logout")
    public String logout(Model model){
    	model.addAttribute("msg","Loggedout successfully...");
    	return "Signin";
    }
    @RequestMapping("/contact")
   	public ModelAndView showContact()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		mv.addObject("isContactClicked",true);
   		return mv;
   	}
    
  
   
}


