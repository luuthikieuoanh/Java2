<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
 rel="stylesheet"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
</head>
<body>
<div class="container col-lg-6">
  <h1 class="text-center">File Upload to Database Example - Servlet JSP JDBC MySQL </h1>
  <div class="card">
   <div class="card-body">
    <form method="post" class="form-group" action="uploadServlet"
     enctype="multipart/form-data">
     <div class="form-group">
      <label for="first name">Title: </label> <input type="text"
       class="form-control" name="title" size="50" />
     </div>
     <div class="form-group">
      <label for="last name">Content: </label> <input type="text"
       class="form-control" name="content" size="50" />
     </div>

     <div class="form-group">
      <label for="Profile Photo">Profile Photo:</label> <input
       type="file" name="image" size="50" />
     </div>
     <input type="submit" value="Save" class="btn btn-success">
    </form>
   </div>
  </div>
 </div>
</body>
</html>