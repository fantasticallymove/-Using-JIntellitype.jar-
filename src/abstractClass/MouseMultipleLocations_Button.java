package abstractClass;

import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JLabel;

import object.ObjectXY;

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
	
	private ObjectXY objectXY1;		//�S���H���h�ճ]�w
	private ObjectXY objectXY2;		//�S���H���h�ճ]�w
	private ObjectXY objectXY3;		//�S���H���h�ճ]�w
	private ObjectXY objectXY4;		//�S���H���h�ճ]�w
	private ObjectXY objectXY5;		//�S���H���h�ճ]�w
	private ObjectXY objectXY6;		//�S���H���h�ճ]�w
	private ObjectXY objectXY7;		//�S���H���h�ճ]�w
	private ObjectXY objectXY8;		//�S���H���h�ճ]�w
	
	private int CountHit = 0;		//�p��״X��
	
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
		
		objectXY1 = new ObjectXY();
		objectXY1.setX(0);
		objectXY1.setY(0);
		objectXY2 = new ObjectXY();
		objectXY2.setX(0);
		objectXY2.setY(0);
		objectXY3 = new ObjectXY();
		objectXY3.setX(0);
		objectXY3.setY(0);
		objectXY4 = new ObjectXY();
		objectXY4.setX(0);
		objectXY4.setY(0);
		objectXY5 = new ObjectXY();
		objectXY5.setX(0);
		objectXY5.setY(0);
		objectXY6 = new ObjectXY();
		objectXY6.setX(0);
		objectXY6.setY(0);
		objectXY7 = new ObjectXY();
		objectXY7.setX(0);
		objectXY7.setY(0);
		objectXY8 = new ObjectXY();
		objectXY8.setX(0);
		objectXY8.setY(0);
		
		ObjectXYList.add(objectXY1);ObjectXYList.add(objectXY2);ObjectXYList.add(objectXY3);ObjectXYList.add(objectXY4);
		ObjectXYList.add(objectXY5);ObjectXYList.add(objectXY6);ObjectXYList.add(objectXY7);ObjectXYList.add(objectXY8);
		
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
				HoldLabel1.setText("�ϰ�"+title1+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==1)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel2.setText("�ϰ�"+title2+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==2)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel3.setText("�ϰ�"+title3+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==3)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel4.setText("�ϰ�"+title4+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==4)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel5.setText("�ϰ�"+title5+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==5)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel6.setText("�ϰ�"+title6+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==6)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel7.setText("�ϰ�"+title7+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else if(CountHit==7)
			{
				Point mousePoint = MouseInfo.getPointerInfo().getLocation();
				System.out.println(mousePoint);
				ObjectXYList.get(CountHit).setX((int)mousePoint.getX());
				ObjectXYList.get(CountHit).setY((int)mousePoint.getY());
				HoldLabel8.setText("�ϰ�"+title8+"-X:    "+mousePoint.getX()+",Y:    "+mousePoint.getY());
			}
			else
			{
				///No more
				System.out.println("Beyond result!");
			}
			
			CountHit++;	//�C���@���p��
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
		HoldLabel1.setText("�ϰ�"+title1+"-X:    "+",Y:    ");
		HoldLabel2.setText("�ϰ�"+title2+"-X:    "+",Y:    ");
		HoldLabel3.setText("�ϰ�"+title3+"-X:    "+",Y:    ");
		HoldLabel4.setText("�ϰ�"+title4+"-X:    "+",Y:    ");
		HoldLabel5.setText("�ϰ�"+title5+"-X:    "+",Y:    ");
		HoldLabel6.setText("�ϰ�"+title6+"-X:    "+",Y:    ");
		HoldLabel7.setText("�ϰ�"+title7+"-X:    "+",Y:    ");
		HoldLabel8.setText("�ϰ�"+title8+"-X:    "+",Y:    ");
	}
}