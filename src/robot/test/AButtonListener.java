package robot.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AButtonListener implements ActionListener
{
	JButton Holdbutton;
	int number = 0;
	public AButtonListener(JButton button)
	{
		Holdbutton = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Holdbutton.setText("���եΫ��s A ���ʨ즹�s���զX�� T:"+number);
		number++;
		System.out.println("A");
	}
}
