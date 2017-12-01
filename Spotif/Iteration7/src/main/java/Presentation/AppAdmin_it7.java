package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppAdmin_it7 extends AppAdmin_it6 {

	private JFrame frame;

	/**
	 * Launch the application.
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
	public AppAdmin_it7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTheSpectreTu = new JTextPane();
		txtpnTheSpectreTu.setText("The Spectre\r\nTu Foto\r\nAyer\r\nBlanco y Negro\r\nCriminal\r\nFaded\r\n");
		txtpnTheSpectreTu.setBounds(10, 43, 171, 207);
		frame.getContentPane().add(txtpnTheSpectreTu);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(10, 18, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(192, 43, 108, 23);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnAddAlbum = new JButton("Add Album");
		btnAddAlbum.setBounds(191, 74, 109, 23);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnChangePrice = new JButton("Change price");
		btnChangePrice.setBounds(191, 108, 109, 23);
		frame.getContentPane().add(btnChangePrice);
		
		JButton btnNewButton = new JButton("Eliminate Song");
		btnNewButton.setBounds(191, 139, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminate Album");
		btnNewButton_1.setBounds(191, 173, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete User");
		btnNewButton_2.setBounds(191, 207, 109, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnFindSong = new JButton("Search Song");
		btnFindSong.setBounds(320, 43, 102, 23);
		frame.getContentPane().add(btnFindSong);
		
		JButton btnNewButton_3 = new JButton("Search Album\r\n");
		btnNewButton_3.setBounds(320, 74, 102, 23);
		frame.getContentPane().add(btnNewButton_3);
	}

}
