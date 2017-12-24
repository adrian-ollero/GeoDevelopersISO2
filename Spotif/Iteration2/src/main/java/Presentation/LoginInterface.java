package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * @author Pablo
 *
 */
/**
 * @author Pablo
 *
 */
public class LoginInterface {

	/**
	 * 
	 */
	/**
	 * 
	 */
	private JFrame frame;
	/**
	 * 
	 */
	/**
	 * 
	 */
	private JTextField textField;
	/**
	 * 
	 */
	/**
	 * 
	 */
	private JTextField textField1;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_FRAME = 100;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_FRAME = 100;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_FRAME = 257;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_FRAME = 177;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_LBLLOGIN = 30;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_LBLLOGIN = 26;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_LBLLOGIN = 46;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_LBLLOGIN = 14;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_LBLPASSWORD = 10;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_LBLPASSWORD = 51;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_LBLPASSWORD = 55;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_LBLPASSWORD = 14;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_TEXTFIELD = 70;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_TEXTFIELD = 23;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_TEXTFIELD = 161;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_TEXTFIELD = 20;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_TEXTFIELD_1 = 70;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_TEXTFIELD_1 = 48;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_TEXTFIELD_1 = 161;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_TEXTFIELD_1 = 20;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_BTNLOGIN = 166;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_BTNLOGIN = 79;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_BTNLOGIN = 65;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_BTNLOGIN = 28;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_LBLFORGOT = 113;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_LBLFORGOT = 113;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_LBLFORGOT = 118;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_LBLFORGOT = 14;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int X_BTNREGISTER = 80;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int Y_BTNREGISTER  = 79;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int WIDTH_BTNREGISTER = 79;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int HEIGHT_BTNREGISTER  = 28;
	/**
	 * 
	 */
	/**
	 * 
	 */
	static final int COLUMNS  = 10;


	/**
	 * Launch the application.
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginInterface window = new LoginInterface();
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
	/**
	 * 
	 */
	/**
	 * 
	 */
	public LoginInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(X_FRAME, Y_FRAME, WIDTH_FRAME, HEIGHT_FRAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(X_LBLLOGIN, Y_LBLLOGIN, WIDTH_LBLLOGIN, HEIGHT_LBLLOGIN);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(X_LBLPASSWORD, Y_LBLPASSWORD, WIDTH_LBLPASSWORD, HEIGHT_LBLPASSWORD);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(X_TEXTFIELD, Y_TEXTFIELD, WIDTH_TEXTFIELD, HEIGHT_TEXTFIELD);
		frame.getContentPane().add(textField);
		textField.setColumns(COLUMNS);
		
		textField1 = new JTextField();
		textField1.setBounds(X_TEXTFIELD_1, Y_TEXTFIELD_1, WIDTH_TEXTFIELD_1, HEIGHT_TEXTFIELD_1);
		frame.getContentPane().add(textField1);
		textField1.setColumns(COLUMNS);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(X_BTNLOGIN, Y_BTNLOGIN, WIDTH_BTNLOGIN, HEIGHT_BTNLOGIN);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblForgotYourPassword = new JLabel("Forgot your password?");
		lblForgotYourPassword.setBounds(X_LBLFORGOT, Y_LBLFORGOT, WIDTH_LBLFORGOT, HEIGHT_LBLFORGOT);
		frame.getContentPane().add(lblForgotYourPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(X_BTNREGISTER, Y_BTNREGISTER, WIDTH_BTNREGISTER, HEIGHT_BTNREGISTER);
		frame.getContentPane().add(btnRegister);
	}
}
