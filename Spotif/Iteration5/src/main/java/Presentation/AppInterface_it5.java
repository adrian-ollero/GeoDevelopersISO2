package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppInterface_it5 {

	private JFrame frame;

	/**
	 * Launch the application.
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
	public AppInterface_it5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 395, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTheSpectreTu = new JTextPane();
		txtpnTheSpectreTu.setText("The Spectre\r\nTu Foto\r\nAngel\r\nGirasoles\r\nBlanco y Negro");
		txtpnTheSpectreTu.setBounds(29, 48, 182, 187);
		frame.getContentPane().add(txtpnTheSpectreTu);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(29, 25, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(241, 48, 109, 23);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnAddAlbum = new JButton("Add Album");
		btnAddAlbum.setBounds(241, 82, 109, 23);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnPurchaseSongs = new JButton("Purchase Songs");
		btnPurchaseSongs.setBounds(241, 116, 109, 23);
		frame.getContentPane().add(btnPurchaseSongs);
		
		JButton btnNewButton = new JButton("Eliminate Song\r\n");
		btnNewButton.setBounds(241, 150, 109, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
