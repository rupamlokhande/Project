package controller;

import java.io.IOException;
//import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BooksDAO;
import model.Books;

@WebServlet("/view")
public class GetAllPlayerController extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
 
    public GetAllPlayerController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get all players");
		BooksDAO booksdao = new BooksDAO();
		Books books=new Books();
		List<Books> bookslist = booksdao.getAllBooks();
		for(Books bookslists:bookslist) {
			System.out.println(bookslists.getBcode());
		}
		request.setAttribute("booklist", bookslist);
		// request.setAttribute("id", books.getBcode());
		RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
