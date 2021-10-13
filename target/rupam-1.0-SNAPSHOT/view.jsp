<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="model.Books"%>
    <%@page import="java.util.ArrayList"%>
<html>
    <title>W3.CSS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
    
  <ul class="w3-ul">
<a href="index.jsp">   <li class="w3-xxlarge"><i class="fa fa-home"></i></li></a> 
  </ul>

    <table border="2">
    <tr>

        <td>Book Code</td>
    
        <td>Player Team Name</td>
    
        <td>Player Number</td>
    
        <td>player Salary in cr</td>
    
        <td>Number of Ads</td>

        <td>Number of Ads</td>

        <td>Number of Ads</td>

        <td>Number of Ads</td>

        <td>Number of Ads</td>

        <td>Number of Ads</td>

        <td>Number of Ads</td>

        <td>Number of Ads</td>

    
        </tr>
<!-- <h2>Hello World!</h2> -->
<a href="<%=request.getContextPath()%>/view">Get all players</a>
<%ArrayList<Books> bookslist = (ArrayList<Books>)request.getAttribute("booklist");
    for(Books book:bookslist){%>
    <%-- Arranging data in tabular form
    --%>
    <tr>
      <td><%=book.getBcode()%></td>  
      <td><%=book.getBprice()%></td>  
      <td><%=book.getBname()%></td>  
      <td><%=book.getBlang()%></td>  
      <td><%=book.getBdate()%></td>  


      <!-- authors -->

      <td><%=book.getAuthcode()%></td>  
      <td><%=book.getAuthname()%></td>  
      <td><%=book.getAuthlname()%></td>  


      <td><%=book.getPcode()%></td>  
      <td><%=book.getPfname()%></td>  
      <td><%=book.getPlname()%></td>  
      <td><%=book.getPcountry()%></td>  

    </tr>
        
<%}%>
</table>
</body>
</html>
