import javax.swing.*;
import java.sql.*;
import database.connectDB;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Read extends JFrame {
	JTable table;
	JScrollPane sp;
	Read() {
		String columns[] = { "ID", "Student_Name", "Email" };
		String data[][] = new String[41][9];
		try {
			connectDB DB = new connectDB();
			Connection con = DB.connect();
			Statement st = con.createStatement();
			String query = "SELECT * FROM users;";

			ResultSet rs = st.executeQuery(query);
			int i = 0;
			while(rs.next()){
				int id = rs.getInt("id");
				String student = rs.getString("student");
				String email = rs.getString("email");
				data[i][0] = id + "";
				data[i][1] = student;
				data[i][2] = email;
				i++;
			}

			table = new JTable(data, columns);
			table.setBounds(30,40,250,350);          
			add(table);     
			sp= new JScrollPane(table);    
    		add(sp);               
			setSize(500,600);    
			setVisible(true);  
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		} catch(Exception err){
			System.out.println(err.getMessage());
		}
	}
	public static void main(String[] args) {
		new Read();
	}
}

