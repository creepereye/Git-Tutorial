
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class pratice4 extends JFrame {
	public pratice4()
	{
		Color color[]= {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		setTitle("Ten Color Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,9));
		for(int i=0;i<10;i++)
		{
			JButton j=new JButton(Integer.toString(i));
			j.setBackground(color[i]);
			j.setOpaque(true);
			c.add(j);
		}
		setSize(1200, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pratice4();
	}

}
