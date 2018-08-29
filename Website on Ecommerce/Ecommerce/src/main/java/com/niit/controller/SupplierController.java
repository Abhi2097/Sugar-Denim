package com.niit.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.niit.dao.SupplierDao;
import com.niit.models.Supplier;


@Controller
public class SupplierController {
	@Autowired
	private SupplierDao supplierDao;
public SupplierController(){
	System.out.println("SupplierController Bean is Created");
}

@RequestMapping(value="/admin/addsupplier")
public ModelAndView showsupplierPage(Object Supplier) {
    
	ModelAndView mv=new ModelAndView("Supplier");
	Supplier supplier=new Supplier();
	mv.addObject("supplier",supplier);

	return mv;
}

@RequestMapping(value="/admin/savesupplier")
public String saveCateogry(@ModelAttribute("supplier") Supplier supplier, Model model)
{
	supplierDao.saveSupplier(supplier);
	System.out.println("Supplier saved");
	return "redirect:/admin/addsupplier";
	
}

}

