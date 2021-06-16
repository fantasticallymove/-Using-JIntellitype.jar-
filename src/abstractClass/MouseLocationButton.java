package abstractClass;

import javax.swing.JLabel;

public class MouseLocationButton extends LocationAbstract
{
	public JLabel HoldLabel;
	public String title;
	public int Keynumber;
	
	public MouseLocationButton(JLabel Label, int number, String Title) 
	{
		super(Label,number,Title);
		HoldLabel = Label;
		title = Title;
		Keynumber = number;
	}
}