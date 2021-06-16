package abstractClass;

import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JLabel;

import object.ObjectXY;

public class MouseLocation_DoubleXY extends LocationAbstract
{
	private ObjectXY objectXY2;		//特殊抽象類多一組設定第二個
	private int CountHit = 0;		//計算案幾次
	private JLabel HoldLabel2;
	private String HoldTitle2;
	


	public MouseLocation_DoubleXY (JLabel Label,JLabel Label2,int KEYnumber,String Title,String Title2)
	{
		super(Label,KEYnumber,Title);
		HoldLabel = Label;
		HoldLabel2 = Label2;
		
		Keynumber = KEYnumber;
		title = Title;
		HoldTitle2 = Title2;
		
		objectXY2 = new ObjectXY();
		objectXY2.setX(0);
		objectXY2.setY(0);
	}
	
	@Override
	public void onHotKey(int KeyboardNum) 
	{
		if(KeyboardNum == Keynumber)
		{
			CountHit++;	//每按一次計次
			
			if(CountHit==1)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				getObjectXY().setX((int)mousePoint.getX());
				getObjectXY().setY((int)mousePoint.getY());
				getHoldLabel().setText("區域"+getTitle()+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==2)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				objectXY2.setX((int)mousePoint.getX());
				objectXY2.setY((int)mousePoint.getY());
				HoldLabel2.setText("區域"+HoldTitle2+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else
			{
				/*
				 * 第三次後無反應
				 */
			}
		}
	}
	
	public ObjectXY getObjectXY2() {
		return objectXY2;
	}
	
	public JLabel getHoldLabel2() {
		return HoldLabel2;
	}
	
	public String getHoldTitle2() {
		return HoldTitle2;
	}
	
	public int getCountHit()
	{
		return CountHit;
	}
	
	public void setCountHit(int number)
	{
		 CountHit = number;
	}
	
	@Override
	public final void ResetTitle() {
		HoldLabel.setText("區域"+title+"-X:    "+",Y:    ");
		HoldLabel2.setText("區域"+getHoldTitle2()+"-X:    "+",Y:    ");
	}
}
