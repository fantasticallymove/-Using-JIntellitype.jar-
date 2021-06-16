import java.awt.AWTException;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

import abstractClass.LocationAbstract;
import abstractClass.MouseLocationButton;
import abstractClass.MouseLocation_DoubleXY;
import robot.Panel.RetangularPanel;
import robot.buttonEvents.ResetBattle_FieldButton;
import robot.robotEvent.RobotOperation;
import robot.test.AButtonListener;
import robot.test.BButtonListener;


public class MousePreRobot
{
	Container con;
	RetangularPanel Retangular1;
	RetangularPanel Retangular2;
	RetangularPanel Retangular3;
	RetangularPanel Retangular4;
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
		JLabel text2 = new JLabel("01���U�ϰ� �C��:");
		text2.setBounds(160,530 , 550, 30);
		JLabel text3 = new JLabel("02�ϰ� �C��:");
		text3.setBounds(20,600 , 550, 30);
		JLabel text4 = new JLabel("02���U�ϰ� �C��:");
		text4.setBounds(160,600 , 550, 30);
		
		JLabel ButtonA = new JLabel("�i�B�J1�j   ����ϰ�A���U D �]�w�Ĥ@���I");
		ButtonA.setBounds(10,10 , 250, 30);
		JLabel ButtonB = new JLabel("�i�B�J2�j����ϰ�B���U F �]�w�Ĥ@���I");
		ButtonB.setBounds(10,50 , 250, 30);
		JLabel ButtonC = new JLabel("�i�B�J3�j   �}�l��ʫ��U Ctrl + A");
		ButtonC.setBounds(10,90 , 250, 30);
		JLabel ButtonD = new JLabel("������� ���UAlt + S");
		ButtonD.setBounds(10,130 ,250, 30);
		ButtonD.setForeground(Color.RED);
		ButtonD.setFont(new Font(Font.DIALOG,Font.ITALIC,22));
		
		JLabel Dynamic = new JLabel("�ϰ�A-X:     ,Y:     "+"��Alt+D");
		Dynamic.setBounds(440,200 , 250, 30);
		JLabel Dynamic0 = new JLabel("�ϰ�B-X:     ,Y:     "+"��Alt+F");
		Dynamic0.setBounds(440,240 , 250, 30);
		
		JLabel Dynamic1 = new JLabel("�ϰ�C-X:     ,Y:     "+"��Alt+Z");
		Dynamic1.setBounds(440,280 , 550, 30);
		JLabel Dynamic2 = new JLabel("�ϰ�D-X:     ,Y:     "+"��Alt+X");
		Dynamic2.setBounds(440,320 , 550, 30);
				
		JLabel Dynamic3 = new JLabel("�ϰ�E-X:     ,Y:     "+"��Alt+C");
		Dynamic3.setBounds(440,360 , 550, 30);
		JLabel Dynamic4 = new JLabel("�ϰ�F-X:     ,Y:     "+"��Alt+V");
		Dynamic4.setBounds(440,400 , 550, 30);
		
		JLabel Dynamic5 = new JLabel("�ϰ�G-X:     ,Y:     "+"��Alt+B");
		Dynamic5.setBounds(440,440 , 550, 30);
		JLabel Dynamic6 = new JLabel("�ϰ�H-X:     ,Y:     "+"��Alt+N");
		Dynamic6.setBounds(440,480 , 550, 30);
		
		JLabel Dynamic7 = new JLabel("�ϰ�AA-X:     ,Y:     "+"��Alt+Q");
		Dynamic7.setBounds(10,200 , 250, 30);
		JLabel Dynamic8 = new JLabel("�ϰ�BB-X:     ,Y:     "+"��Alt+W");
		Dynamic8.setBounds(10,240 , 250, 30);
		
		JLabel Dynamic9 = new JLabel("�ϰ�CC-X:     ,Y:     "+"��Alt+E");
		Dynamic9.setBounds(10,280 , 550, 30);
		JLabel Dynamic10 = new JLabel("�ϰ�DD-X:     ,Y:     "+"��Alt+R");
		Dynamic10.setBounds(10,320 , 550, 30);
				
		JLabel Dynamic11 = new JLabel("�ϰ�EE-X:     ,Y:     "+"��Alt+T");
		Dynamic11.setBounds(10,360 , 550, 30);
		JLabel Dynamic12 = new JLabel("�ϰ�FF-X:     ,Y:     "+"��Alt+Y");
		Dynamic12.setBounds(10,400 , 550, 30);
		
		JLabel Dynamic13 = new JLabel("�ϰ�GG-X:     ,Y:     "+"��Alt+U");
		Dynamic13.setBounds(10,440 , 550, 30);
		JLabel Dynamic14 = new JLabel("�ϰ�HH-X:     ,Y:     "+"��Alt+I");
		Dynamic14.setBounds(10,480 , 550, 30);
		
		JLabel Dynamic15 = new JLabel("�����԰���01�ϰ�y��-X:     ,Y:     "+"��K");
		Dynamic15.setBounds(400,520 , 550, 30);
		JLabel Dynamic16 = new JLabel("�����԰���01�ϰ컲�U�y��-X:     ,Y:     "+"��L");
		Dynamic16.setBounds(400,560 , 550, 30);
		
		JLabel Dynamic17 = new JLabel("�����԰���02�ϰ�y��-X:     ,Y:     ");
		Dynamic17.setBounds(400,600 , 550, 30);
		JLabel Dynamic18 = new JLabel("�����԰���02�ϰ컲�U�y��-X:     ,Y:     ");
		Dynamic18.setBounds(400,640 , 550, 30);
		
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
		JButton ResetBattleField = new JButton("���]�P�_�ϰ�");
		ResetBattleField.setBounds(690, 545 , 130, 30);
		ResetBattleField.setFont(new Font(Font.SERIF,Font.BOLD,12));
		
		
		Retangular1 = new RetangularPanel();
		Retangular1.setBounds(100,530, 50, 50);
		Retangular2 = new RetangularPanel();
		Retangular2.setBounds(270,530, 50, 50);
		Retangular3 = new RetangularPanel();
		Retangular3.setBounds(100,600, 50, 50);
		Retangular4 = new RetangularPanel();
		Retangular4.setBounds(270,600, 50, 50);
		
		con.add(ButtonA);
		con.add(ButtonB);
		con.add(ButtonC);
		con.add(ButtonD);
		con.add(Dynamic);
		con.add(Dynamic0);
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
		con.add(Dynamic17);
		con.add(Dynamic18);
		con.add(text1);
		con.add(text2);
		con.add(text3);
		con.add(text4);
		con.add(ResetBattleField);
		con.add(Retangular1);
		con.add(Retangular2);
		con.add(Retangular3);
		con.add(Retangular4);
		
		frame.setTitle("�]�OSuperHero");		
		frame.pack();
		frame.setSize(850,750);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MouseLocationButton A = new MouseLocationButton(Dynamic,1,"A");
		MouseLocationButton B = new MouseLocationButton(Dynamic0,2,"B");
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
		MouseLocation_DoubleXY BattleField01 = new MouseLocation_DoubleXY(Dynamic15,Dynamic16,19,"�����԰���01�ϰ�y��","�����԰���01�ϰ컲�U�y��");
		MouseLocation_DoubleXY BattleField02 = new MouseLocation_DoubleXY(Dynamic17,Dynamic18,20,"�����԰���02�ϰ�y��","�����԰���02�ϰ컲�U�y��");
		
		ResetBattleField.addActionListener(new ResetBattle_FieldButton(BattleField01,BattleField02));	//�s�W�԰��ϰ�P�_�^�k���s
		
		
		JIntellitype.getInstance().addHotKeyListener(new MouseButtonStart(A, B, C, D , E, F ,G, H,
																		  AA,BB,CC,DD,EE,FF,GG,HH,
																		  BattleField01,BattleField02,
																		  CheckBox,Retangular1,Retangular2,Retangular3,Retangular4));
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
		
		

		JIntellitype.getInstance().registerHotKey(3, JIntellitype.MOD_CONTROL, (int)'A');
		JIntellitype.getInstance().registerHotKey(4, JIntellitype.MOD_CONTROL, (int)'S');
		
		JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_ALT, (int)'D');
		JIntellitype.getInstance().registerHotKey(2, JIntellitype.MOD_ALT, (int)'F');
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


class MouseButtonStart implements HotkeyListener
{
	static Thread Task;
	private static JCheckBox DynamicMoveSelect;
	private RobotOperation robot;
	
	public MouseButtonStart(LocationAbstract A,LocationAbstract B , LocationAbstract C , LocationAbstract D , LocationAbstract E , LocationAbstract F,
							LocationAbstract G , LocationAbstract H,
							LocationAbstract AA,LocationAbstract BB , LocationAbstract CC , LocationAbstract DD , LocationAbstract EE , LocationAbstract FF,
							LocationAbstract GG , LocationAbstract HH,
							MouseLocation_DoubleXY Battle01 , MouseLocation_DoubleXY Battle02,
			                JCheckBox DynamicMove,RetangularPanel Retangular,RetangularPanel Retangular2,RetangularPanel Retangular3,RetangularPanel Retangular4) throws AWTException
	{
		DynamicMoveSelect = DynamicMove;
		robot = new RobotOperation(A,B,C,D,E,F,G,H,
									AA,BB,CC,DD,EE,FF,GG,HH,Battle01,Battle02,
									DynamicMoveSelect.isSelected(),Retangular,Retangular2,Retangular3,Retangular4);
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
	
	@SuppressWarnings("deprecation")
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

