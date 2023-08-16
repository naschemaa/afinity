package 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Button;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Main() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 119, 63);
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/media/afinity100x100.png")));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("File");
		btnNewButton.setBounds(0, 71, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnNewButton, popupMenu);
		
		JButton btnNewButton_1 = new JButton("New");
		popupMenu.add(btnNewButton_1);
	}

	public void setVsible(boolean b) {
		frame.setVisible(true);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
