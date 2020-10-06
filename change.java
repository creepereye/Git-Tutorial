
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class color extends JFrame {
	public color()
	{
		setTitle("asd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2)
				{
					int r=(int)(Math.random()*256);
					int g=(int)(Math.random()*256);
					int b=(int)(Math.random()*256);
					c.setBackground(new Color(r,g,b));
				}
			}
		});
		setSize(600, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new color();
	}

}

