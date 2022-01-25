import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");

		Statement st = con.createStatement();

		String query = "SELECT * from user";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("ID = " + rs.getInt(1));
			System.out.println("Username = " + rs.getString(2));
			System.out.println("Email = " + rs.getString(3));
			System.out.println("Password = " + rs.getString(4));
			System.out.println("User Type = " + rs.getInt(5));
			System.out.println("");
		}

		con.close();
	}

}