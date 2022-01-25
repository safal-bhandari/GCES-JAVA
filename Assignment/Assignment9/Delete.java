import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");
		
		Statement st = con.createStatement();
		
		String query = "delete from  user where id=3";
		
		int rows = st.executeUpdate(query);
		
		System.out.println("Delete Successfully");

		con.close();
		
	}

}