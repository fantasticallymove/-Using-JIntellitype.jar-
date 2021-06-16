package robot.buttonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import abstractClass.MouseMultipleLocations_Button;
import object.ObjectXY;

public class ResetBlocksButton implements ActionListener
{
	private MouseMultipleLocations_Button HoldField;
	
	public ResetBlocksButton(MouseMultipleLocations_Button Field)
	{
		HoldField = Field;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		for(ObjectXY results : HoldField.ObjectXYList)
		{
			results.setX(0);
			results.setY(0);
		}	
		HoldField.setCountHit(0);
		HoldField.ResetTitle();
	}
}
