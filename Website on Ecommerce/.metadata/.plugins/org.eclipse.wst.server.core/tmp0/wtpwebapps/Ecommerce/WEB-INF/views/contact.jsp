<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form action="/action_page.php" style="border:1px solid #ccc">
  <div class="container">
    <h1><strong>Contact Us</h1></strong>
    <hr>
    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter name" name="email">
	
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="order number"><b>Order Number(if Applicable)</b></label>
    <input type="text" placeholder="order number" name="order number">
	 
	 <label for="phone number"><b>Phone Number</b></label>
    <input type="text" placeholder="phone number" name="phone number" required>
	
     <label>Message: <br><textarea cols="35" rows="5" name="msg"></textarea></label>
	
	<button type="submit">Send</button>
	</div>
	</form>