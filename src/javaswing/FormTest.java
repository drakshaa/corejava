package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormTest {
public static void main(String[] args) {
	JFrame form = new JFrame();
	form.setSize(600,500);
	form.setTitle("Test Form");
	form.setLayout(null);
	
	//create JLabel ;
	JLabel jl = new JLabel("Welcome");
	jl.setBounds(120, 100, 130, 20);
	form.add(jl);
	
	form.setVisible(true);
}
}
