<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <html>
     <body>
 <%@ include file="Header.jsp" %>   
<form:form modelAttribute="supplier" action="${pageContext.request.contextPath}/admin/savesupplier" style="border:1px solid #ccc">
<div class="container">
  <form:hidden path="id"></form:hidden></td>
  <label><b>Supplier Name</b></label>
    <form:input path="SuppName" placeholder="Enter Name"></form:input>
    
   <label><b>Supplier Address</b></label>
   <form:input path="SuppAddr" ></form:input></label>
	
	<button type="submit">Add Suppiler</button>
    
    </div>
	</form:form>
<%@ include file="Footer.jsp" %>
</body>
</html>