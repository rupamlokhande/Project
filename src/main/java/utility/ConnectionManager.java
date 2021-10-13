package utility;

import java.io.IOException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Properties;

public class ConnectionManager {
 
	public final static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@ec2-18-213-11-76.compute-1.amazonaws.com:1521/pdb1","RUPAM_LOKHANDE","rupam_lokhande");
		if(con!=null) {
			System.out.println("Connection Established to database");
			return con;
		}
		else {
			System.out.println("Check your connection");
			return null;
		}
	}
}
