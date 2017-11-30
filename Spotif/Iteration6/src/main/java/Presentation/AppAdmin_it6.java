package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppAdmin_it6 extends AppAdmin_it5{

	private JFrame frame;

	/**
	 * Launch the application.
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
	public AppAdmin_it6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTheSpectreFaded = new JTextPane();
		txtpnTheSpectreFaded.setText("The Spectre\r\nFaded\r\nTu Foto\r\nGirasoles\r\nBlanco y Negro\r\nAyer");
		txtpnTheSpectreFaded.setBounds(10, 33, 202, 217);
		frame.getContentPane().add(txtpnTheSpectreFaded);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(10, 8, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(236, 33, 115, 23);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnAddAlbum = new JButton("Add Album");
		btnAddAlbum.setBounds(236, 67, 115, 23);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnNewButton = new JButton("Change Price");
		btnNewButton.setBounds(236, 104, 115, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEliminateSongs = new JButton("Eliminate Song");
		btnEliminateSongs.setBounds(236, 138, 115, 23);
		frame.getContentPane().add(btnEliminateSongs);
		
		JButton btnNewButton_1 = new JButton("Eliminate Album");
		btnNewButton_1.setBounds(236, 171, 115, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete User");
		btnNewButton_2.setBounds(236, 204, 115, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
