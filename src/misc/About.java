package misc;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.LoginHelp;

public class About {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
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
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Welcome | Atik");
		frame.getContentPane().setBackground(new Color(64, 0, 128));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("About | afinity");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 26));
		lblNewLabel.setBounds(10, 11, 333, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginHelp Jframe = new LoginHelp();
				LoginHelp.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(64, 0, 128));
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setBounds(433, 278, 87, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("afinity by naschemaa.");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 50, 372, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("GitHub version for The Raided Foundation.");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 70, 372, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				    URI uri = new URI("https://www.instagram.com/naschemaa/");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}
			}
		
		});
		btnNewButton_1.setIcon(new ImageIcon(About.class.getResource("/media/socials/insta.png")));
		btnNewButton_1.setBounds(10, 247, 66, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				    URI uri = new URI("https://discord.gg/aKxC2bwKzr");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}
			}
			
		});
		btnNewButton_1_1.setIcon(new ImageIcon(About.class.getResource("/media/socials/discord.png")));
		btnNewButton_1_1.setBounds(86, 246, 66, 55);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    URI uri = new URI("https://twitter.com/naschemaa");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}

			
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon(About.class.getResource("/media/socials/twitter.png")));
		btnNewButton_1_1_1.setBounds(162, 246, 66, 55);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    URI uri = new URI("https://www.youtube.com/channel/UCQOFpP2f9ILj4cVAUwnd18g");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}	
			}
		});
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(About.class.getResource("/media/socials/yt.png")));
		btnNewButton_1_1_1_1.setBounds(238, 246, 66, 55);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    URI uri = new URI("http://thetrf.eu/nas");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}

			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon(About.class.getResource("/media/socials/logo_pride.png")));
		btnNewButton_1_2.setBounds(10, 181, 66, 55);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    URI link = new URI("https://github.com/naschemaa");
				    Desktop desk = Desktop.getDesktop();
				    desk.browse(link);
				}
				catch(Exception ex){}
			}
		});
		btnNewButton_1_2_1.setIcon(new ImageIcon(About.class.getResource("/media/socials/git.png")));
		btnNewButton_1_2_1.setBounds(86, 180, 66, 55);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					URI uri = new URI("https://paypal.me/naschemaa");
					Desktop dt = Desktop.getDesktop();
					dt.browse(uri);
				} catch(Exception ex) {}
			}
		});
		btnNewButton_1_2_1_1.setIcon(new ImageIcon(About.class.getResource("/media/socials/paypal.png")));
		btnNewButton_1_2_1_1.setBounds(162, 180, 66, 55);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				URI uri = new URI("https://www.tiktok.com/@naschemaa_tk");
				Desktop dt = Desktop.getDesktop();
				dt.browse(uri);
		} catch(Exception ex) {}
		}
		});
		btnNewButton_1_2_1_1_1.setIcon(new ImageIcon(About.class.getResource("/media/socials/tiktok.png")));
		btnNewButton_1_2_1_1_1.setBounds(238, 181, 66, 55);
		frame.getContentPane().add(btnNewButton_1_2_1_1_1);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/media/afinity.png")));
		frame.setBounds(100, 100, 544, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}


