package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameTxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("LoginForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 328);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(105, 81, 75, 22);
		contentPane.add(lblNewLabel);
		
		usernameTxt = new JTextField();
		usernameTxt.setBounds(199, 73, 134, 39);
		contentPane.add(usernameTxt);
		usernameTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(105, 138, 68, 22);
		contentPane.add(lblNewLabel_1);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setBounds(199, 136, 134, 39);
		contentPane.add(passwordTxt);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 64));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				JOptionPane.showMessageDialog(null, "Hello");
				
				String un = usernameTxt.getText();
				String pw = passwordTxt.getText();
				
				if (un.equals("Ram") && pw.equals("1234")) {
					JOptionPane.showMessageDialog(null, "Login Success");
					new Home().setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Fail");
				}
					
				
			}
		});
		btnNewButton.setBounds(199, 201, 134, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("User Login");
		lblNewLabel_2.setForeground(new Color(64, 0, 64));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(199, 30, 106, 32);
		contentPane.add(lblNewLabel_2);
	}
}
