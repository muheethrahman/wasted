package udupiKitchens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrontPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1004, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Welcome to Udupi Ketchin");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(372, 35, 279, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("  User Portal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin ULogIn=new UserLogin();
				ULogIn.setVisible(true);
				
				frame.dispose();
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(267, 145, 179, 66);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("  Admin Portal");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin adl=new AdminLogin();
				adl.setVisible(true);
				
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(585, 145, 192, 66);
		frame.getContentPane().add(btnNewButton_1);
	}
}
