import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import database.connectDB;

public class Update extends JFrame implements ActionListener {
	JButton update;
	JPasswordField current_password, new_password;
	JLabel title, result, Student_Name, current_password_label, latest_password_label;
	JTextField name_text;

	Update(){
		title = new JLabel("Update Password");
		title.setBounds(20, 30, 150, 70);
		title.setForeground(Color.orange);	

		Student_Name = new JLabel("Name: ");
		Student_Name.setBounds(20, 100, 150, 70);

		current_password_label = new JLabel("Current Password: ");
		current_password_label.setBounds(20, 140, 150, 70);

		latest_password_label = new JLabel("New Password: ");
		latest_password_label.setBounds(20, 170, 150, 70);

		name_text = new JTextField();
		name_text.setBounds(170, 100, 150, 30);

		current_password = new JPasswordField();
		new_password = new JPasswordField();
		current_password.setBounds(170, 143, 150, 30);
		new_password.setBounds(170, 192, 150, 30);

		update = new JButton("Update");
		update.setBounds(20, 250, 90, 30);

		result = new JLabel();
		result.setForeground(Color.red);
		result.setBounds(20, 350, 350, 50);

		add(title);
		add(Student_Name);
		add(current_password_label);
		add(latest_password_label);	
		add(update);
		add(name_text);
		add(current_password);
		add(new_password);
		add(result);

		setSize(400,500);  
		setLayout(null);  
		setVisible(true);  
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		update.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){
		String nameText = name_text.getText();
		String currentPassword = new String(current_password.getPassword());
		String newPassword = new String(new_password.getPassword());
		if(nameText.length() == 0 || currentPassword.length() == 0 || newPassword.length() == 0){
			result.setText("Can't update the empty field!");
		} else {
			String query = "UPDATE users SET password = ? WHERE fname = ? && password = ?";
				try {
					connectDB DB = new connectDB();
					Connection con = DB.connect();
					
					PreparedStatement ps = con.prepareStatement(query);  
					ps.setString(1, newPassword);
					ps.setString(2, nameText);
					ps.setString(3, currentPassword);
					int row = ps.executeUpdate();
					if(row != 0){
						result.setText("Password Updated!");
						
						//empty everything
						name_text.setText("");
						current_password.setText("");
						new_password.setText("");
					}else {
						result.setText("Couldn't find");
					}	
			} catch(Exception err){
				System.out.println(err.getMessage());
			}
		}	
	}
	
	public static void main(String[] args){
		new Update();
	}
}
