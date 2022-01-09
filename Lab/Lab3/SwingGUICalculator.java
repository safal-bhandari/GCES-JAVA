import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;

public class SwingGUICalculator implements ActionListener {
    
    public static JFrame f=new JFrame();
    public static JLabel l1=new JLabel("First Number");
    public static JLabel l2=new JLabel("Second Number");
    public static JLabel l3=new JLabel("Result");
    public static JTextField t1=new JTextField();
    public static JTextField t2=new JTextField();
    public static JTextField t3=new JTextField();
    public static JButton b1=new JButton("+");
    public static JButton b2=new JButton("-");
    public static JButton b3=new JButton("*");
    public static JButton b4=new JButton("/");

    SwingGUICalculator() {  

    l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
l3.setBounds(50,180,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
t3.setBounds(200,180,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
b3.setBounds(170,250,50,20);
b4.setBounds(230,250,50,20);

f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);
  
 
}

public void actionPerformed(ActionEvent e)
{
int i=Integer.parseInt(t1.getText());
int j=Integer.parseInt(t2.getText());
    
if(e.getSource()==b1)
{
t3.setText(String.valueOf(i+j));
}
      
if(e.getSource()==b2)
{
t3.setText(String.valueOf(i-j));
}
    
if(e.getSource()==b3)
{
t3.setText(String.valueOf(i*j));
}
    
if(e.getSource()==b4)
{
t3.setText(String.valueOf(i/j));
}
}
  

public static void main(String args[]) {   
     
    SwingGUICalculator a = new SwingGUICalculator();    
  
}  
  
}    