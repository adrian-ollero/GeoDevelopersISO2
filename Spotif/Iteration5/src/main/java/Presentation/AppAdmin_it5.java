package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppAdmin_it5 {

	private JFrame frame;

	/**
	 * Launch the application.
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
	public AppAdmin_it5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTheSpectreAyer = new JTextPane();
		txtpnTheSpectreAyer.setText("The Spectre\r\nAyer\r\nFaded\r\nGirasoles\r\nTu Foto\r\nBlanco y Negro");
		txtpnTheSpectreAyer.setBounds(24, 51, 187, 199);
		frame.getContentPane().add(txtpnTheSpectreAyer);
		
		JLabel lblSongs = new JLabel("Songs");
		lblSongs.setBounds(24, 29, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddAlbum = new JButton("Add Song");
		btnAddAlbum.setBounds(235, 51, 107, 23);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnAddAlbum_1 = new JButton("Add Album");
		btnAddAlbum_1.setBounds(235, 83, 107, 23);
		frame.getContentPane().add(btnAddAlbum_1);
		
		JButton btnChangePrice = new JButton("Change Price");
		btnChangePrice.setBounds(235, 117, 107, 23);
		frame.getContentPane().add(btnChangePrice);
		
		JButton btnEliminateSong = new JButton("Eliminate Song");
		btnEliminateSong.setBounds(235, 151, 107, 23);
		frame.getContentPane().add(btnEliminateSong);
		
		JButton btnNewButton = new JButton("Eliminate Album\r\n");
		btnNewButton.setBounds(235, 185, 107, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
