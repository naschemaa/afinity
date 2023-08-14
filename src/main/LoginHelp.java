package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginHelp {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginHelp window = new LoginHelp();
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
	public LoginHelp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

			frame = new JFrame();
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/media/afinity.png")));
			frame.setTitle("Login | afinity");
			frame.setBounds(100, 100, 522, 202);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/media/afinity100x100.png")));
			lblNewLabel.setBounds(10, 0, 118, 74);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Help");
			lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 23));
			lblNewLabel_1.setBounds(138, 11, 85, 31);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("You need to enter your password to unlock");
			lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
			lblNewLabel_1_1.setBounds(138, 33, 360, 31);
			frame.getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_1_1 = new JLabel("the software.");
			lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
			lblNewLabel_1_1_1.setBounds(138, 46, 360, 31);
			frame.getContentPane().add(lblNewLabel_1_1_1);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("If it's your first time using the software, the default password is");
			lblNewLabel_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
			lblNewLabel_1_1_2.setBounds(10, 75, 488, 31);
			frame.getContentPane().add(lblNewLabel_1_1_2);
			
			JLabel lblNewLabel_1_1_2_1 = new JLabel("'password'.");
			lblNewLabel_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
			lblNewLabel_1_1_2_1.setBounds(10, 92, 488, 31);
			frame.getContentPane().add(lblNewLabel_1_1_2_1);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			btnNewButton.setBounds(419, 142, 89, 23);
			frame.getContentPane().add(btnNewButton);
		
	}

	public static void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
