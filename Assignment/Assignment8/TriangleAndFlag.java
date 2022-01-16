import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class TriangleAndFlag extends Frame{
    public TriangleAndFlag(){
        super("Triangle And Flag");
        setSize(900, 1000);
        setVisible(true);
    }
    static Color NEPALIFLAG = new Color(221,12,39);
    public void paint(Graphics g) {
        g.setColor(Color.RED);

        int[] xPoints = { 70,100,0 };
        int[] yPoints = { 50,100,100 };

        int[] xPoints1 = { 120,105,50 };
        int[] yPoints1 = { 100,150,150 };

        Polygon p = new Polygon(xPoints, yPoints, 3);
        Polygon p1 = new Polygon(xPoints1, yPoints1, 3);
        g.drawPolygon(p);
        g.fillPolygon(p1);

        int upperTriangleX[] = {210,360,210};
        int upperTriangleY[] = {50,160,160};
        
        Polygon upperTriangle = new Polygon(upperTriangleX,upperTriangleY,3);
        g.drawPolygon(upperTriangle);
        g.setColor(NEPALIFLAG);
        g.fillPolygon(upperTriangle);

        int lowerTriangleX[] = {210,390,210};
        int lowerTriangleY[] = {160,340,340};
        Polygon lowerTriangle = new Polygon(lowerTriangleX,lowerTriangleY,3);
        g.drawPolygon(lowerTriangle);
        g.setColor(NEPALIFLAG);
        g.fillPolygon(lowerTriangle);

        g.setColor(Color.white);
        g.fillOval(240,100,30,30);
        g.setColor(NEPALIFLAG);
        g.fillOval(240,91,30,30);

        int starX[] = {240,250,255,260,270,265,270,260,255,250,240,245};
        int starY[] = {260,260,250,260,260,270,280,280,290,280,280,270};
        Polygon star = new Polygon(starX,starY,12);
        g.drawPolygon(star);
        g.setColor(Color.white);
        g.fillPolygon(star);
    }

    public static void main(String[] args){
        new TriangleAndFlag();
    }
}