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
public class AppAdmin_it7 extends AppAdmin_it6 {

	/**
	 * 
	 */
	private JFrame frame;
	/**
	 * 
	 */
	static final int X_BTN_2 = 320;
	/**
	 * 
	 */
	static final int Y_SEARCHSONG = 43;
	/**
	 * 
	 */
	static final int HEIGHT_SEARCHSONG = 23;
	/**
	 * 
	 */
	static final int Y_SEARCHALBUM = 74;

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
					AppAdmin_it7 window = new AppAdmin_it7();
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
	public AppAdmin_it7() {
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
		txtpnTheSpectreTu.setText("The Spectre\r\nTu Foto\r\nAyer\r\nBlanco y Negro\r\nCriminal\r\nFaded\r\n");
		txtpnTheSpectreTu.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnTheSpectreTu);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnAddAlbum = new JButton("Add Album");
		btnAddAlbum.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnChangePrice = new JButton("Change price");
		btnChangePrice.setBounds(X_BTN, Y_CHANGEPRICE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnChangePrice);
		
		JButton btnNewButton = new JButton("Eliminate Song");
		btnNewButton.setBounds(X_BTN, Y_DELETESONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Eliminate Album");
		btnNewButton1.setBounds(X_BTN, Y_DELETEALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Delete User");
		btnNewButton2.setBounds(X_BTN, Y_DELETEUSER, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnFindSong = new JButton("Search Song");
		btnFindSong.setBounds(X_BTN_2, Y_SEARCHSONG, WIDTH_BTN, HEIGHT_SEARCHSONG);
		frame.getContentPane().add(btnFindSong);
		
		JButton btnNewButton3 = new JButton("Search Album\r\n");
		btnNewButton3.setBounds(X_BTN_2, Y_SEARCHALBUM, WIDTH_BTN, HEIGHT_SEARCHSONG);
		frame.getContentPane().add(btnNewButton3);
	}

}
