package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.ProductDao;
import com.niit.models.Category;
import com.niit.models.Product;

@Controller
public class ProductController {
	@Autowired
private ProductDao productDao;
public ProductController(){
	System.out.println("ProductController Bean is Created");
}

@RequestMapping(value="/admin/addproduct")
public String addProduct(@ModelAttribute(name="product") Product product  ){
	productDao.saveProduct(product);
	System.out.println("Product saved");
	return "redirect:/all/getallproducts";
}
/*@RequestMapping(value="/admin/addproduct")
public ModelAndView showproductPage() {
    
   
	ModelAndView mv=new ModelAndView("productform");
	Product product=new Product();
	mv.addObject("product",product);

	return mv;
}*/
/*@RequestMapping(value="/admin/addproduct")
public ModelAndView showsupplierPage() {
    
	ModelAndView mv=new ModelAndView("Product");
	Product product=new Product();
	
	mv.addObject("product",product);

	return mv;
}*/

/*@RequestMapping(value="/admin/saveproduct")
public String saveProduct(@ModelAttribute("product") Product product, Model model)
{

	productDao.saveProduct(product);
	System.out.println("Product saved");
	return "redirect:/admin/addproduct";
	
}*/
@RequestMapping(value="/admin/getproductform")
public String getproductform(Model model){
	Product p=new Product();
	model.addAttribute("product",p);
	model.addAttribute("categories",productDao.getAllCategories());
	//In productform, access  the values of all the properties of product p
	//in the form, p.getId(),p.getProductname(),p.getPrice(),p.getQuantity(),p.getProductdesc()
	return "productform";
}
/*@RequestMapping(value="/admin/getproductform")
public String saveProduct(@ModelAttribute("product") Product product, Model model)
{
	productDao.saveProduct(product);
	model.addAttribute("categories",productDao.getAllCategories());
	System.out.println("Product saved");
	return "redirect:/admin/addproduct";
	
}*/

@RequestMapping(value="/all/getallproducts")
public String getAllProducts(Model model){
	List<Product> products=productDao.getAllProducts();
	//Attribute name is the Key - productList
	//value - List<Product> products is the data
	model.addAttribute("productsList",products);
	//                 attributename   data
	return "listofproduct";//logical view name
	//in listofproducts.jsp,access the model attribute "productsList"

}
@RequestMapping(value="/all/getproduct/{id}")
public String getProduct(@PathVariable int id,Model model){
	Product product=productDao.getProduct(id);
	model.addAttribute("productObj",product);
	return "viewproduct";
}

@RequestMapping(value="/admin/deleteproduct/{id}")
public String deleteProduct(@PathVariable int id,Model model){
	productDao.deleteProduct(id);
	return "redirect:/all/getallproducts";
}

@RequestMapping(value="/admin/getupdateform/{id}")
public String getUpdateProductForm(@PathVariable int id,Model model){
	//how to get the product?
	Product product=productDao.getProduct(id);
	model.addAttribute("product",product);
	model.addAttribute("categories",productDao.getAllCategories());
	return "updateproductform";
}

@RequestMapping(value="/admin/updateproduct")
public String updateProduct(@ModelAttribute(name="product") Product product  ){
	productDao.updateProduct(product);
	return "redirect:/all/getallproducts";
}
}

