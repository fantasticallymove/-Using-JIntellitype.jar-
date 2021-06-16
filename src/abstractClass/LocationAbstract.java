package abstractClass;

import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JLabel;

import com.melloware.jintellitype.HotkeyListener;

import object.ObjectXY;

public abstract class LocationAbstract implements HotkeyListener
{
	public ObjectXY objectXY;
	public JLabel HoldLabel;
	public String title;
	public int Keynumber;
	
	public LocationAbstract(JLabel Label,int number,String Title)
	{
		HoldLabel = Label;
		Keynumber = number;
		title = Title;
		objectXY = new ObjectXY();
		objectXY.setX(0);
		objectXY.setY(0);
	}
	
	@Override
	public void onHotKey(int KeyboardNum) 
	{
		if(KeyboardNum == Keynumber)
		{
			Point mousePoint = MouseInfo.getPointerInfo().getLocation();
			objectXY.setX((int)mousePoint.getX());
			objectXY.setY((int)mousePoint.getY());
			HoldLabel.setText("°Ï°ì"+title+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
		}
	}
	
	public ObjectXY getObjectXY() {
		return objectXY;
	}
	
}
