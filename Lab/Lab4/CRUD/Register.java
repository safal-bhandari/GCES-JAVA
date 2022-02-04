import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import database.connectDB;

public class Register extends JFrame implements ActionListener {
	JButton register;
	JLabel Student_Name, email_label, password_label, repassword_label, result;
	JTextField user, email;
	JPasswordField password, repassword;

	Register(){
		Student_Name = new JLabel("Name: ");
		Student_Name.setBounds(20, 30, 150, 80);

		email_label = new JLabel("Email: ");
		email_label.setBounds(20, 90, 150, 80);

		password_label = new JLabel("Password: ");
		password_label.setBounds(20, 120, 100, 70);

		repassword_label = new JLabel("Re-Type Password: ");
		repassword_label.setBounds(20, 150, 150, 70);

		user = new JTextField();
		user.setBounds(190, 55, 100, 20);

		email = new JTextField();
		email.setBounds(190, 115, 100, 20);

		password = new JPasswordField();
		password.setBounds(190, 145, 100, 20);

		repassword = new JPasswordField();
		repassword.setBounds(190, 175, 100, 20);

		register = new JButton("Register");
		register.setBounds(20, 220, 100, 30);

		result = new JLabel();
		result.setForeground(Color.red);
		result.setBounds(20, 270, 200, 30);

		add(Student_Name);
		add(user);
		add(email_label);
		add(email);
		add(password_label);
		add(password);
		add(repassword_label);
		add(repassword);
		add(register);
		add(result);

		setSize(400,500);  
		setLayout(null);  
		setVisible(true);  
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		//action
		register.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String student_text = user.getText();
		String email_text = email.getText();
		String password_text = new String(password.getPassword());
		String repassword_text = new String(repassword.getPassword());
		if(student_text.length() == 0 || email_text.length() == 0 || password_text.length() == 0 || repassword_text.length() == 0){
			result.setText("Empty field found..");
		}else {
			if(!password_text.equals(repassword_text)){
				result.setText("Ops it didn't match!");
			}else {
				String query = "INSERT INTO users(`student`, `email`, `password`) VALUES(?,?,?)";  
				
				try {
					connectDB DB = new connectDB();
					Connection con = DB.connect();
					
					PreparedStatement ps = con.prepareStatement(query);  
					ps.setString(1, student_text);
					ps.setString(2, email_text);
					ps.setString(3, password_text);
					ps.executeUpdate();
					result.setText("Insert Successfully!");
					
					//empty everything
					user.setText("");
					email.setText("");
					password.setText("");
					repassword.setText("");

				} catch(Exception err){
					System.out.println(err.getMessage());
				}
			}
		}
		
	}

	public static void main(String[] args){
		new Register();
	}
}
