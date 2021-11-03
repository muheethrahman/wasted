package udupiKitchens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JPasswordField;
import java.awt.Button;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label(" Admin Panel");
		label.setFont(new Font("Times New Roman", Font.BOLD, 24));
		label.setBounds(310, 32, 200, 54);
		contentPane.add(label);
		
		Label label_1 = new Label("Admin Name");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(182, 185, 163, 21);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Password");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(182, 251, 163, 33);
		contentPane.add(label_2);
		
		TextField textField = new TextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(413, 185, 236, 33);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordField.setBounds(413, 251, 236, 33);
		contentPane.add(passwordField);
		
		Button button = new Button("Back");
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(127, 361, 91, 43);
		contentPane.add(button);
		
		Button button_1 = new Button("Submit");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_1.setBounds(310, 361, 107, 43);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Cancel");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_2.setBounds(552, 361, 97, 43);
		contentPane.add(button_2);
	}
}
