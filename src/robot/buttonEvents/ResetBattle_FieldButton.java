package robot.buttonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import abstractClass.MouseLocation_DoubleXY;

public class ResetBattle_FieldButton implements ActionListener
{
	private MouseLocation_DoubleXY HoldField01;
	private MouseLocation_DoubleXY HoldField02;
	
	public ResetBattle_FieldButton(MouseLocation_DoubleXY Field01,MouseLocation_DoubleXY Field02)
	{
		HoldField01 = Field01;
		HoldField02 = Field02;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		HoldField01.getObjectXY().setX(0);
		HoldField01.getObjectXY().setY(0);
		HoldField01.getObjectXY2().setX(0);
		HoldField01.getObjectXY2().setY(0);
		
		HoldField02.getObjectXY().setX(0);
		HoldField02.getObjectXY().setY(0);
		HoldField02.getObjectXY2().setX(0);
		HoldField02.getObjectXY2().setY(0);
		
		
		HoldField01.ResetTitle();
		HoldField01.setCountHit(0);
		
		HoldField02.ResetTitle();
		HoldField02.setCountHit(0);
	}
}
