package robot.robotEvent;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Iterator;
import abstractClass.MouseLocation_DoubleXY;
import abstractClass.MouseMultipleLocations_Button;
import object.ObjectXY;
import robot.Panel.RetangularPanel;

public class RobotOperation implements Runnable
{
	public static Robot robot;
	private static int inr = 0;
	
	private MouseMultipleLocations_Button locationAbstract;
	private MouseMultipleLocations_Button locationAbstract2;
	
	private MouseLocation_DoubleXY HoldBattleField01;
	private MouseLocation_DoubleXY HoldBattleField02;
	
	private Boolean DynamicMoveSelect;
	private RetangularPanel HoldRetangular;
	private RetangularPanel HoldRetangula2;
	private RetangularPanel HoldRetangula3;
	private RetangularPanel HoldRetangula4;
	
	private Color JudgeColor01;
	private Color JudgeColor01Support;
	private Color JudgeColor02;
	private Color JudgeColor02Support;
	
	private int PixelField_01_X;
	private int PixelField_01_Y;
	private int PixelField_Support01_X;
	private int PixelField_Support01_Y;
	private int PixelField_02_X;
	private int PixelField_02_Y;
	private int PixelField_Support02_X;
	private int PixelField_Support02_Y;
	
	private Boolean checkField01 = false;
	private Boolean checkField02 = false;	//修正這邊
	
	private Boolean checkField03 = false;
	private Boolean checkField04 = false;	//修正這邊
	
	public RobotOperation(MouseMultipleLocations_Button A,MouseMultipleLocations_Button B,
			 			  MouseLocation_DoubleXY Battle01 , MouseLocation_DoubleXY Battle02,
						  Boolean Dynamic,RetangularPanel Retangular,RetangularPanel Retangular2,RetangularPanel Retangular3,RetangularPanel Retangular4) throws AWTException
	{
		 robot = new Robot();
		
		locationAbstract = A;	
		locationAbstract2 = B; 	 
		HoldBattleField01 = Battle01;
		HoldBattleField02 = Battle02;
		DynamicMoveSelect = Dynamic;
		HoldRetangular = Retangular;
		HoldRetangula2 = Retangular2;
		HoldRetangula3 = Retangular3;
		HoldRetangula4 = Retangular4;
	}
	
	@Override
	public void run() 
	{
		/*
		 * 首先偵測戰鬥兩個區域的X Y
		 */
		 PixelField_01_X = HoldBattleField01.getObjectXY().getX();
		 PixelField_01_Y = HoldBattleField01.getObjectXY().getY();
		 PixelField_Support01_X = HoldBattleField01.getObjectXY2().getX();
		 PixelField_Support01_Y = HoldBattleField01.getObjectXY2().getY();
		 PixelField_02_X = HoldBattleField02.getObjectXY().getX();
		 PixelField_02_Y = HoldBattleField02.getObjectXY().getY();
		 PixelField_Support02_X = HoldBattleField02.getObjectXY2().getX();
		 PixelField_Support02_Y = HoldBattleField02.getObjectXY2().getY();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////// 檢查有無設定任何點過
											Boolean isNullPointer01 = true;
											Boolean isNullPointer02 = true;
											Iterator<ObjectXY> iterator = locationAbstract.ObjectXYList.iterator();
											while(iterator.hasNext()) 
											{
											  ObjectXY result = iterator.next();
											  int check = result.getX();
											  if(check!=0)
											  {
												  isNullPointer01 = false;
											  }
											}
											Iterator<ObjectXY> iterator2 = locationAbstract2.ObjectXYList.iterator();
											while(iterator2.hasNext()) 
											{
											  ObjectXY result = iterator2.next();
											  int check = result.getX();
											  if(check!=0)
											  {
												  isNullPointer01 = false;
											  }
											}

											if(isNullPointer01==true && isNullPointer02==true)
											{
												System.out.println("【助手回報】無設定任何點");
												System.out.println("【Exception】進程中止");
									
											}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else
		{
			
			inr = 1;
			while(true)
			{
				ColorDetectingAndRepaint();
				
				Collections.shuffle(locationAbstract.ObjectXYList);		//骰出隨機點擊的位置
				Collections.shuffle(locationAbstract2.ObjectXYList);		//骰出隨機點擊的位置
					if(inr == 0)
					{
						break;
					}		
				
				checkField01 = JudgeColor01.getRed()==0 || JudgeColor01.getBlue()==0 || JudgeColor01.getGreen()==0; //是黑色就給true
				checkField02 = JudgeColor01Support.getRed() > 230 && JudgeColor01Support.getBlue() > 220 && JudgeColor01Support.getGreen() > 230; //接近白色就給true
				
				checkField03 = JudgeColor02.getRed()==0 || JudgeColor02.getBlue()==0 || JudgeColor02.getGreen()==0; //是黑色就給true
				checkField04 = JudgeColor02Support.getRed() > 230 && JudgeColor02Support.getBlue() > 220 && JudgeColor02Support.getGreen() > 230; //接近白色就給true
				
//				System.out.println("checkField01:"+checkField01);
//				System.out.println("checkField02:"+checkField02);
//				System.out.println("checkField03:"+checkField03);
//				System.out.println("checkField04:"+checkField04);
				if(checkField01 && checkField02 == true)	//是黑色  和輔助區域接近紅色 就進入連續點擊 (表示未進山洞)
				{
					for(int count = 0 ; count < locationAbstract.ObjectXYList.size() ;count++)
					{
						/*
						 * 用於在迴圈內判斷戰鬥區域顏色是否異常
						 */
						ColorDetectingAndRepaint();
						
						if(JudgeColor01.getRed()!=0 || JudgeColor01.getBlue()!=0 || JudgeColor01.getGreen()!=0 )
						{
							/*
							 * 用於在迴圈不要走完提前打斷
							 */
							System.out.println("【 自動中止 】攻擊狀態停止 偵測到已完成所有攻擊指令 -Success");
							break;
						}
						
						if(locationAbstract.ObjectXYList.get(count).getX()!=0 ||locationAbstract.ObjectXYList.get(count).getY()!=0)
						{	
							robot.mouseMove(locationAbstract.ObjectXYList.get(count).getX(),locationAbstract.ObjectXYList.get(count).getY());// 移動到每個紀錄點隨機時間
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// 按下滑鼠
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// 按下滑鼠
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							
							System.out.println("正在點擊區域: "+locationAbstract.ObjectXYList.get(count).getX()+" ,  "+locationAbstract.ObjectXYList.get(count).getY());
							
							if(count ==3 || count ==6)
							{
								if(DynamicMoveSelect==true)					//動態計算隨機等待時間
								{
									int RandomWait = 500+(int)(Math.random()*500);
									System.out.println("動態等待時間"+RandomWait);
									
									robot.delay(RandomWait);
								}
							}
							else
							{
									robot.delay(100);
									if(inr == 0)
									{
										break;
									}
							}			
						}
						else
							{
								//不執行東西
							}
						
					}	
				}
				
				if(checkField03 && checkField04 == true)	//是黑色就進入連續點擊
				{
					for(int count = 0 ; count < locationAbstract2.ObjectXYList.size() ;count++)
					{
						/*
						 * 用於在迴圈內判斷戰鬥區域顏色是否異常
						 */
						ColorDetectingAndRepaint();
						
						if(JudgeColor02.getRed()!=0 || JudgeColor02.getBlue()!=0 || JudgeColor02.getGreen()!=0 )
						{
							/*
							 * 用於在迴圈不要走完提前打斷
							 */
							System.out.println("【 自動中止 】攻擊狀態停止 偵測到已完成所有攻擊指令 -Success");
							break;
						}
						
						if(locationAbstract2.ObjectXYList.get(count).getX()!=0 ||locationAbstract2.ObjectXYList.get(count).getY()!=0)
						{	
							robot.mouseMove(locationAbstract2.ObjectXYList.get(count).getX(),locationAbstract2.ObjectXYList.get(count).getY());// 移動到每個紀錄點隨機時間
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// 按下滑鼠
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// 按下滑鼠
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							
							System.out.println("正在點擊區域: "+locationAbstract2.ObjectXYList.get(count).getX()+" ,  "+locationAbstract2.ObjectXYList.get(count).getY());
							
							if(count ==3 || count==6)
							{
								if(DynamicMoveSelect==true)					//動態計算隨機等待時間
								{
									int RandomWait = 500+(int)(Math.random()*750);
									System.out.println("動態等待時間"+RandomWait);
									
									robot.delay(RandomWait);							
								}
							}
							else
							{
									robot.delay(100);
									if(inr == 0)
									{
										break;
									}
							}			
						}
						else
							{
								//不執行東西
							}
						
					}	
				}
				
				JudgeColor01 = null;
				JudgeColor01Support = null;
				JudgeColor02 = null;
				JudgeColor02Support = null;
			}
		}
	}
	
	public static void interrupt()
	{
		inr = 0;
	}
	
	public void ColorDetectingAndRepaint()
	{
		JudgeColor01 = robot.getPixelColor(PixelField_01_X, PixelField_01_Y);
		JudgeColor01Support = robot.getPixelColor(PixelField_Support01_X, PixelField_Support01_Y);
		JudgeColor02 = robot.getPixelColor(PixelField_02_X, PixelField_02_Y);
		JudgeColor02Support = robot.getPixelColor(PixelField_Support02_X, PixelField_Support02_Y);
		HoldRetangular.SetColor(JudgeColor01);
		HoldRetangula2.SetColor(JudgeColor01Support);
		HoldRetangula3.SetColor(JudgeColor02);
		HoldRetangula4.SetColor(JudgeColor02Support);
		HoldRetangular.repaint();
		HoldRetangula2.repaint();
		HoldRetangula3.repaint();
		HoldRetangula4.repaint();
	}
	


}
