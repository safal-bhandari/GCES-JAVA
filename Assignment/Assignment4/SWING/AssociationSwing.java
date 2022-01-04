import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AssociationSwing {    
  
   // initializing using constructor  
   AssociationSwing() {  

    JFrame f=new JFrame();
    JLabel l1=new JLabel("First Number");
    JLabel l2=new JLabel("Second Number");
    JLabel l3=new JLabel("Result");
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JButton b1=new JButton("+");
    JButton b2=new JButton("-");
    JButton b3=new JButton("*");
    JButton b4=new JButton("/");

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
//Adding components to the frame
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

f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);
  
 
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
AssociationSwing a = new AssociationSwing();    
  
}  
  
}    