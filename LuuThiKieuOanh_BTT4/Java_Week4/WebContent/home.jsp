<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Admin Control Panel - Bookshop</title>
</head>
<body>
	<div style="text-align: center">
		<h1>Welcome to Bookshop Website Admin Panel</h1>
		<b>${user.id} ${user.fullname} ${user.email}  ${user.phone} ${user.role}</b>
		<br><br>
		<a href="logout">Logout</a>
	</div>
</body>
</html>