package practise;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class DialogDemo extends JDialog {
	JButton button1,button2;
	JCheckBox checkBox1,checkBox2,checkBox3;
	JRadioButton radio1,radio2;
	
public DialogDemo(){
	init();
	setVisible(true);
	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
}

 void init() {
	 setLayout(new FlowLayout());
	 add(new JLabel("你喜欢的运动"));
	 checkBox1 = new JCheckBox("瑜伽");
	 checkBox2 = new JCheckBox("足球");
	 checkBox3 = new JCheckBox("游泳");
	 add(checkBox1);
	 add(checkBox2);
	 add(checkBox3);
	 
	 add(new JLabel(" 你  的  性  别  是： "));
	 ButtonGroup group = new ButtonGroup();
	 radio1 = new JRadioButton("男");
	 radio2 = new JRadioButton("女");
	 group.add(radio1);
	 group.add(radio2);
	 add(radio1);
	 add(radio2);
	 
	 button1 = new JButton("注册");
	 button2 = new JButton("取消");
	 add(button1);
	 add(button2);
}
	
	public static void main(String[] args) {
		DialogDemo dia = new DialogDemo(); 
		dia.setBounds(100, 100, 270, 260);
		dia.setTitle(" ");
	}

}
