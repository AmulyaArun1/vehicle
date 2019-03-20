<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Registration Page</title>
</head>
<body>
<form action="insert.html" method="post">
    <div class="container">
      <h1>Register</h1>
      
      <hr>
      <label for="empId"><b>Employee ID</b></label>
      <input type="text" placeholder="Enter Employee ID" name="empId" required>
      <label for="firstName"><b>First Name</b></label>
      <input type="text" placeholder="Enter First Name" name="firstName" required>
      <label for="lastName"><b>Last Name</b></label>
      <input type="text" placeholder="Enter Last Name" name="lastName" required>
      <br>
      <label for="gender"><b>Gender</b></label>
      <select name="gender">
        <option value="male">Male</option>
        <option value="female">Female</option>
      </select>
      <br><br>
      <label for="contactNumber"><b>Contact Number</b></label>
      <input type="text" placeholder="Enter Conatct Number" name="contactNumber" required>
      <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" required>
  
      <label for="password"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>
  
      <label for="branch"><b>Branch</b></label>
      <input type="text" placeholder="Enter Branch" name="branch" required>
      <hr>
  
      
      <button type="submit" class="registerbtn">Register</button>
    </div>
  
   
  </form>
</body>
</html>