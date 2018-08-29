package com.niit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.models.User;

@Controller  // is to create a bean in SPRING CONTAINER
public class HomeController {
	
	public HomeController(){
		System.out.println("HomeController bean is Created");
	}
	
	
	
	@RequestMapping("/")
	public ModelAndView showhomePage()
	{
		ModelAndView mv=new ModelAndView("homePage");
		mv.addObject("isIndexClicked",true);
		return mv;
	}


	  
   /* @RequestMapping(value="/")//  /home - KEY in Handler Map
	public String getHomePage(){  //  getHomePage() is the Value in Handler map
    	System.out.println("Entering getHomePage() method in HomeController"); 
		return "homePage";   //logical view name
	}
    
    
    */
    
    @RequestMapping("/aboutus")
	public ModelAndView showAboutus()
	{
		ModelAndView mv=new ModelAndView("homePage");
		mv.addObject("isAboutUSClicked",true);
		return mv;
	}

    @RequestMapping("/login")
   	public ModelAndView showLogin()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		User user=new User();
   		mv.addObject("User",user);
   		mv.addObject("isLoginClicked",true);
   		return mv;
   	}

    @RequestMapping("/Signup")
   	public ModelAndView showSignUP()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
    	User user=new User();
   		mv.addObject("User",user);
   		mv.addObject("isSignUPClicked",true);
   		return mv;
   	}
    
    @RequestMapping("/contact")
   	public ModelAndView showContact()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		mv.addObject("isContactClicked",true);
   		return mv;
   	}
    
    @RequestMapping("/shirt")
   	public ModelAndView showshirt()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		mv.addObject("isShirtClicked",true);
   		return mv;
   	}
    
    @RequestMapping("/jackets")
   	public ModelAndView showjackets()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		mv.addObject("isJacketClicked",true);
   		return mv;
   	}
    
    @RequestMapping("/denim")
   	public ModelAndView showdenim()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		mv.addObject("isDenimClicked",true);
   		return mv;
   	}
    
    @RequestMapping("/cap")
   	public ModelAndView showcaps()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		mv.addObject("isCapClicked",true);
   		return mv;
   	}
   /* @RequestMapping("/category")
   	public ModelAndView showcategory()
   	{
   		ModelAndView mv=new ModelAndView("homePage");
   		mv.addObject("isCategoryClicked",true);
   		return mv;
   	}*/
   
}


