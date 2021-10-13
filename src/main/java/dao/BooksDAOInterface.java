package dao;

//import java.sql.SQLException;
import java.util.List;
import model.Books;

public interface BooksDAOInterface {
    //void insertPlayer(Player player) throws SQLException;
	List<Books> getAllBooks();
}
