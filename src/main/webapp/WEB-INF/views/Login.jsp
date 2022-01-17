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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>



<div class="container-fluid">
 <!-- Full Page Intro -->
          <div class="view" style="background-image: url('https://mdbootstrap.com/img/Photos/Horizontal/Nature/full page/img(11).jpg'); background-repeat: no-repeat; background-size: cover; background-position: center center;">
            <!-- Mask & flexbox options-->

<form  action="loginProcess" modelAttribute="login" method="post">
<div class="row">
  <div class="card col-md-6 offset-md-3">
    <div class="row">
      <h3 class="text-center" font="Times New Roman">Login Page</h3>
      <div class="card-body">
          <form (ngSubmit)="onSubmit()" >
          <!-- Jumbotron -->
          <div
            class="bg-image p-5 text-center shadow-1-strong rounded mb-5 text-white"
            style="background-image: url('https://mdbootstrap.com/img/new/slides/003.jpg');"
          >
            <h1 class="mb-3 h2">Airport Management System</h1>

            <p>

            </p>
          </div>
          <!-- Jumbotron -->
<div class="form-group">
            <label>User Name</label>
            <input type="text" class="form-control" id="username" name="username" [(ngModel)]="LoginPage.username">
             <div id="emailHelp" class="form-text">We'll never share your information with anyone else.</div>
          </div><div class="mb-3">
  <div class="form-group">
              <label>Password</label>
              <input type="password" class="form-control" id="password" name="password" [(ngModel)]="LoginPage.password">
            </div>
 <br>
          <button class="btn btn-primary active" type="submit">Submit</button>
          <c:if test="${!empty S1}">
          <c:out value="${S1}"/>
          </c:if>

<div class="successtext">
<div class=class="$indigo:  #6610f2 p-2 text-dark bg-opacity-10"">Thanks for signing up! Check your email for confirmation.</div>

                    </div>
            </div>
        </div>
        <div class="forgot"> <a href="#">Forgot your password?</a> </div>
        <div>
</form>

</div>
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
          <span class="me-3">Register for free</span>
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


