package com.niit.EcommDBMS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.configuration.DBConfiguration;
import com.niit.dao.CategoryDao;
import com.niit.dao.CategoryDaoImpl;
import com.niit.dao.CustomerDaoImpl;
import com.niit.dao.ProductDao;
import com.niit.dao.ProductDaoImpl;
import com.niit.dao.SupplierDaoImpl;
import com.niit.models.Product;
import com.niit.models.User;
import com.niit.models.Category;
import com.niit.configuration.DBConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,CategoryDaoImpl.class,ProductDaoImpl.class,SupplierDaoImpl.class,CustomerDaoImpl.class);
        ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
        
       /* Product product=new Product(); //New Product
        product.setProductname("Shirts"); //inserted in the column productname
        product.setProductdesc("Fashionable products of shirts "); //column productdesc
        product.setPrice(2000); //column price
        product.setQuantity(10); //column quantity
        //column id =0
        
        productDao.saveProduct(product);//to insert product details into a product table*/
        
       /* UserDao userDao=(UserDao)context.getBean("userDaoImpl");
        User user=new User(); //New Product
        user.setUsername("Pranav"); //inserted in the column productname
        user.setEmail("abc@xyz.com"); //column productdesc
        user.setPassword("123456");
        user.setPhoneNumber(526487);
        user.setRole("admin");
        
        userDao.saveUser(user);//to insert product details into a product table*/       
         /*CategoryDao catDao=(CategoryDao)context.getBean("categoryDaoImpl");
        
        category cat =new category(); //New Product
        cat.setCategDesc("Fasionable caps are available"); //inserted in the column productname
        cat.setCategName("Caps"); //column productdesc
   
        
        catDao.savecategory(cat);*/
        
        
        
        }

        
 }


