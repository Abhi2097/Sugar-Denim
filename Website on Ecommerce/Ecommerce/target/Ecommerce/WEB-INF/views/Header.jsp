<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Store</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="<c:url value="/resources/css/homestyle.css" />" rel="stylesheet">
  <link href="<c:url value="/resources/css/signstyle.css" />" rel="stylesheet">
  <link href="<c:url value="/resources/css/dropstyle.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
         <li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Products<span class="caret"></span></a>
				<ul class="dropdown-menu">
				<li><a href="${pageContext.request.contextPath}/shirt"><Strong>Shirts</strong></a></li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/denim"><strong>Denim</strong></a><li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/jackets"><strong>Jackets</strong></a></li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/cap"><strong>Caps</strong></a></li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/category"><strong>Category</strong></a></li>
				</ul>
			   </li>
        <li><a href="${pageContext.request.contextPath}/aboutus">About Us</a></li>
        <li><a href="${pageContext.request.contextPath}/contact">Contact US</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="${pageContext.request.contextPath}/Signup"><span class="glyphicon glyphicon-user"></span> sign up</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>