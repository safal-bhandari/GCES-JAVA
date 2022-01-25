import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");
		
		Statement st = con.createStatement();
		
		String query = "update user set username='Safal' where id=1";
		
		int rows = st.executeUpdate(query);
		
		System.out.println("Update Successfully");

		con.close();
		
	}

}