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


@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public update() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oldbook=request.getParameter("oldbook");
		String newbook=request.getParameter("newbook");

        System.out.println(oldbook);
        System.out.println(newbook);

        ops d1 = new ops();
        String status = d1.update(oldbook, newbook);
        System.out.println(status);
        
		// PrintWriter out=response.getWriter();  
		//HttpSession session=request.getSession(true);

	}


}


