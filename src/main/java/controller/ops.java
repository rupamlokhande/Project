package controller;

import utility.ConnectionManager;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ops {
    public boolean validate(String bcode, String bprice, String bname, String blang, String bdate, String authcode,
            String authname, String authlname, String pcode, String pfname, String plname, String pcountry) {
        boolean status = false;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","examly");
            Connection con = ConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "insert into books(bcode,bprice,bname,blang,bdate,authcode,authname,authlname,pcode,pfname,plname,pcountry) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, bcode);
            ps.setString(2, bprice);
            ps.setString(3, bname);
            ps.setString(4, blang);
            ps.setString(5, bdate);
            ps.setString(6, authcode);
            ps.setString(7, authname);
            ps.setString(8, authlname);
            ps.setString(9, pcode);
            ps.setString(10, pfname);
            ps.setString(11, plname);
            ps.setString(12, pcountry);

            ps.executeUpdate();
            status = true;

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public String update(String bcode, String newname) {
        String status = "NOT INITIATED";
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","examly");
            Connection con = ConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement("update books set BNAME=? where BCODE=? ");
            ps.setString(1, newname);
            ps.setString(2, bcode);

            ps.executeUpdate();
            status = "UPDATED";

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public String signup(String useremail, String userpassword) {
        String status = "NOT INITIATED";
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","examly");
            Connection con = ConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into users(username,password)values(?,?)");
            ps.setString(1, useremail);
            ps.setString(2, userpassword);

            ps.executeUpdate();
            status = "INSERTED";

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
//     public boolean login(String useremail, String userpassword) {
//         // String status = "NOT INITIATED";
//         boolean status1;
//         try {
//             // Class.forName("com.mysql.jdbc.Driver");
//             // Connection
//             // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","examly");
//             Connection con = ConnectionManager.getConnection();
            // PreparedStatement ps = con.prepareStatement("select * from users where username=? and password = ?");
            // ps.setString(1, useremail);
            // ps.setString(2, userpassword);
//             ResultSet rs=ps.executeQuery();

            
//             // System.out.println("Result set "+rs);

//             String dbuser,dbpwd;
//             status1 = rs.next();
//             System.out.println(status1);
            
            
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         return status1;
//     }
// }
}