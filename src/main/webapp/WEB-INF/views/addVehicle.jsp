<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Vehicle</title>
</head>
<body>
<form action="addVehicle.html" method="post">
  Vehicle Number:<br>
  <input type="text" name="vehicleNumber"><br>
  Branch:<br>
  <input type="text" name="brach" ><br>
  <br>
  Vehicle Type:<br>
  <input type="text" name="vehicleType" ><br>
  <br>
  Insurance Expiry:<br>
  <input type="date" name="insuranceExpiry" value=""><br>
  <br>
  Last Service:<br>
  <input type="date" name="lastService" value=""><br>
  <br>
  Service Due Date:<br>
  <input type="date" name="serviceDue" value=""><br>
  <br>
  <input type="submit" value="Submit">
</form>
</body>
</html>