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
    <center>
    <div class="form">
      <h2 style ="color:white">Enter Book Details</h2>
      
      <form action="display" method="GET">
			<p style ="color:white">Book Code: </p>   <br>  <input type="text" name="bcode" /><br>
			<p style ="color:white">Book Price:  </p> <br>  <input type="text" name="bprice" /><br>
			<p style ="color:white">Book Title:</p>  <br>   <input type="text" name="bname" /><br>
			<p style ="color:white">Book Language: </p> <br> <input type="text" name="blang" /><br>
			<p style ="color:white">Published Date: </p><br><input type="text" name="bdate" /><br>
	<!-- <input type="submit" align="center" value="display"/>  -->
	<br>
	<br>
	<h2 style ="color:white">Enter Author Details</h2>
			<p> Author code: </p><br> <input type="text" name="authcode" /><br>
			<p>Author First Name: </p><br><input type="text" name="authname" /><br>
			<p>Author Last Name: </p><br><input type="text" name="authlname" /><br>
	<br><br>		
	<h2 style ="color:white">Enter Publisher Details</h2>
	<p>Publisher Code: </p><br><input type="text" name="pcode" /><br>
	<p>Publisher First Name: </p><br><input type="text" name="pfname" /><br>
	<p>Publisher Last Name: </p><br><input type="text" name="plname" /><br>
	<p>Publisher Country: </p><br><input type="text" name="pcountry" /><br>
	<br>
	<br>
	<input type="submit" align="center" value="display"/>
	</form>
  	</div>
  	</center>
  
  <!--  
  <h2>Enter Author Details</h2>
	<form action="display" method="post">
	<p> Author code: </p><br> <input type="text" name="username" /><br>
	<p>Author First Name: </p><br><input type="text" name="username1" /><br>
	<p>Author Last Name: </p><br><input type="text" name="username1" /><br>
	<!-- <input type="submit" align="center" value="display"/> 

	</form>
  
    




<div>

<div><h2>Enter Publisher Details</h2>
<form action="display" method="post">
Publisher Code: <br><input type="text" name="username" /><br>
Publisher First Name: <br><input type="text" name="username1" /><br>
Publisher Last Name: <br><input type="text" name="username" /><br>
Publisher Country: <br><input type="text" name="username1" /><br>
<input type="submit" align="center" value="display"/>

</form>
    
-->
  </body>