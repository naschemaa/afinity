package main;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
 
 
public class login extends JPanel 
                          implements ActionListener {
    private static String OK = "ok";
    private static String HELP = "help";
	protected static Object frame;
 
    private JFrame controllingFrame;
    private JPasswordField passwordField;
 
    public login(JFrame f) {
        controllingFrame = f;

 
        passwordField = new JPasswordField(10);
        passwordField.setActionCommand(OK);
        passwordField.addActionListener(this);
 
        JLabel label = new JLabel("Enter the password: ");
        label.setLabelFor(passwordField);
 
        JComponent buttonPane = createButtonPanel();
 
        JPanel textPane = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        textPane.add(label);
        textPane.add(passwordField);
 
        add(textPane);
        add(buttonPane);
    }
 
    protected JComponent createButtonPanel() {
        JPanel p = new JPanel(new GridLayout(0,1));
        JButton okButton = new JButton("OK");
        JButton helpButton = new JButton("Help");
 
        okButton.setActionCommand(OK);
        helpButton.setActionCommand(HELP);
        okButton.addActionListener(this);
        helpButton.addActionListener(this);
 
        p.add(okButton);
        p.add(helpButton);
 
        return p;
    }
 
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
 
        if (OK.equals(cmd)) {
            char[] input = passwordField.getPassword();
            if (isPasswordCorrect(input)) {
            	Main JFrame = new Main();
            	JFrame.setVsible(true);
            	

            } else {
                JOptionPane.showMessageDialog(controllingFrame,
                    "Invalid password. Try again.",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            }
 
            Arrays.fill(input, '0');
 
            passwordField.selectAll();
            resetFocus();
        } else { 
        	LoginHelp JFrame = new LoginHelp();
        	JFrame.setVisible(true);
        }
    }
 
    private static boolean isPasswordCorrect(char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };
 
        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals (input, correctPassword);
        }
 
        Arrays.fill(correctPassword,'0');
 
        return isCorrect;
    }
 
    protected void resetFocus() {
        passwordField.requestFocusInWindow();
    }
 

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("PasswordDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Login | afinity");
	frame.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/media/afinity.png")));


 
        final login newContentPane = new login(frame);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 

        frame.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent e) {
                newContentPane.resetFocus();
            }
        });
 
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        createAndShowGUI();
            }
        });
    }
}
