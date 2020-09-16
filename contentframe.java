
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx()
	{
		setTitle("ContentPane과 Jframe");//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료버튼관련
		Container contentpane=getContentPane();//create pane
		contentpane.setBackground(Color.BLUE);//background color=blue
		contentpane.setLayout(new FlowLayout());//I did not learn yet
		contentpane.add(new JButton("ok"));
		contentpane.add(new JButton("cancle"));
		contentpane.add(new JButton("ignore"));
		setSize(700,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
