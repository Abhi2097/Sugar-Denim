<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Online Store</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="<c:url value="/resources/css/homestyle.css" />" rel="stylesheet">
  <link href="<c:url value="/resources/css/signstyle.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <!-- JQuery -->
    <script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>


    <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
</head>
<body>
     <img src="<c:url value="/resources/images/imgrc0066024329.jpg"/>" height="165" width="1515"></img>
  
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
	<a href="" class="navbar-brand"><img src="<c:url value="/resources/images/images.png"/>" height="35" width="90px"></a>
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
	  </div>
      <a class="navbar-brand" href="#"></a>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
         <li><a href="${pageContext.request.contextPath}/all/getallproducts">Browse All Products</a></li>
         <li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Select By Category<span class="caret"></span></a>
				<ul class="dropdown-menu">
				<c:forEach items="${categories }" var="category">
			     <li><a href="<c:url value='/all/searchByCategory?searchCondition=${category.categName }'></c:url>">${category.categName }</a>
				</li>
				
				</c:forEach>
				<li>
				<a href="<c:url value='/all/searchByCategory?searchCondition=All'></c:url>">All</a>
				</li>
				<security:authorize access="hasRole('ROLE_ADMIN')">			
				<li><a href="${pageContext.request.contextPath}/admin/addcategory"><strong>Add Category</strong></a></li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/admin/addsupplier"><strong>Add Supplier</strong></a></li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/admin/getproductform"><strong>Add Products</strong></a></li>
				</security:authorize>
	     </li>
	     </ul>
        <li><a href="${pageContext.request.contextPath}/aboutus">About Us</a></li>
        <li><a href="${pageContext.request.contextPath}/contact">Contact US</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <c:if test="${pageContext.request.userPrincipal.name==null }">
        <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="${pageContext.request.contextPath}/all/registrationform"><span class="glyphicon glyphicon-user"></span> sign up</a></li>
        </c:if>
        <c:if test="${pageContext.request.userPrincipal.name!=null }">
		<li><a href="#">Welcome ${pageContext.request.userPrincipal.name }</a></li>
		<li><a href="<c:url value='/j_spring_security_logout'></c:url>">Sign out</a></li>
        </c:if>
        <security:authorize access="hasRole('ROLE_USER')">
        <li><a href="<c:url value='/cart/getcart'></c:url>"><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
        </security:authorize>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>