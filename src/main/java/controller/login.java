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


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("useremail");
		String pwd=request.getParameter("userpwd");
		
		App ap = new App();
        System.out.println(username);
        System.out.println(pwd);
		// ops login = new ops();
		// login.login(username, pwd);
		loginauth login = new loginauth();
		if(login.validate(username, pwd)){
			ap.mailer(username,"Some one just signed in your account","Sign in Alert");
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
        	rd.forward(request,response);  
		}
		else{
				RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");  
				rd.forward(request,response);
				
		}

    //     ops login = new ops();
    //    String status =  login.login(username, pwd);
    //    System.out.println(status);
       


		// // Author
		
		// String authcode=request.getParameter("authcode");
		// String authname=request.getParameter("authname");
		// String authlname=request.getParameter("authlname");
		
		// String pcode=request.getParameter("pcode");
		// String pfname=request.getParameter("pfname");
		// String plname=request.getParameter("plname");
		// String pcountry=request.getParameter("pcountry");

        // System.out.println(bcode);
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

		// RequestDispatcher rd=request.getRequestDispatcher("request.getContextPath()/view");
		// rd.forward(request, response);
		// // PrintWriter out=response.getWriter();  
		// //HttpSession session=request.getSession(true);

	}


}


