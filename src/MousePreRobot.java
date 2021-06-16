import java.awt.AWTException;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

import abstractClass.LocationAbstract;
import object.ObjectXY;


public class MousePreRobot
{
	Container con;
	JLabel ButtonF;
	RetangularPanel Retangular1;
	RetangularPanel Retangular2;
	
	public static void main(String[] args) throws AWTException
	{
		new MousePreRobot().GUI();
		
	}
	
	public void GUI() throws AWTException
	{
	
		JFrame frame = new JFrame();
		frame.setLayout(null);
		con = frame.getContentPane();
		
		JLabel text1 = new JLabel("01�ϰ� �C��:");
		text1.setBounds(20,530 , 550, 30);
		JLabel text2 = new JLabel("02�ϰ� �C��:");
		text2.setBounds(160,530 , 550, 30);
		
		JLabel ButtonA = new JLabel("�i�B�J1�j   ����ϰ�A���U D �]�w�Ĥ@���I");
		ButtonA.setBounds(10,10 , 250, 30);
		JLabel ButtonB = new JLabel("�i�B�J2�j����ϰ�B���U F �]�w�Ĥ@���I");
		ButtonB.setBounds(10,50 , 250, 30);
		JLabel ButtonC = new JLabel("�i�B�J3�j   �}�l��ʫ��U A");
		ButtonC.setBounds(10,90 , 250, 30);
		JLabel ButtonD = new JLabel("������� ���UAlt+ S");
		ButtonD.setBounds(10,130 ,250, 30);
		ButtonD.setForeground(Color.RED);
		ButtonD.setFont(new Font(Font.DIALOG,Font.ITALIC,22));
		
		JLabel ButtonE = new JLabel("�ϰ�A-X:     ,Y:     "+"��D");
		ButtonE.setBounds(440,200 , 250, 30);
		JLabel ButtonF = new JLabel("�ϰ�B-X:     ,Y:     "+"��F");
		ButtonF.setBounds(440,240 , 250, 30);
		
		JLabel Dynamic1 = new JLabel("�ϰ�C-X:     ,Y:     "+"��Z");
		Dynamic1.setBounds(440,280 , 550, 30);
		JLabel Dynamic2 = new JLabel("�ϰ�D-X:     ,Y:     "+"��X");
		Dynamic2.setBounds(440,320 , 550, 30);
				
		JLabel Dynamic3 = new JLabel("�ϰ�E-X:     ,Y:     "+"��C");
		Dynamic3.setBounds(440,360 , 550, 30);
		JLabel Dynamic4 = new JLabel("�ϰ�F-X:     ,Y:     "+"��X");
		Dynamic4.setBounds(440,400 , 550, 30);
		
		JLabel Dynamic5 = new JLabel("�ϰ�G-X:     ,Y:     "+"��B");
		Dynamic5.setBounds(440,440 , 550, 30);
		JLabel Dynamic6 = new JLabel("�ϰ�H-X:     ,Y:     "+"��N");
		Dynamic6.setBounds(440,480 , 550, 30);
		
		JLabel Dynamic7 = new JLabel("�ϰ�AA-X:     ,Y:     "+"��Q");
		Dynamic7.setBounds(10,200 , 250, 30);
		JLabel Dynamic8 = new JLabel("�ϰ�BB-X:     ,Y:     "+"��W");
		Dynamic8.setBounds(10,240 , 250, 30);
		
		JLabel Dynamic9 = new JLabel("�ϰ�CC-X:     ,Y:     "+"��E");
		Dynamic9.setBounds(10,280 , 550, 30);
		JLabel Dynamic10 = new JLabel("�ϰ�DD-X:     ,Y:     "+"��R");
		Dynamic10.setBounds(10,320 , 550, 30);
				
		JLabel Dynamic11 = new JLabel("�ϰ�EE-X:     ,Y:     "+"��T");
		Dynamic11.setBounds(10,360 , 550, 30);
		JLabel Dynamic12 = new JLabel("�ϰ�FF-X:     ,Y:     "+"��Y");
		Dynamic12.setBounds(10,400 , 550, 30);
		
		JLabel Dynamic13 = new JLabel("�ϰ�GG-X:     ,Y:     "+"��U");
		Dynamic13.setBounds(10,440 , 550, 30);
		JLabel Dynamic14 = new JLabel("�ϰ�HH-X:     ,Y:     "+"��I");
		Dynamic14.setBounds(10,480 , 550, 30);
		
		JLabel Dynamic15 = new JLabel("�����԰���01�ϰ�y��-X:     ,Y:     "+"��K");
		Dynamic15.setBounds(400,520 , 550, 30);
		JLabel Dynamic16 = new JLabel("�����԰���02�ϰ�y��-X:     ,Y:     "+"��L");
		Dynamic16.setBounds(400,560 , 550, 30);
		
		JButton ButtonG = new JButton("���եΫ��s A(���ʨ즹�s��D)");
		ButtonG.addActionListener(new AButtonListener());
		ButtonG.setBounds(350,10 , 250, 30);
		JButton ButtonH = new JButton("���եΫ��s B(���ʨ즹�s��F)");
		ButtonH.setBounds(350,50 , 250, 30);
		ButtonH.addActionListener(new BButtonListener());
		JCheckBox CheckBox = new JCheckBox("�ʺA�y������H���Ҧ�");
		CheckBox.setSelected(true);
		CheckBox.setFocusPainted(false);
		CheckBox.setBounds(350,130 ,210, 30);
		
		Retangular1 = new RetangularPanel();
		Retangular1.setBounds(100,530, 50, 50);
		Retangular2 = new RetangularPanel();
		Retangular2.setBounds(250,530, 50, 50);
		
		con.add(ButtonA);
		con.add(ButtonB);
		con.add(ButtonC);
		con.add(ButtonD);
		con.add(ButtonE);
		con.add(ButtonF);
		con.add(ButtonG);
		con.add(ButtonH);
		con.add(CheckBox);
		con.add(Dynamic1);
		con.add(Dynamic2);
		con.add(Dynamic3);
		con.add(Dynamic4);
		con.add(Dynamic5);
		con.add(Dynamic6);
		con.add(Dynamic7);
		con.add(Dynamic8);
		con.add(Dynamic9);
		con.add(Dynamic10);
		con.add(Dynamic11);
		con.add(Dynamic12);
		con.add(Dynamic13);
		con.add(Dynamic14);
		con.add(Dynamic15);
		con.add(Dynamic16);
		con.add(text1);
		con.add(text2);
		con.add(Retangular1);
		con.add(Retangular2);
		
		frame.setTitle("�]�OSuperHero");		
		frame.pack();
		frame.setSize(750,650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MouseLocationButton A = new MouseLocationButton(ButtonE,1,"A");
		MouseLocationButton B = new MouseLocationButton(ButtonF,2,"B");
		MouseLocationButton C = new MouseLocationButton(Dynamic1,5,"C");
		MouseLocationButton D = new MouseLocationButton(Dynamic2,6,"D");
		MouseLocationButton E = new MouseLocationButton(Dynamic3,7,"E");
		MouseLocationButton F = new MouseLocationButton(Dynamic4,8,"F");
		MouseLocationButton G = new MouseLocationButton(Dynamic5,9,"G");
		MouseLocationButton H = new MouseLocationButton(Dynamic6,10,"H");
		MouseLocationButton AA = new MouseLocationButton(Dynamic7,11,"AA");
		MouseLocationButton BB = new MouseLocationButton(Dynamic8,12,"BB");
		MouseLocationButton CC = new MouseLocationButton(Dynamic9,13,"CC");
		MouseLocationButton DD = new MouseLocationButton(Dynamic10,14,"DD");
		MouseLocationButton EE = new MouseLocationButton(Dynamic11,15,"EE");
		MouseLocationButton FF = new MouseLocationButton(Dynamic12,16,"FF");
		MouseLocationButton GG = new MouseLocationButton(Dynamic13,17,"GG");
		MouseLocationButton HH = new MouseLocationButton(Dynamic14,18,"HH");
		MouseLocationButton BattleField01 = new MouseLocationButton(Dynamic15,19,"�����԰���01�ϰ�y��");
		MouseLocationButton BattleField02 = new MouseLocationButton(Dynamic16,20,"�����԰���02�ϰ�y��");
		
		JIntellitype.getInstance().addHotKeyListener(new MouseButtonStart(A, B, C, D , E, F ,G, H,
																		  AA,BB,CC,DD,EE,FF,GG,HH,
																		  BattleField01,BattleField02,
																		  CheckBox,Retangular1,Retangular2));
		JIntellitype.getInstance().addHotKeyListener(new MouseButtonStop());
	
		JIntellitype.getInstance().addHotKeyListener(A);
		JIntellitype.getInstance().addHotKeyListener(B);
		JIntellitype.getInstance().addHotKeyListener(C);
		JIntellitype.getInstance().addHotKeyListener(D);
		JIntellitype.getInstance().addHotKeyListener(E);
		JIntellitype.getInstance().addHotKeyListener(F);
		JIntellitype.getInstance().addHotKeyListener(G);
		JIntellitype.getInstance().addHotKeyListener(H);
		JIntellitype.getInstance().addHotKeyListener(AA);
		JIntellitype.getInstance().addHotKeyListener(BB);
		JIntellitype.getInstance().addHotKeyListener(CC);
		JIntellitype.getInstance().addHotKeyListener(DD);
		JIntellitype.getInstance().addHotKeyListener(EE);
		JIntellitype.getInstance().addHotKeyListener(FF);
		JIntellitype.getInstance().addHotKeyListener(GG);
		JIntellitype.getInstance().addHotKeyListener(HH);
		JIntellitype.getInstance().addHotKeyListener(BattleField01);
		JIntellitype.getInstance().addHotKeyListener(BattleField02);
		
		
		JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_ALT, (int)'D');
		JIntellitype.getInstance().registerHotKey(2, JIntellitype.MOD_ALT, (int)'F');
		JIntellitype.getInstance().registerHotKey(3, JIntellitype.MOD_CONTROL, (int)'A');
		JIntellitype.getInstance().registerHotKey(4, JIntellitype.MOD_CONTROL, (int)'S');
		
		JIntellitype.getInstance().registerHotKey(5, JIntellitype.MOD_ALT, (int)'Z');
		JIntellitype.getInstance().registerHotKey(6, JIntellitype.MOD_ALT, (int)'X');
		JIntellitype.getInstance().registerHotKey(7, JIntellitype.MOD_ALT, (int)'C');
		JIntellitype.getInstance().registerHotKey(8, JIntellitype.MOD_ALT, (int)'V');
		JIntellitype.getInstance().registerHotKey(9, JIntellitype.MOD_ALT, (int)'B');
		JIntellitype.getInstance().registerHotKey(10, JIntellitype.MOD_ALT, (int)'N');
		
		JIntellitype.getInstance().registerHotKey(11, JIntellitype.MOD_ALT, (int)'Q');
		JIntellitype.getInstance().registerHotKey(12, JIntellitype.MOD_ALT, (int)'W');
		JIntellitype.getInstance().registerHotKey(13, JIntellitype.MOD_ALT, (int)'E');
		JIntellitype.getInstance().registerHotKey(14, JIntellitype.MOD_ALT, (int)'R');
		JIntellitype.getInstance().registerHotKey(15, JIntellitype.MOD_ALT, (int)'T');
		JIntellitype.getInstance().registerHotKey(16, JIntellitype.MOD_ALT, (int)'Y');
		JIntellitype.getInstance().registerHotKey(17, JIntellitype.MOD_ALT, (int)'U');
		JIntellitype.getInstance().registerHotKey(18, JIntellitype.MOD_ALT, (int)'I');
		
		/*
		 * �����ΧP�_�ϰ� ��
		 */
		JIntellitype.getInstance().registerHotKey(19, JIntellitype.MOD_ALT, (int)'K');
		JIntellitype.getInstance().registerHotKey(20, JIntellitype.MOD_ALT, (int)'L');
	}
}

class MouseLocationButton extends LocationAbstract
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

class MouseButtonStart implements HotkeyListener
{
	static Thread Task;
	private static JCheckBox DynamicMoveSelect;
	private RobotOperation robot;
	
	public MouseButtonStart(LocationAbstract A,LocationAbstract B , LocationAbstract C , LocationAbstract D , LocationAbstract E , LocationAbstract F,
							LocationAbstract G , LocationAbstract H,
							LocationAbstract AA,LocationAbstract BB , LocationAbstract CC , LocationAbstract DD , LocationAbstract EE , LocationAbstract FF,
							LocationAbstract GG , LocationAbstract HH,
							LocationAbstract Battle01 , LocationAbstract Battle02,
			                JCheckBox DynamicMove,RetangularPanel Retangular,RetangularPanel Retangular2) throws AWTException
	{
		DynamicMoveSelect = DynamicMove;
		robot = new RobotOperation(A,B,C,D,E,F,G,H,
									AA,BB,CC,DD,EE,FF,GG,HH,Battle01,Battle02,
									DynamicMoveSelect.isSelected(),Retangular,Retangular2);
	}
	
	@Override
	public void onHotKey(int KeyboardNum)
	{
		if(KeyboardNum ==3)
		{
			System.out.println("�~���{���}�l����");	
				Task = new Thread(robot);
				Task.start();

		}
	}
	
	public static void Task_interrupt()
	{
		Task.interrupt();
		Task.stop();
	}

}

class MouseButtonStop implements HotkeyListener
{	
	
	@Override
	public void onHotKey(int KeyboardNum) 
	{
		if(KeyboardNum ==4)
		{
			System.out.println("����~���{��");
			RobotOperation.interrupt();
			MouseButtonStart.Task_interrupt();
		}
	}	
}

class RobotOperation implements Runnable 
{
	public static Robot robot;
	private int number = 0;
	private static int inr = 0;
	private Vector<LocationAbstract> List1 = new Vector<LocationAbstract>();
	private Vector<LocationAbstract> List2 = new Vector<LocationAbstract>();
	private LocationAbstract HoldBattleField01;
	private LocationAbstract HoldBattleField02;
	
	private Boolean DynamicMoveSelect;
	private RetangularPanel HoldRetangular;
	private RetangularPanel HoldRetangula2;
	
	public RobotOperation(LocationAbstract A,LocationAbstract B , LocationAbstract C , LocationAbstract D , LocationAbstract E , LocationAbstract F,
			 			  LocationAbstract G , LocationAbstract H,
			 			 LocationAbstract AA,LocationAbstract BB , LocationAbstract CC , LocationAbstract DD , LocationAbstract EE , LocationAbstract FF,
			 			  LocationAbstract GG , LocationAbstract HH,
			 			 LocationAbstract Battle01 , LocationAbstract Battle02,
						  Boolean Dynamic,RetangularPanel Retangular,RetangularPanel Retangular2) throws AWTException
	{
		 robot = new Robot();
		 List1.add(A);
		 List1.add(B);
		 List1.add(C);
		 List1.add(D);
		 List1.add(E);
		 List1.add(F);
		 List1.add(G);
		 List1.add(H);
		 
		 List2.add(AA);
		 List2.add(BB);
		 List2.add(CC);
		 List2.add(DD);
		 List2.add(EE);
		 List2.add(FF);
		 List2.add(GG);
		 List2.add(HH);
		 
		HoldBattleField01 = Battle01;
		HoldBattleField02 = Battle02;
		DynamicMoveSelect = Dynamic;
		HoldRetangular = Retangular;
		HoldRetangula2 = Retangular2;
	}
	
	@Override
	public void run() 
	{
		/*
		 * ���������԰���Ӱϰ쪺X Y
		 */
		 int PixelField_01_X = HoldBattleField01.getObjectXY().getX();
		 int PixelField_01_Y = HoldBattleField01.getObjectXY().getY();
		 int PixelField_02_X = HoldBattleField02.getObjectXY().getX();
		 int PixelField_02_Y = HoldBattleField02.getObjectXY().getY();			
			
		if(List1.get(0).getObjectXY().getX()==0 && List2.get(0).getObjectXY().getX()==0)
		{
			System.out.println("�i�U��^���j�L�]�w�����I");
			System.out.println("�iException�j�i�{����");

		}
		else
		{
			
			inr = 1;
			while(true)
			{
				Color JudgeColor01 = robot.getPixelColor(PixelField_01_X, PixelField_01_Y);
				Color JudgeColor02 = robot.getPixelColor(PixelField_02_X, PixelField_02_Y);
				HoldRetangular.SetColor(JudgeColor01);
				HoldRetangula2.SetColor(JudgeColor02);
				HoldRetangular.repaint();
				HoldRetangula2.repaint();
				
					if(inr == 0)
					{
						break;
					}		
				
				if(JudgeColor01.getRed()==0 || JudgeColor01.getBlue()==0 || JudgeColor01.getGreen()==0 )	//�O�¦�N�i�J�s���I��
				{
					for(int count = 0 ; count < List1.size() ;count++)
					{
						/*
						 * �Ω�b�j�餺�P�_�԰��ϰ��C��O�_���`
						 */
						JudgeColor01 = robot.getPixelColor(PixelField_01_X, PixelField_01_Y);
						JudgeColor02 = robot.getPixelColor(PixelField_02_X, PixelField_02_Y);
						System.out.println("�C��1��:"+JudgeColor01);	//���C��
						System.out.println("�C��2��:"+JudgeColor02);	//���C��
						System.out.println("Ĳ�o�۰�");
						HoldRetangular.SetColor(JudgeColor01);
						HoldRetangula2.SetColor(JudgeColor02);
						HoldRetangular.repaint();
						HoldRetangula2.repaint();
						if(JudgeColor01.getRed()!=0 || JudgeColor01.getBlue()!=0 || JudgeColor01.getGreen()!=0 )
						{
							/*
							 * �Ω�b�j�餣�n�������e���_
							 */
							System.out.println("�i �۰ʤ��� �jNon Attack state -Success");
							break;
						}
						
						if(List1.get(count).getObjectXY().getX()!=0 ||List1.get(count).getObjectXY().getY()!=0)
						{	
							robot.mouseMove(List1.get(count).getObjectXY().getX(),List1.get(count).getObjectXY().getY());// ���ʨ�C�Ӭ����I�H���ɶ�
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							
							System.out.println("���b�I��"+List1.get(count).title+"�ϰ�: "+List1.get(count).getObjectXY().getX()+" ,  "+List1.get(count).getObjectXY().getY());
							
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
					for(int count = 0 ; count < List2.size() ;count++)
					{
						/*
						 * �Ω�b�j�餺�P�_�԰��ϰ��C��O�_���`
						 */
						JudgeColor01 = robot.getPixelColor(PixelField_01_X, PixelField_01_Y);
						JudgeColor02 = robot.getPixelColor(PixelField_02_X, PixelField_02_Y);
						System.out.println("�C��1��:"+JudgeColor01);	//���C��
						System.out.println("�C��2��:"+JudgeColor02);	//���C��
						System.out.println("Ĳ�o�۰�");
						HoldRetangular.SetColor(JudgeColor01);
						HoldRetangula2.SetColor(JudgeColor02);
						HoldRetangular.repaint();
						HoldRetangula2.repaint();
						if(JudgeColor02.getRed()!=0 || JudgeColor02.getBlue()!=0 || JudgeColor02.getGreen()!=0 )
						{
							/*
							 * �Ω�b�j�餣�n�������e���_
							 */
							System.out.println("�i �۰ʤ��� �jNon Attack state -Success");
							break;
						}
						
						if(List2.get(count).getObjectXY().getX()!=0 ||List2.get(count).getObjectXY().getY()!=0)
						{	
							robot.mouseMove(List2.get(count).getObjectXY().getX(),List2.get(count).getObjectXY().getY());// ���ʨ�C�Ӭ����I�H���ɶ�
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							robot.delay(100);
							robot.mousePress(MouseEvent.BUTTON1_MASK);// ���U�ƹ�
							robot.delay(100);
							robot.mouseRelease(MouseEvent.BUTTON1_MASK);
							
							System.out.println("���b�I��"+List2.get(count).title+"�ϰ�: "+List2.get(count).getObjectXY().getX()+" ,  "+List2.get(count).getObjectXY().getY());
							
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
	
}

class AButtonListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("A");
	}
}

class BButtonListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("B");
	}	
}