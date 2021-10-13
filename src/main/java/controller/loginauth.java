package controller;
// package dao;


import java.sql.*;
import java.io.IOException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class loginauth {
    public boolean validate(String name,String pass){  
    boolean status=false;  
    try{  
        Class.forName("oracle.jdbc.OracleDriver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@ec2-18-213-11-76.compute-1.amazonaws.com:1521/pdb1","RUPAM_LOKHANDE","rupam_lokhande");

        // PreparedStatement ps=con.prepareStatement("select * from userreg where name=? and pass=?");  
        // ps.setString(1,name);  
        // ps.setString(2,pass);   
        PreparedStatement ps = con.prepareStatement("select * from users where username=? and password = ?");
        ps.setString(1, name);
        ps.setString(2, pass);
        ResultSet rs=ps.executeQuery();  
        status=rs.next();    
    }
    catch(Exception e){
        System.out.println(e);
    }  
    return status;  
    }   
}