
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pratice_p533_7 extends JFrame {
	public pratice_p533_7()
	{
		setTitle("pratice_p533_7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.add(new south(),BorderLayout.SOUTH);
		c.add(new center(),BorderLayout.CENTER);
		c.add(new north(),BorderLayout.NORTH);
		setSize(300, 300);
		setVisible(true);
	}
	public class north extends JPanel
	{
		public north()
		{
			setBackground(Color.gray);
			setOpaque(true);
			setLayout(new FlowLayout());
			add(new JLabel("수식입력"));
			add(new JTextField(16));
		}
	}
	public class center extends JPanel
	{
		JButton b[]= {new JButton("+"),new JButton("-"),new JButton("x"),new JButton("/")};
		public center()
		{
			setBackground(Color.WHITE);
			setOpaque(true);
			setLayout(new GridLayout(4,4,5,5));
			for(int i=0;i<=9;i++)
			{
				add(new JButton(Integer.toString(i)));
			}
			add(new JButton("CE"));
			add(new JButton("계산"));
			for(int i=0;i<4;i++)
			{
				b[i].setBackground(Color.CYAN);
				b[i].setOpaque(true);
				add(b[i]);
			}
		}
	}
	public class south extends JPanel
	{
		public south()
		{
			setBackground(Color.YELLOW);
			setOpaque(true);
			setLayout(new FlowLayout());
			add(new JLabel("계산 결과"));
			add(new JTextField(16));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pratice_p533_7();
	}
	
}
