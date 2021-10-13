<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>repl.it</title>
    <link href="style.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
  <!--  
  <div class="clearfix">
    <table><tr><td><form action="display" method="post">
    <br><br><br><br>
	Enter Book Name:<input type="text" name="username" /><br></td>
    <!-- <td>Enter Book Code:<input type="text" name="username1" /><br></td>  
    </tr></table>
  <br>
  <button type="submit" class="signupbtn">Remove</button></a> 
<!--
<input type="submit" align="center" value="Remove"/>
</div>
-->

	<center>
    <div class="form">
      <h2 style ="color:white">Enter Book Details</h2>
      
      <form action="remove" method="GET">
			<p style ="color:white">Enter Book Name: </p>   <br>  <input type="text" name="remove" /><br>
	<br>
	<button type="submit" class="signupbtn">Remove</button></a> 
	
	</form>
  	</div>
  	</center>
  	
  </body>
</html>