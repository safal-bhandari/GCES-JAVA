import java.applet.Applet; 
import java.awt.Graphics;

 public class AppletLifeCycle extends Applet 
 { 
    public void init() 
    { 
        System.out.println("Initial"); 
    } 

    public void start()
    { 
        System.out.println("Start() called"); 
    }

    public void paint(Graphics g)
    {
        System.out.println("Paint(() called"); 
    } 

    public void stop() 
    {
        System.out.println("Stop() Called"); 
    } 
    public void destroy()
    {
        System.out.println("Destroy)() Called"); 
    } 
 } 