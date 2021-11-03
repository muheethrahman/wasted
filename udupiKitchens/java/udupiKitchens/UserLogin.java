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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("User LogIn Page");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(287, 32, 206, 41);
		contentPane.add(label);
		
		Label label_1 = new Label("UserName");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_1.setBounds(194, 176, 140, 31);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Password");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_2.setBounds(194, 230, 140, 31);
		contentPane.add(label_2);
		
		TextField textField = new TextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(375, 176, 230, 31);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passwordField.setBounds(375, 230, 230, 31);
		contentPane.add(passwordField);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(162, 317, 110, 41);
		contentPane.add(button);
		
		Button button_1 = new Button("Submit");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_1.setBounds(376, 317, 117, 41);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Cancel");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_2.setBounds(539, 317, 110, 41);
		contentPane.add(button_2);
	}
}
