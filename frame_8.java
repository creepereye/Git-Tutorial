
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class frame_8ex extends JFrame {
	public frame_8ex()
	{
		setTitle("asd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.MAGENTA);
		con.add(new JButton("s"));
		setSize(300,300);
		setVisible(3<5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new frame_8ex();
	}

}
