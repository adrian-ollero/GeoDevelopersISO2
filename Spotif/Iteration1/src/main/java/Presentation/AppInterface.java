package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;

/**
 * @author Pablo
 *
 */
public class AppInterface {

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
	static final int WIDTH_FRAME = 320;
	/**
	 * 
	 */
	static final int HEIGHT_FRAME = 281;
	/**
	 * 
	 */
	static final int X_TXT = 24;
	/**
	 * 
	 */
	static final int Y_TXT = 34;
	/**
	 * 
	 */
	static final int WIDTH_TXT = 150;
	/**
	 * 
	 */
	static final int HEIGHT_TXT = 197;
	/**
	 * 
	 */
	static final int X_LBL = 24;
	/**
	 * 
	 */
	static final int Y_LBL = 9;
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
	static final int Y_ADDSONG = 34;
	/**
	 * 
	 */
	static final int Y_ADDALBUM = 68;
	/**
	 * 
	 */
	static final int X_BTN = 204;
	/**
	 * 
	 */
	static final int WIDTH_BTN = 89;
	/**
	 * 
	 */
	static final int HEIGHT_BTN = 23;

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
					AppInterface window = new AppInterface();
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
	public AppInterface() {
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
		
		JButton btnAddSong = new JButton("Add song");
		btnAddSong.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddSong);
		
		JTextPane txtpnBlancoYNegro = new JTextPane();
		txtpnBlancoYNegro.setText("Blanco y negro\r\nThe Spectre\r\nGirasoles\r\nFaded\r\nTu Foto\r\nEsencial");
		txtpnBlancoYNegro.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnBlancoYNegro);
		
		JLabel lblSongs = new JLabel("Songs");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddAlbum = new JButton("Add album");
		btnAddAlbum.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddAlbum);
	}
}
