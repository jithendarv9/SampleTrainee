<!DOCTYPE html>
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
  border-right:1px solid #bbb;
}

li:last-child {
  border-right: none;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #04AA6D;
}
</style>
</head>
<body>

<ul>
  <li><a class="active" href="Home">Home</a></li>
  <li><a href="addplanes">Add Planes</a></li>
  <li><a href="insert">Add Pilots</a></li>
  <li><a href="Hanger">Add Hangar Details</a></li>
  <li><a href="hangerstatus">Hanger Status</a></li>

</ul>

</body>
</html>

