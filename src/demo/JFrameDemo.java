package demo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameDemo {
	public static void main(String[] args)
	{
		JFrame j = new JFrame();
		JFrame f = new JFrame("窗口2");
		j.setBounds(500, 200, 200, 300);
		j.setLayout(new BorderLayout(100,100));
//		f.setBounds(200, 0, 350, 300);
//		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		f.setVisible(true);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*//设置边框布局
		j.setLayout(new BorderLayout(10,10));
		Button b = new Button("我是一个按钮");
		//默认为中
		f.add(b);
		//在北的
		f.add(new Button("北"),BorderLayout.NORTH);*/
		//设置流式布局
		j.setLayout(new FlowLayout());
		for (int i = 0; i < 6; i++) {
			j.add(new Button("按钮"+i));
		}
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
}
