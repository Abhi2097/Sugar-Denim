<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <form:form modelAttribute="User" action="${pageContext.request.contextPath}/admin/saveuser" style="border:1px solid #ccc">
  <div class="container">
    <h1><strong>Sign Up</h1></strong>
    <p>Please fill in this form to create an account.</p>
    <hr>
     <form:hidden path="id"></form:hidden></td>
    <label><b>Enter Name</b></label>
    <form:input path="Username" placeholder="Enter name" ></form:input>

    <label><b>Enter Email</b></label>
    <form:input path="Email" placeholder="Enter Email"></form:input>
    
    <label><b>Phone Number</b></label>
    <form:input path="PhoneNumber"  name="email" ></form:input>
    
    <label for="psw"><b>Password</b></label>
    <form:password path="password" ></form:password>
    
    <label for="psw"><b>Confirm Password</b></label>
    <form:password path="" ></form:password>

    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

      <button type="submit" >Sign Up</button>
 
  </div>
</form:form>