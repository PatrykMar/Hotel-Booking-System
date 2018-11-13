package hbs.Views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	JPanel mainPanel = new JPanel();
	private JTextField userField;
	private JPasswordField passwordField;
	
	public void Login() {
	    	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);//setting to the center of the screen
		this.setVisible(true);
		this.setTitle("Login");
		mainPanel = new JPanel(new GridLayout(3,1));
		
		JPanel user = new JPanel();
		JLabel userLabel = new JLabel("Username: ",JLabel.CENTER);
		userField = new JTextField("",10);
		
		user.add(userLabel);
		user.add(userField);
		user.setVisible(true);
		
		JPanel password = new JPanel();
		JLabel passwrodLabel = new JLabel("Password: ",JLabel.CENTER);
		passwordField = new JPasswordField("",10);
		password.setVisible(true);
		password.add(passwrodLabel);
		password.add(passwordField);
		
		JPanel control = new JPanel();
		control.setVisible(true);
		JButton button = new JButton("Login");
		button.setActionCommand("login");
		button.addActionListener(this);
		control.add(button);
		
		mainPanel.add(user);
		mainPanel.add(password);
		mainPanel.add(control);
		this.add(mainPanel);
		this.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    	//HotelSelectorView view = new HotelSelectorView();
	    	MainMenuView view = new MainMenuView();
		String btnPressed = e.getActionCommand();
		if(btnPressed.equalsIgnoreCase("login"))
		{
		    		
				this.remove(mainPanel);
				this.setVisible(false);
				view.Menu();
				//view.HotelSelector();
				//System.exit(0);
			
		}
	}
}
