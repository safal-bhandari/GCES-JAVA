import java.applet.Applet;
import java.awt.Graphics;
public class ParameterInApplet extends Applet
{

	String name;

	public void init()
	{
		name = getParameter("name");
	}
	public void paint(Graphics graphics)
	{

		graphics.drawString(name, 100, 20);
	}
}