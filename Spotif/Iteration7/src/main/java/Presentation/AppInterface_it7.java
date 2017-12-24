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
public class AppInterface_it7 {

	/**
	 * 
	 */
	private JFrame frame;
	/**
	 * 
	 */
	static final int X_FRAME = 100;
	/**
	 * 
	 */
	static final int Y_FRAME = 100;
	/**
	 * 
	 */
	static final int WIDTH_FRAME = 450;
	/**
	 * 
	 */
	static final int HEIGHT_FRAME = 300;
	/**
	 * 
	 */
	static final int X_TXT = 20;
	/**
	 * 
	 */
	static final int Y_TXT = 41;
	/**
	 * 
	 */
	static final int WIDTH_TXT = 146;
	/**
	 * 
	 */
	static final int HEIGHT_TXT = 209;
	/**
	 * 
	 */
	static final int X_LBL = 20;
	/**
	 * 
	 */
	static final int Y_LBL = 16;
	/**
	 * 
	 */
	static final int WIDTH_LBL = 46;
	/**
	 * 
	 */
	static final int HEIGHT_LBL = 14;
	/**
	 * 
	 */
	static final int Y_ADDSONG = 41;
	/**
	 * 
	 */
	static final int Y_ADDALBUM = 75;
	/**
	 * 
	 */
	static final int Y_DELETESONG = 143;
	/**
	 * 
	 */
	static final int Y_PURCHASE = 109;
	/**
	 * 
	 */
	static final int Y_SEARCHSONG = 177;
	/**
	 * 
	 */
	static final int Y_SEARCHALBUM = 211;
	/**
	 * 
	 */
	static final int X_BTN = 176;
	/**
	 * 
	 */
	static final int HEIGHT_BTN = 23;
	/**
	 * 
	 */
	static final int WIDTH_BTN = 103;

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
					AppInterface_it7 window = new AppInterface_it7();
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
	public AppInterface_it7() {
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
		txtpnTheSpectreTu.setText("The Spectre\r\nTu Foto\r\nFaded\r\nAyer\r\nBlanco y Negro");
		txtpnTheSpectreTu.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnTheSpectreTu);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddAlbum = new JButton("Add Album");
		btnAddAlbum.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnEli = new JButton("Purchase Song");
		btnEli.setBounds(X_BTN, Y_PURCHASE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnEli);
		
		JButton btnNewButton = new JButton("Eliminate Song");
		btnNewButton.setBounds(X_BTN, Y_DELETESONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Search Song");
		btnNewButton1.setBounds(X_BTN, Y_SEARCHSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Search Album");
		btnNewButton2.setBounds(X_BTN, Y_SEARCHALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton2);
	}

}
