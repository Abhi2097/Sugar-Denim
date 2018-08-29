<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<form action="/action_page.php" style="border:1px solid #ccc">
  <div class="container">
    <h1><strong>All Category</h1></strong>
    <hr>
    <label for="name"><b>Category Name</b></label>
    <input type="text" placeholder="Enter name" name="email">
	
    <label for="email"><b>Category Description</b></label>
    <input type="text" placeholder="Enter desc" name="desc" required>

	<button type="submit">ADD</button>
	</div>
	</form>
