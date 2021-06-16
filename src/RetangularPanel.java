import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RetangularPanel extends JPanel
{
	private Color color = Color.BLACK;
	@Override
	public void paintComponent (Graphics g) 
	{
	   g.setColor(color);
	   g.fillOval(0, 0, 50, 50);
	}
	
	public void SetColor(Color colorSet)
	{
		color = colorSet;
	}
}
