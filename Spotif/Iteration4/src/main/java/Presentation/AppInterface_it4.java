package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * @author Pablo
 *
 */
public class AppInterface_it4 extends AppInterface_it3 {

	/**
	 * 
	 */
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppInterface_it4 window = new AppInterface_it4();
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
	public AppInterface_it4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(X_FRAME, Y_FRAME, WIDTH_FRAME, HEIGHT_FRAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTheSpectreTu = new JTextPane();
		txtpnTheSpectreTu.setText("The spectre\r\nTu foto\r\nFaded\r\nNunca me olvides\r\nHigher");
		txtpnTheSpectreTu.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnTheSpectreTu);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnNewButton = new JButton("Add Song");
		btnNewButton.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Add Album");
		btnNewButton1.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Purchase Songs");
		btnNewButton2.setBounds(X_BTN, Y_CHANGEPRICE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton2);
	}
}
