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
<div align="center">
    <h2><c:out value="${file.title}" /></h2>
    <h3><c:out value="${file.content}" /></h3>
    <img src="data:image/jpg;base64,${file.base64Image}" width="240" height="300"/>
</div>
</body>
</html>