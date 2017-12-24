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
public class AppAdmin_it6 extends AppAdmin_it5 {

	/**
	 * 
	 */
	private JFrame frame;
	/**
	 * 
	 */
	static final int Y_DELETEUSER = 204;

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
					AppAdmin_it6 window = new AppAdmin_it6();
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
	public AppAdmin_it6() {
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
		
		JTextPane txtpnTheSpectreFaded = new JTextPane();
		txtpnTheSpectreFaded.setText("The Spectre\r\nFaded\r\nTu Foto\r\nGirasoles\r\nBlanco y Negro\r\nAyer");
		txtpnTheSpectreFaded.setBounds(X_TXT, Y_TXT, WIDTH_TXT, HEIGHT_TXT);
		frame.getContentPane().add(txtpnTheSpectreFaded);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(X_LBL, Y_LBL, WIDTH_LBL, HEIGHT_LBL);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(X_BTN, Y_ADDSONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnAddAlbum = new JButton("Add Album");
		btnAddAlbum.setBounds(X_BTN, Y_ADDALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnNewButton = new JButton("Change Price");
		btnNewButton.setBounds(X_BTN, Y_CHANGEPRICE, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEliminateSongs = new JButton("Eliminate Song");
		btnEliminateSongs.setBounds(X_BTN, Y_DELETESONG, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnEliminateSongs);
		
		JButton btnNewButton1 = new JButton("Eliminate Album");
		btnNewButton1.setBounds(X_BTN, Y_DELETEALBUM, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Delete User");
		btnNewButton2.setBounds(X_BTN, Y_DELETEUSER, WIDTH_BTN, HEIGHT_BTN);
		frame.getContentPane().add(btnNewButton2);
	}

}
