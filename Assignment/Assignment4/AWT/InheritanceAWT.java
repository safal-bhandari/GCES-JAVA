import java.awt.*;    
  
// extending Frame class to our class AWTExample1  
class InheritanceAWT extends Frame {    
  
    public static InheritanceAWT f=new InheritanceAWT();
    public static Label l1=new Label("First Number");
    public static Label l2=new Label("Second Number");
    public static Label l3=new Label("Result");
    public static TextField t1=new TextField();
    public static TextField t2=new TextField();
    public static TextField t3=new TextField();
    public static Button b1=new Button("+");
    public static Button b2=new Button("-");
    public static Button b3=new Button("*");
    public static Button b4=new Button("/");
  

public static void main(String[] args) {   
    
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
    
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,350);
          
  
}  
  
}    