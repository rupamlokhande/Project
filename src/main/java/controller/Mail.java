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


@WebServlet("/mail")
public class Mail extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Mail() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Reached");
        App ap = new App();
        ap.mailer("gptrupam@gmail.com");

        // PrintWriter out=response.getWriter();  
		//HttpSession session=request.getSession(true);

	}


}


