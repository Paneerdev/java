import java.awt.*;
public class dropmenu
{
	dropmenu()
	{
	Frame f = new Frame("Dropmenu Example");	
	
	Choice c = new Choice();
	c.add("Item 1");
	c.add("Item 2");
	c.add("Item 3");
	c.add("Item 4");
	c.add("Item 5");
	
	f.add(c);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
	new dropmenu();
	}
}
