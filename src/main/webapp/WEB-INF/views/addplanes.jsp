<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ page isELIgnored="false" %>
<html>
<head>
<script type="text/javascript">
         function showMessage(){
         alert("Planes has been submitted");
         }
  </script>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body style="background-color:powderblue">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
   <div class="navbar-nav">
           <a class="nav-item nav-link" href="Home">Home</a>
           <a class="nav-item nav-link active" href="addplanes">Add Planes</a>
           <a class="nav-item nav-link" href="insert">Add Pilots</a>
           <a class="nav-item nav-link" href="Hanger">Add Hangar Details</a>

           <a class="nav-item nav-link " href="hangerstatus">Hanger Status</a>
         </div>
  </div>
</nav>
<div class="alert alert-danger" role="alert">

    <form:errors path="AddPlanes.*"></form:errors>
</div>

<a href="addplanes">Add New Plane.....</a>
<div class="container-fluid">
<form:form action="SavePlanes" modelAttribute="AddPlanes" method="POST">
    <table>
        <tr><strong><td>Mfg Name</td></strong><td><form:input type="text" path="mfgName"/></td></tr>
        <tr><td>Reg No</td><td><form:input type="text" path="regNo" />  </td></tr>
        <tr><td>Model No</td><td><form:input type="text" path="modelNo"/>  </td></tr>
        <tr><td>Plane No</td><td><form:input type="text" path="planeNo"/>  </td></tr>
        <tr><td>Plane Name</td><td><form:input type="text" path="planeName"/>  </td></tr>
        <tr><td>Capacity</td><td><form:input type="text" path="capacity"/>  </td></tr>
        <tr><td>Email</td><td><form:input type="text" path="email"/>  </td></tr>
        <tr><td>House No</td><td><form:input type="text" path="houseNo"/>  </td></tr>
        <tr><td>Address</td><td><form:input type="text" path="address"/>  </td></tr>
        <tr><td>City</td><td><form:input type="text" path="city"/>  </td></tr>
        <tr><td>State</td><td><form:input type="text" path="state"/>  </td></tr>
        <tr><td>Country</td><td><form:input type="text" path="country"/>  </td></tr>
        <tr><td>Pin No</td><td><form:input type="text" path="pinNo"/>  </td></tr>

        <tr><td><input type="submit" class="btn btn-primary" onclick="showMessage()" value="Submit"/>  </td></tr>
         <tr><td><input type="reset" class="Reset"/></td></tr>
    </table>
</form:form>
</div>
</body>
</html>






