<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hanger Status</title>
    <script>
    function validate(){

    var hno = document.getElementById('hno').value;
    var date1 = new Date(document.getElementById("fromdate").value);
    var date2= new Date(document.getElementById("todate").value);
    var fromdate=date1.getFullYear()+"-"+(date1.getMonth()+1) +"-"+date1.getDate();
    var todate=date2.getFullYear()+"-"+(date2.getMonth()+1) +"-"+date2.getDate();
    console.log(fromdate);
    console.log(todate);
window.location.href=window.location.origin+"/SampleTrainee/hangerstatus2/"+hno+"/"+fromdate+"/"+todate;
    }
    </script>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
   <div class="navbar-nav">
         <a class="nav-item nav-link" href="Home">Home</a>
         <a class="nav-item nav-link" href="addplanes">Add Planes</a>
         <a class="nav-item nav-link" href="insert">Add Pilots</a>
         <a class="nav-item nav-link" href="Hanger">Add Hangar Details</a>

         <a class="nav-item nav-link active" href="hangerstatus">Hanger Status</a>
       </div>
    </div>
  </nav>
<div class="container p-5">
<form action="#" method="get" modelAttribute="list" >
<table class="table table-bordered">
<tr>
<td>Hanger No</td>
<td>
 <select id="hno">
     <option>-Select-</option>
     <c:forEach var="stat" items="${list}">

         				<option>${stat.hangerNumber}</option>

         		</c:forEach>
 </select>
</tr>
<tr>
    <td>
        From Date Booked
    </td>
    <td>
        <input type="date" id="fromdate" required>
    </td>
</tr>
<tr>
        <td>
            To Date Booked
        </td>
       <td>
        <input type="date" id="todate" required>
    </td>
</tr>
<tr>
     <td>
            <button class="btn btn-primary" type="button" onclick="validate()">Get Status</button>

     </td>
     <td>
            <input class="btn btn-primary" type="reset" value="Reset">
     </td>
</tr>
</table>
</form>
</div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>


