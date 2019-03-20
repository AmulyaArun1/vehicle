<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login PAge</title>
</head>
<body>
<form action="login.html" method="post">
  

  <div class="container">
    <label for="uname"><b>Employee Id</b></label>
    <input type="text" placeholder="Enter Username" name="empId" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <button type="submit">Login</button>
    
    
  
  </div> 
</form>
<a href="register.html">Register here</a>

</body>
</html>