<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
 <%@ include file="Header.jsp" %>  
 <form:form modelAttribute="product" action="${pageContext.request.contextPath}/admin/updateproduct" style="border:1px solid #ccc">
  
<div class="container">
  <form:hidden path="id"></form:hidden></td>
  <label><b>Enter Product Name</b></label>
    <form:input path="productname" placeholder="Enter Name"></form:input>
    
    
   <label><b>Enter Product Description</b></label>
   <form:input path="productdesc" ></form:input></label>
   
   
   <label><b>Enter Product Price</b></label>
   <form:input path="price" ></form:input></label>
   
   
   
   <label><b>Enter Product Quantity</b></label>
   <form:input path="quantity" ></form:input></label>
   
   <label><b>Select By Category</b></label>
   <form:select path="category.id"><!-- FK column value -->
  <!-- value is to set the value for the path category.id -->
   <c:forEach items="${categories }" var="c">
   <form:option value="${c.id }">${c.categName }</form:option>
   </c:forEach>
   </form:select>		
    <button type="submit">Edit Product</button>
     </div>
	</form:form>
	<%@ include file="Footer.jsp" %>
</body>
</html>