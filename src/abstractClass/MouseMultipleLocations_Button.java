package abstractClass;

import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JLabel;

import object.ObjectXY;
import robot.Launcher.MousePreRobot;

public class MouseMultipleLocations_Button extends LocationAbstract
{
	private JLabel HoldLabel1;
	private String title1;
	private JLabel HoldLabel2;
	private String title2;
	private JLabel HoldLabel3;
	private String title3;
	private JLabel HoldLabel4;
	private String title4;
	private JLabel HoldLabel5;
	private String title5;
	private JLabel HoldLabel6;
	private String title6;
	private JLabel HoldLabel7;
	private String title7;
	private JLabel HoldLabel8;
	private String title8;
	
	private Map<JLabel,String> List;
	private int CountHit = 0;		//計算案幾次
	
	public ArrayList<ObjectXY> ObjectXYList = new ArrayList<ObjectXY>();
	public MouseMultipleLocations_Button(JLabel Label1, String Title1,
										 JLabel Label2, String Title2,
										 JLabel Label3, String Title3,
										 JLabel Label4, String Title4,
										 JLabel Label5, String Title5,
										 JLabel Label6, String Title6,
										 JLabel Label7, String Title7,
										 JLabel Label8, String Title8,
										 int number) 
	{
		super(Label1,number,Title1);
		HoldLabel1 = Label1;
		title1 = Title1;
		HoldLabel2 = Label2;
		title2 = Title2;
		HoldLabel3 = Label3;
		title3 = Title3;
		HoldLabel4 = Label4;
		title4 = Title4;
		HoldLabel5 = Label5;
		title5 = Title5;
		HoldLabel6 = Label6;
		title6 = Title6;
		HoldLabel7 = Label7;
		title7 = Title7;
		HoldLabel8 = Label8;
		title8 = Title8;
		
		/*
		 * Factory Init ObjectXY ↓
		 * MousePreRobot.ObjectXY_Need() 由入口Launcher 指定需要生成幾個
		 */
		for(int count = 0 ; count < MousePreRobot.ObjectXY_Need() ; count ++)
			{
				ObjectXY Init_ObjectXY = new ObjectXY();		
				ObjectXYList.add(Init_ObjectXY);
			}	
		
		Keynumber = number;
	}
	
	@Override
	public void onHotKey(int KeyboardNum) 
	{
		if(KeyboardNum == Keynumber)
		{
			
			if(CountHit==0)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel1.setText("區域"+title1+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==1)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel2.setText("區域"+title2+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==2)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel3.setText("區域"+title3+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==3)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel4.setText("區域"+title4+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==4)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel5.setText("區域"+title5+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==5)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel6.setText("區域"+title6+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==6)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel7.setText("區域"+title7+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==7)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel8.setText("區域"+title8+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else
			{
				///No more
				System.out.println("Beyond result!");
			}
			
			CountHit++;	//每按一次計次
		}
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
		HoldLabel1.setText("區域"+title1+"-X:    "+",Y:    ");
		HoldLabel2.setText("區域"+title2+"-X:    "+",Y:    ");
		HoldLabel3.setText("區域"+title3+"-X:    "+",Y:    ");
		HoldLabel4.setText("區域"+title4+"-X:    "+",Y:    ");
		HoldLabel5.setText("區域"+title5+"-X:    "+",Y:    ");
		HoldLabel6.setText("區域"+title6+"-X:    "+",Y:    ");
		HoldLabel7.setText("區域"+title7+"-X:    "+",Y:    ");
		HoldLabel8.setText("區域"+title8+"-X:    "+",Y:    ");
	}
}