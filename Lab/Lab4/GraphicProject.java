import javax.swing.*;
import java.awt.*;

public class GraphicProject extends JFrame {

    GraphicProject(){
        super("");
        setSize(900, 1000);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        int [] x = {100,200,50};
        int [] y = {50,100,100};
        g.fillPolygon(x, y, 3);
        g.setColor(Color.blue);
        g.fillOval(50, 150, 100, 100);
        g.setColor(Color.red);
        g.fillOval(50, 250, 150, 100);
        g.setColor(Color.yellow);
        Polygon p = new Polygon();
        for (int i = 0; i < 6; i++)
            p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 6)),
              (int) (450 + 50 * Math.sin(i * 2 * Math.PI / 6)));        
        g.fillPolygon(p);

        g.setColor(Color.green);

        Polygon p1 = new Polygon();
        for (int i = 0; i < 5; i++)
          p1.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
              (int) (550 + 50 * Math.sin(i * 2 * Math.PI / 5)));

        g.fillPolygon(p1);

    }

    public static void main(String[] args) {

       new GraphicProject();

    }
}
