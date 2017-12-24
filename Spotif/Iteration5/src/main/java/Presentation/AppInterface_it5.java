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
public class AppInterface_it5 {

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
	static final int WIDTH_FRAME = 395;
	/**
	 * 
	 */
	static final int HEIGHT_FRAME = 300;
	/**
	 * 
	 */
	static final int X_TXT = 29;
	/**
	 * 
	 */
	static final int Y_TXT = 48;
	/**
	 * 
	 */
	static final int WIDTH_TXT = 182;
	/**
	 * 
	 */
	static final int HEIGHT_TXT = 187;
	/**
	 * 
	 */
	static final int X_LBL = 29;
	/**
	 * 
	 */
	static final int Y_LBL = 25;
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
	static final int Y_ADDSONG = 48;
	/**
	 * 
	 */
	static final int Y_ADDALBUM = 82;
	/**
	 * 
	 */
	static final int Y_PURCHASE = 116;
	/**
	 * 
	 */
	static final int Y_NEWBUTTON = 150;
	/**
	 * 
	 */
	static final int X_BTN = 241;
	/**
	 * 
	 */
	static final int HEIGHT_BTN = 43;
	/**
	 * 
	 */
	static final int WIDTH_BTN = 109;

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
					AppInterface_it5 window = new AppInterface_it5();
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
	public AppInterface_it5() {
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
		txtpnTheSpectreTu.setText("The Spectre\r\nTu Foto\r\nAngel\r\nGirasoles\r\nBlanco y Negro");
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
		
		JButton btnPurchaseSongs = new JButton("Purchase Songs");
		btnPurchaseSongs.setBounds(X_BTN, Y_PURCHASE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnPurchaseSongs);
		
		JButton btnNewButton = new JButton("Eliminate Song\r\n");
		btnNewButton.setBounds(X_BTN, Y_NEWBUTTON, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
	}
}
