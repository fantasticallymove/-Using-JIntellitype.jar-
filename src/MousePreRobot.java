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

import abstractClass.MouseMultipleLocations_Button;
import abstractClass.MouseLocation_DoubleXY;
import robot.Panel.RetangularPanel;
import robot.buttonEvents.ResetBattle_FieldButton;
import robot.buttonEvents.ResetBlocksButton;
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
		
		JLabel text1 = new JLabel("01區域 顏色:");
		text1.setBounds(20,530 , 550, 30);
		JLabel text2 = new JLabel("01輔助區域 顏色:");
		text2.setBounds(160,530 , 550, 30);
		JLabel text3 = new JLabel("02區域 顏色:");
		text3.setBounds(20,600 , 550, 30);
		JLabel text4 = new JLabel("02輔助區域 顏色:");
		text4.setBounds(160,600 , 550, 30);
		
		JLabel ButtonA = new JLabel("【步驟1】 Ctrl+D 用於設定 Player1 8格模塊 施放位置");
		ButtonA.setBounds(10,10 , 320, 30);
		JLabel ButtonB = new JLabel("【步驟2】 Ctrl+F 用於設定 Player2 8格模塊 施放位置");
		ButtonB.setBounds(10,50 , 320, 30);
		JLabel ButtonC = new JLabel("【步驟3】   開始行動按下 Ctrl + A");
		ButtonC.setBounds(10,90 , 250, 30);
		ButtonC.setForeground(Color.RED);
		ButtonC.setFont(new Font(Font.DIALOG,Font.ITALIC,12));
		JLabel ButtonD = new JLabel("結束行動 按下Ctrl + S");
		ButtonD.setBounds(10,130 ,250, 30);
		ButtonD.setForeground(Color.RED);
		ButtonD.setFont(new Font(Font.DIALOG,Font.ITALIC,22));
		
		JLabel Dynamic = new JLabel("區域A-X:     ,Y:     "+"D塊");
		Dynamic.setBounds(440,200 , 250, 30);
		JLabel Dynamic0 = new JLabel("區域B-X:     ,Y:     "+"F塊");
		Dynamic0.setBounds(440,240 , 250, 30);
		
		JLabel Dynamic1 = new JLabel("區域C-X:     ,Y:     "+"Z塊");
		Dynamic1.setBounds(440,280 , 550, 30);
		JLabel Dynamic2 = new JLabel("區域D-X:     ,Y:     "+"X塊");
		Dynamic2.setBounds(440,320 , 550, 30);
				
		JLabel Dynamic3 = new JLabel("區域E-X:     ,Y:     "+"C塊");
		Dynamic3.setBounds(440,360 , 550, 30);
		JLabel Dynamic4 = new JLabel("區域F-X:     ,Y:     "+"V塊");
		Dynamic4.setBounds(440,400 , 550, 30);
		
		JLabel Dynamic5 = new JLabel("區域G-X:     ,Y:     "+"B塊");
		Dynamic5.setBounds(440,440 , 550, 30);
		JLabel Dynamic6 = new JLabel("區域H-X:     ,Y:     "+"N塊");
		Dynamic6.setBounds(440,480 , 550, 30);
		/////////////////////////////////////////////////////////////////////////
		JLabel Dynamic7 = new JLabel("區域AA-X:     ,Y:     "+"Q塊");
		Dynamic7.setBounds(10,200 , 250, 30);
		JLabel Dynamic8 = new JLabel("區域BB-X:     ,Y:     "+"W塊");
		Dynamic8.setBounds(10,240 , 250, 30);
		
		JLabel Dynamic9 = new JLabel("區域CC-X:     ,Y:     "+"E塊");
		Dynamic9.setBounds(10,280 , 550, 30);
		JLabel Dynamic10 = new JLabel("區域DD-X:     ,Y:     "+"R塊");
		Dynamic10.setBounds(10,320 , 550, 30);
				
		JLabel Dynamic11 = new JLabel("區域EE-X:     ,Y:     "+"T塊");
		Dynamic11.setBounds(10,360 , 550, 30);
		JLabel Dynamic12 = new JLabel("區域FF-X:     ,Y:     "+"Y塊");
		Dynamic12.setBounds(10,400 , 550, 30);
		
		JLabel Dynamic13 = new JLabel("區域GG-X:     ,Y:     "+"U塊");
		Dynamic13.setBounds(10,440 , 550, 30);
		JLabel Dynamic14 = new JLabel("區域HH-X:     ,Y:     "+"I塊");
		Dynamic14.setBounds(10,480 , 550, 30);
		
		JLabel Dynamic15 = new JLabel("偵測戰鬥用01區域座標-X:     ,Y:     "+"按Alt+Z");
		Dynamic15.setBounds(400,520 , 550, 30);
		JLabel Dynamic16 = new JLabel("偵測戰鬥用01區域輔助座標-X:     ,Y:     ");
		Dynamic16.setBounds(400,560 , 550, 30);
		
		JLabel Dynamic17 = new JLabel("偵測戰鬥用02區域座標-X:     ,Y:     "+"按Alt+X");
		Dynamic17.setBounds(400,600 , 550, 30);
		JLabel Dynamic18 = new JLabel("偵測戰鬥用02區域輔助座標-X:     ,Y:     ");
		Dynamic18.setBounds(400,640 , 550, 30);
		
		JButton ButtonG = new JButton("測試用按鈕 A 移動到此鈕按組合鍵");
		ButtonG.addActionListener(new AButtonListener(ButtonG));
		ButtonG.setBounds(350,10 , 280, 30);
		JButton ButtonH = new JButton("測試用按鈕 B 移動到此鈕按組合鍵");
		ButtonH.setBounds(350,50 , 280, 30);
		ButtonH.addActionListener(new BButtonListener(ButtonH));
		JCheckBox CheckBox = new JCheckBox("動態軌跡模擬隨機模式");
		CheckBox.setSelected(true);
		CheckBox.setFocusPainted(false);
		CheckBox.setBounds(350,130 ,210, 30);
		JButton ResetBattleField = new JButton("重設判斷區域");
		ResetBattleField.setBounds(690, 545 , 130, 30);
		ResetBattleField.setFont(new Font(Font.SERIF,Font.BOLD,12));
		JButton ResetPlayer1 = new JButton("重設Player2");
		ResetPlayer1.setBounds(270, 300 , 130, 30);
		ResetPlayer1.setFont(new Font(Font.SERIF,Font.BOLD,12));
		JButton ResetPlayer2 = new JButton("重設Player1");
		ResetPlayer2.setBounds(630, 300 , 130, 30);
		ResetPlayer2.setFont(new Font(Font.SERIF,Font.BOLD,12));
		
		
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
		con.add(ResetPlayer1);
		con.add(ResetPlayer2);
		con.add(ResetBattleField);
		con.add(Retangular1);
		con.add(Retangular2);
		con.add(Retangular3);
		con.add(Retangular4);
		
		frame.setTitle("魔力SuperHero");		
		frame.pack();
		frame.setSize(850,750);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MouseMultipleLocations_Button A = new MouseMultipleLocations_Button
		(Dynamic,"A",
		 Dynamic0,"B",
		 Dynamic1,"C",
		 Dynamic2,"D",
		 Dynamic3,"E",
		 Dynamic4,"F",
		 Dynamic5,"G",
		 Dynamic6,"H",1);
		
		MouseMultipleLocations_Button B = new MouseMultipleLocations_Button
		(Dynamic7,"AA",
		 Dynamic8,"BB",
		 Dynamic9,"CC",
		 Dynamic10,"DD",
		 Dynamic11,"EE",
		 Dynamic12,"FF",
		 Dynamic13,"GG",
		 Dynamic14,"HH",2);
		MouseLocation_DoubleXY BattleField01 = new MouseLocation_DoubleXY(Dynamic15,Dynamic16,19,"偵測戰鬥用01區域座標","偵測戰鬥用01區域輔助座標");
		MouseLocation_DoubleXY BattleField02 = new MouseLocation_DoubleXY(Dynamic17,Dynamic18,20,"偵測戰鬥用02區域座標","偵測戰鬥用02區域輔助座標");
		
		ResetBattleField.addActionListener(new ResetBattle_FieldButton(BattleField01,BattleField02));	//新增戰鬥區域判斷回歸按鈕
		ResetPlayer1.addActionListener(new ResetBlocksButton(B));										//回歸設定按鈕
		ResetPlayer2.addActionListener(new ResetBlocksButton(A));										//回歸設定按鈕
		
		JIntellitype.getInstance().addHotKeyListener(new MouseButtonStart(A,B,
																		  BattleField01,BattleField02,
																		  CheckBox,Retangular1,Retangular2,Retangular3,Retangular4));
		JIntellitype.getInstance().addHotKeyListener(new MouseButtonStop());
	
		JIntellitype.getInstance().addHotKeyListener(A);
		JIntellitype.getInstance().addHotKeyListener(B);
		JIntellitype.getInstance().addHotKeyListener(BattleField01);
		JIntellitype.getInstance().addHotKeyListener(BattleField02);
		
		

		JIntellitype.getInstance().registerHotKey(3, JIntellitype.MOD_CONTROL, (int)'A');
		JIntellitype.getInstance().registerHotKey(4, JIntellitype.MOD_CONTROL, (int)'S');
		
		JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_ALT, (int)'D');
		JIntellitype.getInstance().registerHotKey(2, JIntellitype.MOD_ALT, (int)'F');
		
		/*
		 * 偵測用判斷區域 ↓
		 */
		JIntellitype.getInstance().registerHotKey(19, JIntellitype.MOD_ALT, (int)'Z');
		JIntellitype.getInstance().registerHotKey(20, JIntellitype.MOD_ALT, (int)'X');
	}
}


class MouseButtonStart implements HotkeyListener
{
	static Thread Task;
	private static JCheckBox DynamicMoveSelect;
	private RobotOperation robot;
	
	public MouseButtonStart(MouseMultipleLocations_Button A,MouseMultipleLocations_Button B,
							MouseLocation_DoubleXY Battle01 , MouseLocation_DoubleXY Battle02,
			                JCheckBox DynamicMove,RetangularPanel Retangular,RetangularPanel Retangular2,RetangularPanel Retangular3,RetangularPanel Retangular4) throws AWTException
	{
		DynamicMoveSelect = DynamicMove;
		robot = new RobotOperation(A,B,Battle01,Battle02,
									DynamicMoveSelect.isSelected(),Retangular,Retangular2,Retangular3,Retangular4);
	}
	
	@Override
	public void onHotKey(int KeyboardNum)
	{
		if(KeyboardNum ==3)
		{
			System.out.println("外掛程式開始執行");	
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
			System.out.println("中止外掛程式");
			RobotOperation.interrupt();
			MouseButtonStart.Task_interrupt();
		}
	}	
}

