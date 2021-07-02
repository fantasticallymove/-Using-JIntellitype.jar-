package robot.robotEvent;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JLabel;

import com.melloware.jintellitype.HotkeyListener;

import object.ObjectXY;

public class skillLocation implements HotkeyListener	//技能點位
{

	private static ObjectXY first = new ObjectXY();
	private static ObjectXY second = new ObjectXY();
	private static JLabel HoldLabel1;
	private static JLabel HoldLabel2;
	private static int count = 0;
	
	public skillLocation(JLabel label1,JLabel label2) throws AWTException
	{
		
		first.setX(0);
		first.setY(0);
		second.setX(0);
		second.setY(0);
		HoldLabel1 = label1;
		HoldLabel2 = label2;
	}
	
	@Override
	public void onHotKey(int KeyboardNum) 
	{
		if(KeyboardNum ==8)
		{
			if(count ==0)
			{
				Point lo = MouseInfo.getPointerInfo().getLocation();
				first.setX((int)lo.getX());
				first.setY((int)lo.getY());
				HoldLabel1.setText("技能施放點擊區域1:X-"+lo.getX()+" , Y-"+lo.getY());		
				HoldLabel1.setForeground(Color.red);
			}
			else if(count ==1)
			{
				Point lo = MouseInfo.getPointerInfo().getLocation();
				second.setX((int)lo.getX());
				second.setY((int)lo.getY());
				HoldLabel2.setText("技能施放點擊區域2:X-"+lo.getX()+" , Y-"+lo.getY());
				HoldLabel2.setForeground(Color.red);
			}
			else if(count == 2)
			{
				ResetSkill();
				System.out.println("Reset");
				return;
			}
			count++;
		}
	}
	
	public static ObjectXY Skill_Step1()
	{
		return first;
	}
	
	public static ObjectXY Skill_Step2()
	{
		return second;
	}
	
	public static void ResetSkill()
	{
		first.setX(0);
		first.setY(0);
		second.setX(0);
		second.setY(0);
		
		HoldLabel1.setText("技能施放點擊區域1:未設定");
		HoldLabel1.setForeground(Color.BLACK);
		HoldLabel2.setText("技能施放點擊區域2:未設定");
		HoldLabel2.setForeground(Color.BLACK);
		count = 0;
	}
}
