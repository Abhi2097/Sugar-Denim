<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <form:form modelAttribute="User" action="${pageContext.request.contextPath}/admin/saveuserlogin" style="border:1px solid #ccc"> 
  
  <div class="container">
    <h1><strong>Login</h1></strong>
    <hr>
    <form:hidden path="id"></form:hidden></td>
    
    <label for="email"><b>Username</b></label>
    <form:input path="username" placeholder="Enter name" ></form:input>

    <label for="psw"><b>Password</b></label>
    <form:password path="password" ></form:password>

      <button type="submit">Login</button>
</div>
    </form:form>