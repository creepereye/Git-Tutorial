
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class lets_study_java extends JFrame {
	public lets_study_java(String title)
	{
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con=getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(new JButton("start"));
		setSize(400,200);
		setVisible(3<5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new lets_study_java("java공부");
	}

}
