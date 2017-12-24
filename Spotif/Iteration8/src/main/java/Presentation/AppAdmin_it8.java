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
public class AppAdmin_it8 extends AppAdmin_it7 {

	/**
	 * 
	 */
	private JFrame frame;
	/**
	 * 
	 */
	static final int Y_SEND_MESSAGE = 151;
	/**
	 * 
	 */
	static final int HEIGHT_BTN_2 = 57;

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
					AppAdmin_it8 window = new AppAdmin_it8();
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
	public AppAdmin_it8() {
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
		
		JTextPane txtpnTuFotoThe = new JTextPane();
		txtpnTuFotoThe.setText("Tu Foto\r\nThe Spectre\r\nFaded\r\nBlanco y Negro\r\nAyer\r\nAngel\r\nUna Lady como tú");
		txtpnTuFotoThe.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnTuFotoThe);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnNewButton = new JButton("Add Album");
		btnNewButton.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Change Price");
		btnNewButton1.setBounds(X_BTN, Y_CHANGEPRICE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Eliminate Song");
		btnNewButton2.setBounds(X_BTN, Y_DELETESONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("Eliminate Album");
		btnNewButton3.setBounds(X_BTN, Y_DELETEALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Delete User");
		btnNewButton4.setBounds(X_BTN, Y_DELETEUSER, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("Search Song");
		btnNewButton5.setBounds(X_BTN_2, Y_SEARCHSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("Search Album");
		btnNewButton6.setBounds(X_BTN_2, Y_SEARCHALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton6);
		
		JButton btnNewButton7 = new JButton("Send Message");
		btnNewButton7.setBounds(X_BTN_2, Y_SEND_MESSAGE, WIDTH_BTN, HEIGHT_BTN_2);
		frame.getContentPane().add(btnNewButton7);
	}

}
