import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");

		Statement st = con.createStatement();

		String query = "INSERT INTO user (`username`, `email`, `password`, `user_type`) VALUES ('Safal', 'safal@gmail.com', 'safal', 2)";
		
		int rows = st.executeUpdate(query);
		
		System.out.println("Added Successfully");

		con.close();
		
	}

}