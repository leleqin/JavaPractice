package demo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameDemo {
	public static void main(String[] args)
	{
		JFrame j = new JFrame();
		JFrame f = new JFrame("����2");
		j.setBounds(500, 200, 200, 300);
		j.setLayout(new BorderLayout(100,100));
//		f.setBounds(200, 0, 350, 300);
//		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		f.setVisible(true);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*//���ñ߿򲼾�
		j.setLayout(new BorderLayout(10,10));
		Button b = new Button("����һ����ť");
		//Ĭ��Ϊ��
		f.add(b);
		//�ڱ���
		f.add(new Button("��"),BorderLayout.NORTH);*/
		//������ʽ����
		j.setLayout(new FlowLayout());
		for (int i = 0; i < 6; i++) {
			j.add(new Button("��ť"+i));
		}
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
}
