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
public class AppAdmin_it5 {

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
	static final int WIDTH_FRAME = 386;
	/**
	 * 
	 */
	static final int HEIGHT_FRAME = 300;
	/**
	 * 
	 */
	static final int X_TXT = 24;
	/**
	 * 
	 */
	static final int Y_TXT = 51;
	/**
	 * 
	 */
	static final int WIDTH_TXT = 187;
	/**
	 * 
	 */
	static final int HEIGHT_TXT = 199;
	/**
	 * 
	 */
	static final int X_LBL = 24;
	/**
	 * 
	 */
	static final int Y_LBL = 29;
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
	static final int Y_ADDSONG = 51;
	/**
	 * 
	 */
	static final int Y_ADDALBUM = 83;
	/**
	 * 
	 */
	static final int Y_CHANGEPRICE = 117;
	/**
	 * 
	 */
	static final int Y_DELETESONG = 151;
	/**
	 * 
	 */
	static final int Y_DELETEALBUM = 185;
	/**
	 * 
	 */
	static final int X_BTN = 235;
	/**
	 * 
	 */
	static final int HEIGHT_BTN = 23;
	/**
	 * 
	 */
	static final int WIDTH_BTN = 107;

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
					AppAdmin_it5 window = new AppAdmin_it5();
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
	public AppAdmin_it5() {
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
		
		JTextPane txtpnTheSpectreAyer = new JTextPane();
		txtpnTheSpectreAyer.setText("The Spectre\r\nAyer\r\nFaded\r\nGirasoles\r\nTu Foto\r\nBlanco y Negro");
		txtpnTheSpectreAyer.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnTheSpectreAyer);
		
		JLabel lblSongs = new JLabel("Songs");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddAlbum = new JButton("Add Song");
		btnAddAlbum.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnAddAlbum1 = new JButton("Add Album");
		btnAddAlbum1.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddAlbum1);
		
		JButton btnChangePrice = new JButton("Change Price");
		btnChangePrice.setBounds(X_BTN, Y_CHANGEPRICE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnChangePrice);
		
		JButton btnEliminateSong = new JButton("Eliminate Song");
		btnEliminateSong.setBounds(X_BTN, Y_DELETESONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnEliminateSong);
		
		JButton btnNewButton = new JButton("Eliminate Album\r\n");
		btnNewButton.setBounds(X_BTN, Y_DELETEALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
	}

}
