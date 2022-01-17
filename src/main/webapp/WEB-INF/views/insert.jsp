<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false"%>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script type="text/javascript">
     function showMessage(){
     alert("Pilot Added Successfully" +UID);
     }
</script>
<body>
 <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="navbar-nav">
          <a class="nav-item nav-link" href="Home">Home</a>
          <a class="nav-item nav-link" href="addplanes">Add Planes</a>
          <a class="nav-item nav-link active" href="insert">Add Pilots</a>
          <a class="nav-item nav-link" href="Hanger">Add Hangar Details</a>

          <a class="nav-item nav-link " href="hangerstatus">Hanger Status</a>
        </div>
     </div>
   </nav>
<div class="container-fluid">
<!-- Full Page Intro -->
          <div class="view" style="background-image: url('https://mdbootstrap.com/img/Photos/Horizontal/Nature/full page/img(11).jpg'); background-repeat: no-repeat; background-size: cover; background-position: center center;">
            <!-- Mask & flexbox options-->
<form action="SaveEmp" modelAttribute="addpilot" method="post">
<div class="row">
  <div class="card col-md-6 offset-md-3">
    <div class="row">
      <h3 class="text-center" font="Times New Roman">Add Pilot Details</h3>
      <div class="card-body">
          <form (ngSubmit)="onSubmit()" >
<div class="form-group">
  <label>Pilot Name</label>
            <input type="text" class="form-control" id="PilotName" name="PilotName" [(ngModel)]="AMSystem.PilotName">
          </div><div class="mb-3">
  <div class="form-group">
   <label>License Number</label>
              <input type="text" class="form-control" id="license" name="license" [(ngModel)]="AMSystem.license">
            </div>
<div class="form-group">
  <label>Social Security Number </label>
            <input type="number" class="form-control" id="SSN" name="SSN" [(ngModel)]="AMSystem.SSN">
  <div class="form-group">
  <label>Date Of Birth</label>
              <input type="text" class="form-control" id="dob" name="dob" [(ngModel)]="AMSystem.dob">
            </div>
<div class="form-group">
  <label>Gender</label>
            <input type="text" class="form-control" id="Gender" name="Gender" [(ngModel)]="AMSystem.Gender">
          </div><div class="mb-3">
  <div class="form-group">
  <label>Mobile Number</label>
              <input type="tel" class="form-control" id="MobileNo" name="MobileNo" [(ngModel)]="AMSystem.MobileNo">
            </div>
<div class="form-group">
  <label>Email Id</label>
            <input type="text" class="form-control" id="Email" name="Email" [(ngModel)]="AMSystem.Email">
          </div><div class="mb-3">
  <div class="form-group">
  <label>Address</label>
              <input type="text" class="form-control" id="Address" name="Address" [(ngModel)]="AMSystem.Address">
            </div>
<div class="form-group">
  <label>Address Line1</label>
            <input type="text" class="form-control" id="AddressLine1" name="AddressLine1" [(ngModel)]="AMSystem.AddressLine1">
          </div><div class="mb-3">
  <div class="form-group">
  <label>City Name</label>
              <input type="text" class="form-control" id="city" name="city" [(ngModel)]="AMSystem.city">
            </div>
<div class="form-group">
  <label>State Name</label>
            <input type="text" class="form-control" id="State" name="State" [(ngModel)]="AMSystem.State">
          </div><div class="mb-3">
<div class="form-group">
  <label>Country Name</label>
              <input type="text" class="form-control" id="Country" name="Country" [(ngModel)]="AMSystem.Country">
            </div>
<div class="form-group">
  <label>City Pin Code</label>
            <input type="number" class="form-control" id="PinNo" name="PinNo" [(ngModel)]="AMSystem.PinNo">
          </div><div class="mb-3">

 <br>
          <button class="btn btn-primary active"  type="submit" onclick="showMessage()" value="submit">Submit</button>
 <div class="successtext">
                   <p> Thanks for add pilot details Check your email for confirmation.</p>
                     </div>
                      </div>
                  </div>
          </form>



</div>
    </div>

  </div>

</div>

</body>
</html>
<section class="card-body">
  <!-- Footer -->
  <footer class="text-center text-white" style="background-color: #0a4275;">
    <!-- Grid container -->
    <div class="container p-4 pb-0">
      <!-- Section: CTA -->
      <section class="">
        <p class="d-flex justify-content-center align-items-center">
          <span class="me-3">Thank You For Visiting </span>
          <button type="button" class="btn btn-outline-light btn-rounded">
            Sign up!
          </button>
        </p>
      </section>
      <!-- Section: CTA -->
    </div>
    <!-- Grid container -->

    <!-- Copyright -->
    <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
      © 2020 Copyright:
      <a class="text-white" href="https://mdbootstrap.com/">Airport Management System</a>
    </div>
    <!-- Copyright -->
  </footer>
  <!-- Footer -->
</section>


