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
	private Boolean checkField02 = false;	//�ץ��o��
	
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
		 * ���������԰���Ӱϰ쪺X Y
		 */
		 PixelField_01_X = HoldBattleField01.getObjectXY().getX();
		 PixelField_01_Y = HoldBattleField01.getObjectXY().getY();
		 PixelField_Support01_X = HoldBattleField01.getObjectXY2().getX();
		 PixelField_Support01_Y = HoldBattleField01.getObjectXY2().getX();
		 PixelField_02_X = HoldBattleField02.getObjectXY().getX();
		 PixelField_02_Y = HoldBattleField02.getObjectXY().getY();
		 PixelField_Support02_X = HoldBattleField02.getObjectXY2().getX();
		 PixelField_Support02_Y = HoldBattleField02.getObjectXY2().getY();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////// �ˬd���L�]�w�����I�L
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
												System.out.println("�i�U��^���j�L�]�w�����I");
												System.out.println("�iException�j�i�{����");
									
											}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else
		{
			
			inr = 1;
			while(true)
			{
				ColorDetectingAndRepaint();
				
				Collections.shuffle(locationAbstract.ObjectXYList);		//��X�H���I������m
				Collections.shuffle(locationAbstract2.ObjectXYList);		//��X�H���I������m
					if(inr == 0)
					{
						break;
					}		
				
				checkField01 = JudgeColor01.getRed()==0 || JudgeColor01.getBlue()==0 || JudgeColor01.getGreen()==0; //�O�¦�N��true
				checkField02 = JudgeColor01Support.getRed() > 240 && JudgeColor01Support.getBlue() > 230 && JudgeColor01Support.getGreen() > 240; //����զ�N��true
				
				if(checkField01 && checkField02 == true)	//�O�¦�  �M���U�ϰ챵����� �N�i�J�s���I�� (��ܥ��i�s�})
				{
					for(int count = 0 ; count < locationAbstract.ObjectXYList.size() ;count++)
					{
						/*
						 * �Ω�b�j�餺�P�_�԰��ϰ��C��O�_���`
						 */
						ColorDetectingAndRepaint();
						
						if(JudgeColor01.getRed()!=0 || JudgeColor01.getBlue()!=0 || JudgeColor01.getGreen()!=0 )
						{
							/*
							 * �Ω�b�j�餣�n�������e���_
							 */
							System.out.println("�i �۰ʤ��� �jNon Attack state -Success");
							break;
						}
						
						if(locationAbstract.ObjectXYList.get(count).getX()!=0 ||locationAbstract.ObjectXYList.get(count).getY()!=0)
						{	
							robot.mouseMove(locationAbstract.ObjectXYList.get(count).getX(),locationAbstract.ObjectXYList.get(count).getY());// ���ʨ�C�Ӭ����I�H���ɶ�
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							
							System.out.println("���b�I���ϰ�: "+locationAbstract.ObjectXYList.get(count).getX()+" ,  "+locationAbstract.ObjectXYList.get(count).getY());
							
							if(count ==3)
							{
								if(DynamicMoveSelect==true)					//�ʺA�p���H�����ݮɶ�
								{
									int RandomWait = 500+(int)(Math.random()*1000);
									System.out.println("�ʺA���ݮɶ�"+RandomWait);
									
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
								//������F��
							}
						
					}	
				}
				
				if(JudgeColor02.getRed()==0 || JudgeColor02.getBlue()==0 || JudgeColor02.getGreen()==0 )	//�O�¦�N�i�J�s���I��
				{
					for(int count = 0 ; count < locationAbstract2.ObjectXYList.size() ;count++)
					{
						/*
						 * �Ω�b�j�餺�P�_�԰��ϰ��C��O�_���`
						 */
						ColorDetectingAndRepaint();
						
						if(JudgeColor02.getRed()!=0 || JudgeColor02.getBlue()!=0 || JudgeColor02.getGreen()!=0 )
						{
							/*
							 * �Ω�b�j�餣�n�������e���_
							 */
							System.out.println("�i �۰ʤ��� �jNon Attack state -Success");
							break;
						}
						
						if(locationAbstract2.ObjectXYList.get(count).getX()!=0 ||locationAbstract2.ObjectXYList.get(count).getY()!=0)
						{	
							robot.mouseMove(locationAbstract2.ObjectXYList.get(count).getX(),locationAbstract2.ObjectXYList.get(count).getY());// ���ʨ�C�Ӭ����I�H���ɶ�
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							
							System.out.println("���b�I���ϰ�: "+locationAbstract2.ObjectXYList.get(count).getX()+" ,  "+locationAbstract2.ObjectXYList.get(count).getY());
							
							if(count ==3)
							{
								if(DynamicMoveSelect==true)					//�ʺA�p���H�����ݮɶ�
								{
									int RandomWait = 500+(int)(Math.random()*1000);
									System.out.println("�ʺA���ݮɶ�"+RandomWait);
									
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
								//������F��
							}
						
					}	
				}
				
				JudgeColor01 = null;
				JudgeColor02 = null;
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
		System.out.println("01�ϰ��C��"+JudgeColor01);
		System.out.println("01���U�C��"+JudgeColor01Support);
		System.out.println("02�ϰ��C��"+JudgeColor02);
		System.out.println("02���U�C��"+JudgeColor02Support);
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
