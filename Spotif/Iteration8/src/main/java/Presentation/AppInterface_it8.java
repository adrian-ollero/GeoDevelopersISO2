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
public class AppInterface_it8 extends AppInterface_it7 {

	/**
	 * 
	 */
	private JFrame frame;
	/**
	 * 
	 */
	static final int Y_SEND = 89;
	/**
	 * 
	 */
	static final int X_BTN_2 = 324;
	/**
	 * 
	 */
	static final int HEIGHT_BTN_2 = 87;
	/**
	 * 
	 */
	static final int WIDTH_BTN_2 = 100;

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
					AppInterface_it8 window = new AppInterface_it8();
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
	public AppInterface_it8() {
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
		txtpnTuFotoThe.setText("Tu Foto\r\nThe Spectre\r\nBlanco y Negro\r\nAngel\r\nAyer\r\nEscapate conmigo\r\nInvincible");
		txtpnTuFotoThe.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnTuFotoThe);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnNewButton = new JButton("Add album");
		btnNewButton.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Purchase Song");
		btnNewButton1.setBounds(X_BTN, Y_PURCHASE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Eliminate Song");
		btnNewButton2.setBounds(X_BTN, Y_DELETESONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("Search Song");
		btnNewButton3.setBounds(X_BTN, Y_SEARCHSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Search Album");
		btnNewButton4.setBounds(X_BTN, Y_SEARCHALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("Send\r\n\r\nMessage");
		btnNewButton5.setBounds(X_BTN_2, Y_SEND, WIDTH_BTN_2, HEIGHT_BTN_2);
		frame.getContentPane().add(btnNewButton5);
	}

}
