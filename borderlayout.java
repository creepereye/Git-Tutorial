
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class borderlayout extends JFrame {
	public borderlayout()
	{
		setTitle("borderlayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=getContentPane();
		con.setLayout(new BorderLayout(30, 20));
		con.add(new JButton("NORTH"),BorderLayout.NORTH);
		con.add(new JButton("EAST"),BorderLayout.EAST);
		con.add(new JButton("CENTER"),BorderLayout.CENTER);
		con.add(new JButton("SOUTH"),BorderLayout.SOUTH);
		con.add(new JButton("WEST"),BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new borderlayout();
	}

}
