import java.awt.*;
import java.awt.event.*;

class OddEvenAWT implements ActionListener
{

Frame f=new Frame();
Label l1=new Label("Number");
Label l2=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("Check");
OddEvenAWT()
{

l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
b1.setBounds(50,180,50,20);


f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b1);
b1.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);
}


public void actionPerformed(ActionEvent e)
{
int i=Integer.parseInt(t1.getText());
    
if(e.getSource()==b1)
{
    if ( i % 2 == 0 ){
        t2.setText("Even");
    }
    else{
        t2.setText("Odd");
    }
}
      

}

public static void main(String[] args)
{
    OddEvenAWT a = new OddEvenAWT();
}
}