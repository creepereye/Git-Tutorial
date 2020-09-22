
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class check_time_p528 extends JFrame {
	public check_time_p528()
	{
		setTitle("check_time_p528");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,3));
		JLabel Jl[]=new JLabel[6];
		Color color[]= {Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.RED};
		for(int i=0;i<=5;i++)
		{
			Jl[i]=new JLabel(Integer.toString(i));
			Jl[i].setOpaque(true);
			Jl[i].setBackground(color[i]);
			c.add(Jl[i]);
		}
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new check_time_p528();
	}

}
