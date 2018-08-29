<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <html>
     <body>
 <%@ include file="Header.jsp" %>   
<form:form modelAttribute="Category" action="${pageContext.request.contextPath}/admin/savecategory" style="border:1px solid #ccc">
<div class="container">
  <form:hidden path="id"></form:hidden></td>
  <label><b>Category Name</b></label>
    <form:input path="categName" placeholder="Enter Name"></form:input>
    
    
   <label><b>Category Description</b></label>
   <form:input path="categDesc"></form:input></label>
	
	<button type="submit">Add Category</button>
    
    </div>
	</form:form>
<%@ include file="Footer.jsp" %>
</body>
</html>
