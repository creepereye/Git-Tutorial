
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class gridlayout extends JFrame {
	public gridlayout()
	{
		setTitle("gridlayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con=getContentPane();
		con.setLayout(new GridLayout(4,2));
		con.add(new JLabel("이름"));
		con.add(new JTextField(""));
		con.add(new JLabel("학번"));
		con.add(new JTextField(""));
		con.add(new JLabel("학과"));
		con.add(new JTextField(""));
		con.add(new JLabel("과목"));
		con.add(new JTextField(""));
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new gridlayout();
	}

}
