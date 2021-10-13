package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;


@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public signup() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String useremail=request.getParameter("useremail");
		String userpwd=request.getParameter("userpwd");
        
        System.out.println(useremail);
        System.out.println(userpwd);

        ops adduser=new ops();
        String status = adduser.signup(useremail, userpwd);
        System.out.println(status);


		App ap = new App();
        ap.mailer(useremail,"Congratulations!! You got successfully signed Up ","Welcome To BooksStore");

		// String bname=request.getParameter("bname");
		// String blang=request.getParameter("blang");
		// String bdate=request.getParameter("bdate");

		// // Author
		
		// String authcode=request.getParameter("authcode");
		// String authname=request.getParameter("authname");
		// String authlname=request.getParameter("authlname");
		
		// String pcode=request.getParameter("pcode");
		// String pfname=request.getParameter("pfname");
		// String plname=request.getParameter("plname");
		// String pcountry=request.getParameter("pcountry");

        // System.out.println(bprice);
        // System.out.println(bname);
        // System.out.println(blang);
        // System.out.println(bdate);
		
        // System.out.println(authcode);
        // System.out.println(authname);
        // System.out.println(authlname);

		// System.out.println(pcode);
        // System.out.println(pfname);
        // System.out.println(plname);
		// System.out.println(pcountry);


		// ops d1 = new ops();
        // System.out.println(d1.validate(bcode,bprice,bname,blang,bdate,authcode,authname,authlname,pcode,pfname,plname,pcountry));

		// RequestDispatcher rd=request.getRequestDispatcher("");
		// rd.forward(request, response);
		// PrintWriter out=response.getWriter();  
		//HttpSession session=request.getSession(true);

	}


}


