<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- to assign value to a variable --%>
   <c:set var="i" value="12"></c:set>
   <%-- to display value of a variable --%>
   <c:out value="${i}"></c:out>
   <c:if test="${i>3}">
      i is greater
   </c:if>
   
   <c:forEach var="j" begin="1" end="20" step="2">
      <h3>Value : ${j}</h3>
   </c:forEach>
   <c:choose>
      <c:when test="${i==1}">Monday</c:when>
      <c:when test="${i==12}">Tuesday</c:when>
      <c:when test="${i==3}">Wednesday</c:when>
      <c:when test="${i==4}">Thursday</c:when>
      <c:otherwise>Friday</c:otherwise>
   </c:choose>
</body>
</html>