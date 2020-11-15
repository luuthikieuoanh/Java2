<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- 	<c:set var="School" scope="session" value="TDC"></c:set> --%>
	<%-- 	<c:out value="Welcome ${School}"></c:out> --%>

	<%-- 	<c:set var="income" scope="session" value="${4000}" /> --%>
	<%-- 	<c:if test="${income > 8000}"> --%>
	<!-- 		<p> -->
	<!-- 			My income is: -->
	<%-- 			<c:out value="${income}" /> --%>
	<!-- 		<p> -->
	<%-- 	</c:if> --%>
	<%-- 	<c:otherwise> --%>
	<!-- 		<p>My income is: hihi/> -->
	<!-- 		<p> -->
	<%-- 	</c:otherwise> --%>

	<c:set var="income" scope="session" value="${9000}" />
	<c:choose>
	 	<c:when test="${income > 1000}">  
       Income is not good.  
    	</c:when>  
		<c:otherwise>  
       Income is undetermined...  
    	</c:otherwise>
	</c:choose>
</body>
</html>
