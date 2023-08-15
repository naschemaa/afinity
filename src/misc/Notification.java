package misc;

import java.awt.*;
import java.awt.TrayIcon.*;

public class Notification {


	        public static void main(String[] args) throws AWTException {
	            if (SystemTray.isSupported()) {
	                Notification td = new Notification();
	                td.displayTray();
	            } else {
	                System.err.println("unupported!");
	            }
	        }

	        public void displayTray() throws AWTException {
	            SystemTray tray = SystemTray.getSystemTray();

	            Image image = (Toolkit.getDefaultToolkit().getImage(Notification.class.getResource("/media/afinity.png")));
	         
	            TrayIcon trayIcon = new TrayIcon(image, "afinity");
	            trayIcon.setImageAutoSize(true);
	            trayIcon.setToolTip("Icon");
	            tray.add(trayIcon);

	            trayIcon.displayMessage("afinity", "afinity has been unlocked.", MessageType.INFO);
	        }
	    

	}


