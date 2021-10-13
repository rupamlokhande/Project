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
  <body class="text-center">
  
  <!--
  <h2>Register</h2>

    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
--> <center>
    <div class="clearfix">
      <!-- <button type="button" class="cancelbtn">Cancel</button>
      
      <div class="button-area-line">
      -->
      <h1 align=text-center>Books Details</h1>
      <br>
      <a href="searchbook.jsp"><button type="submit" class="signupbtn">Search Books</button></a>
      <a href="addbook.jsp"><button type="submit" class="signupbtn">Add Books</button></a>
      <a href="removebook.jsp"><button type="submit" class="signupbtn">Remove Books</button></a>
      <a href="updatebook.jsp"><button type="submit" class="signupbtn">Update Books</button></a>
      <a href="filterbook.jsp"><button type="submit" class="signupbtn">Filter Books</button></a>
      <a href="mailer.jsp"><button type="submit" class="signupbtn">Filter Books</button></a>

      <a href="<%=request.getContextPath()%>/view"><button type="submit" class="signupbtn">View Books</button></a>
      
    </div>
    </center>
  </body>
</html>