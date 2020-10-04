
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class iam extends JFrame {
	JLabel f=new JLabel("sd");
	public iam()
	{
		setTitle("안녕");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.addKeyListener(new t());
		c.add(f);
		setSize(500, 500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	class t extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			f.setText(KeyEvent.getKeyText(e.getKeyCode()));
			
			Container l=(Container)e.getSource();
				if(e.getKeyChar()=='q')
					l.setBackground(Color.green);
				else if(e.getKeyCode()==KeyEvent.VK_F1)
					l.setBackground(Color.orange);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new iam();
	}

}
