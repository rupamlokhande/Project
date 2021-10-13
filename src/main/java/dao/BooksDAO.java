package dao;

//import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Books;
import utility.ConnectionManager;

public class BooksDAO implements BooksDAOInterface {
    //private static final String INSERT_BLOG_SQL = "INSERT INTO blog(blogId, blogTitle, blogDescription, postedOn)values(blog_seq.nextval,?,?,?)";
	private static final String GET_ALL_PLAYERS = "SELECT * FROM books";
	// public void insertBlog(Blog blog) throws SQLException {
	// 	System.out.println("Insert blog Invoked");
	// 	try(Connection con=ConnectionManager.getConnection();
	// 			PreparedStatement ps=con.prepareStatement(INSERT_BLOG_SQL)){
	// 		ps.setString(1, blog.getBlogTitle());
	// 		ps.setString(2,blog.getBlogDescription());
	// 		ps.setDate(3, java.sql.Date.valueOf(blog.getPostedOn()));
	// 		ps.executeUpdate();
			
	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 	} catch (ClassNotFoundException e) {
			
	// 		e.printStackTrace();
	// 	} catch (IOException e) {
	// 		e.printStackTrace();
	// 	} 
	// }
		
	//@Override
	public List<Books> getAllBooks() {
		Books books;
		List<Books> BooksList = new ArrayList<Books>();
		try(
            Connection con=ConnectionManager.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_ALL_PLAYERS);){
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				books =  new Books();
				books.setBcode(rs.getString("BCODE"));
				books.setBprice(rs.getString("BPRICE"));
				books.setBname(rs.getString("BNAME"));
				books.setBlang(rs.getString("BLANG"));
				books.setBdate(rs.getString("BDATE"));
				books.setAuthcode(rs.getString("AUTHCODE"));
				books.setAuthname(rs.getString("AUTHNAME"));
				books.setAuthlname(rs.getString("AUTHLNAME"));
				System.out.println(rs.getString("AUTHLNAME"));
				books.setPcode(rs.getString("PCODE"));
				books.setPfname(rs.getString("PFNAME"));
				books.setPlname(rs.getString("PLNAME"));
				books.setPcountry(rs.getString("PCOUNTRY"));
				BooksList.add(books);
			}
		}
        catch(Exception e) {
			e.printStackTrace();
		}
		return BooksList;
    }   


	
}
