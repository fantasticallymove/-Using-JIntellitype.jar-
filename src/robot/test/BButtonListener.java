package robot.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BButtonListener implements ActionListener
{
	JButton Holdbutton;
	int number = 0;
	public BButtonListener(JButton button)
	{
		Holdbutton = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Holdbutton.setText("���եΫ��s B ���ʨ즹�s���զX�� T:"+number);
		number++;
		System.out.println("B");
	}	
}
