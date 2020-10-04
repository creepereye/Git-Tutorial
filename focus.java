
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class focus extends JFrame {
	private JLabel[] keymessage;
	public focus()
	{
		setTitle("example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new mykey());
		
		keymessage=new JLabel[3];
		keymessage[0]=new JLabel("getkeycode()");
		keymessage[1]=new JLabel("getkeychar()");
		keymessage[2]=new JLabel("getkeytext()");
		
		for(int i=0;i<keymessage.length;i++)
		{
			c.add(keymessage[i]);
			keymessage[i].setOpaque(true);
			keymessage[i].setBackground(Color.YELLOW);
		}
		setSize(500, 500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	public class mykey extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			
			int keycode=e.getKeyCode();
			char keychar=e.getKeyChar();
			
			keymessage[0].setText(Integer.toString(keycode));
			keymessage[1].setText(Character.toString(keychar));
			keymessage[2].setText(e.getKeyText(keycode));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new focus();
	}

}
