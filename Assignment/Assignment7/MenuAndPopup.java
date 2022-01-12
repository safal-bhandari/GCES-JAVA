import javax.swing.*;
import java.awt.event.*;
import java.awt.*;  
class MenuAndPopup  
{  
  JMenu file, newFile, edit, view, open;  
  JMenuItem save, close, test, folder, window, panel;

  MenuAndPopup(){  
      JFrame f= new JFrame("Menu and MenuItem Example");  
      JMenuBar mb=new JMenuBar();  
      JPopupMenu popup = new JPopupMenu("Menu");
      file=new JMenu("File");
      edit=new JMenu("Edit");
      view=new JMenu("View");
      open=new JMenu("Open");  
      newFile=new JMenu("New");  
      save=new JMenuItem("Save");  
      close=new JMenuItem("Close");   
      test=new JMenuItem("Test");  
      folder=new JMenuItem("Folder");
      window=new JMenuItem("Window");  
      panel=new JMenuItem("Panel");  
      newFile.add(test); 
      newFile.add(folder);  
      file.add(newFile); 
      file.add(save); 
      file.add(close); 
      view.add(window); 
      view.add(panel);
      f.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           JPopupMenu menu = new JPopupMenu("Menu");
           JMenu file1, newFile1, edit1, view1, open1;  
           JMenuItem save1, close1, test1, folder1, window1, panel1;
           file1=new JMenu("File");
           edit1=new JMenu("Edit");
           view1=new JMenu("View");
           open1=new JMenu("Open");  
           newFile1=new JMenu("New");  
           save1=new JMenuItem("Save");  
           close1=new JMenuItem("Close");   
           test1=new JMenuItem("Test");  
           folder1=new JMenuItem("Folder"); 
           window1 = new JMenuItem("Window");
           panel1 = new JMenuItem("Panel");
           newFile1.add(test1); 
           newFile1.add(folder1);  
           file1.add(newFile1); 
           file1.add(save1); 
           file1.add(close1);
           view1.add(window1); 
           view1.add(panel1);      

           menu.add(file1);
           menu.add(edit1);
           menu.add(view1);
           menu.add(open1);
           if (SwingUtilities.isRightMouseButton(e)){
               menu.show(f, e.getX(), e.getY());
               menu.setVisible(true);

           }

           if (SwingUtilities.isLeftMouseButton(e)){
              menu.setVisible(false);
          }        
      }               
  });   
      mb.add(file);
      mb.add(edit);
      mb.add(view);
      mb.add(open);


      f.setJMenuBar(mb); 

      f.setSize(400,400);  
      f.setLayout(null);  
      f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new MenuAndPopup();  
}

}