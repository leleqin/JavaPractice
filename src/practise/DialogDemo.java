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
	 add(new JLabel("��ϲ�����˶�"));
	 checkBox1 = new JCheckBox("�٤");
	 checkBox2 = new JCheckBox("����");
	 checkBox3 = new JCheckBox("��Ӿ");
	 add(checkBox1);
	 add(checkBox2);
	 add(checkBox3);
	 
	 add(new JLabel(" ��  ��  ��  ��  �ǣ� "));
	 ButtonGroup group = new ButtonGroup();
	 radio1 = new JRadioButton("��");
	 radio2 = new JRadioButton("Ů");
	 group.add(radio1);
	 group.add(radio2);
	 add(radio1);
	 add(radio2);
	 
	 button1 = new JButton("ע��");
	 button2 = new JButton("ȡ��");
	 add(button1);
	 add(button2);
}
	
	public static void main(String[] args) {
		DialogDemo dia = new DialogDemo(); 
		dia.setBounds(100, 100, 270, 260);
		dia.setTitle(" ");
	}

}
