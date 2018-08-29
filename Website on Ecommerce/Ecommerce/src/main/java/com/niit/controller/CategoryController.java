package com.niit.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDao;
import com.niit.models.Category;

@Controller
public class CategoryController {
	@Autowired
	private CategoryDao categoryDao;
public CategoryController(){
	System.out.println("CategoryController Bean is Created");
}

@RequestMapping(value="/admin/addcategory")
public ModelAndView showcategoryPage() {
    
   
	ModelAndView mv=new ModelAndView("Category");
	Category category=new Category();
	mv.addObject("Category",category);

	return mv;
}

@RequestMapping(value="/admin/savecategory")
public String saveCateogry(@ModelAttribute("Category") Category category, Model model)
{
	categoryDao.savecategory(category);
	System.out.println("Category saved");
	return "redirect:/admin/addcategory";
	
}

	}
