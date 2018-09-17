<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="Header.jsp" %>
    
    
    <c:if test="${isAboutUSClicked == true}">
    <%@ include file="aboutusPage.jsp"%>
    </c:if>
   
    
    <c:if test="${isContactClicked == true}">
    <%@ include file="contact.jsp"%>
    </c:if>
    

    
    <c:if test="${isIndexClicked == true}">
    <%@ include file="index.jsp"%>
    </c:if>
    
  <%@ include file="Footer.jsp" %>
</body>
</html>