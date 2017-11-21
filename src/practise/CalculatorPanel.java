package practise;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
/*
 * ¼ÆËãÆ÷Ãæ°å
 * 
 * */
public class CalculatorPanel extends JPanel {

	private JPanel jp;
	
public CalculatorPanel(){
	
	setLayout(new BorderLayout());
	jp = new JPanel();
	jp.setLayout(new GridLayout(4, 4));
	
	makeButton("7", null);
	makeButton("8", null);
	makeButton("9", null);
	makeButton("/", null);
	
	makeButton("4", null);
	makeButton("5", null);
	makeButton("6", null);
	makeButton("*", null);
	
	makeButton("1", null);
	makeButton("2", null);
	makeButton("3", null);
	makeButton("-", null);
	
	makeButton("0", null);
	makeButton(".", null);
	makeButton("+", null);
	makeButton("=", null);
}
	
	private void makeButton(String buttonName, ActionListener a1) {
		JButton jb = new JButton(buttonName);
		jp.add(jb);
		jb.addActionListener(a1);
}

	public static void main(String[] args) {
		CalculatorPanel ca = new CalculatorPanel();
		ca.setBounds(100, 100, 270, 260);
	}

}
