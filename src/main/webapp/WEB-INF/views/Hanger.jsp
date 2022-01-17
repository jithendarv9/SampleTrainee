<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
     <!-- Required meta tags -->
        <meta charset="utf-8">

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <script type="text/javascript">
         function showMessage(){
         alert("Hanger has been submitted");
         }
  </script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
   <div class="navbar-nav">
           <a class="nav-item nav-link" href="Home">Home</a>
           <a class="nav-item nav-link" href="addplanes">Add Planes</a>
           <a class="nav-item nav-link" href="insert">Add Pilots</a>
           <a class="nav-item nav-link active" href="Hanger">Add Hangar Details</a>

           <a class="nav-item nav-link " href="hangerstatus">Hanger Status</a>
         </div>
  </div>
</nav>
<div style="position:absolute;top:70px;left:0px;width:100%;height:20%">
<div class="container p-6">
<form:form action="SaveHanger" modelAttribute="hanger" method="post">
<h2>Hanger Details</h2>
 	<table style="border:1px solid black;margin-left:auto;margin-right:auto;">
        				<tr>
        					<td>Hanger Location</td><td><form:input type="text" path="hangerLocation" /></td>
        				</tr>
        				<tr>
        					<td>Hanger Capacity</td><td><form:input type="number" path="hangerCapacity" /></td>
        				</tr>
        				<tr>
        					<td>Manager Name</td><td><form:input type="text" path="managerName" /></td>
        				</tr>
        					<tr>
        					<td>Social Security No</td><td><form:input type="number" path="socialSecurityNo" /></td>
        				</tr>
        				<tr>
        					<td>Date of birth</td><td><form:input type="text" path="dob" /></td>
        				</tr>
        				<tr>
        				   <td>Gender</td><td><form:input type="text" path="gender" /></td>
        				</tr>
        				<tr>
                            <td>Mobile No</td><td><form:input type="text" path="mobileNo" /></td>
                        </tr>
                        <tr>
                            <td>Email</td><td><form:input type="email" path="email" /></td>
                        </tr>
                        <tr>
                            <td>House No</td><td><form:input type="number" path="houseNo" /></td>
                        </tr>
                        <tr>
                            <td>Address</td><td><form:input type="text" path="address" /></td>
                        </tr>
                        <tr>
                        <tr>
                            <td>City</td><td><form:input type="text" path="city" /></td>
                        </tr>
                        <tr>
                             <td>State</td><td><form:input type="text" path="state" /></td>
                        </tr>

                           <td>Country</td><td><form:input type="text" path="country" /></td>
                        </tr>
                        <tr>
                            <td>Pin No</td><td><form:input type="number" path="pinNo" /></td>
                        </tr>
                        <tr>

                           <td></td><td><input type="submit" onclick="showMessage()" value="Submit" /></td>
        			     </tr>
        			     <tr>
        			     <td><a href="Hanger">Add New Hangers.....</a><td>
        			     </tr>
        			     </table>

                </form:form>
                </div>
                </body>
                </html>
