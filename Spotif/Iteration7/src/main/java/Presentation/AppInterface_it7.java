package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppInterface_it7 {

	private JFrame frame;

	/**
	 * Launch the application.
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
	public AppInterface_it7() {
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
		txtpnTheSpectreTu.setText("The Spectre\r\nTu Foto\r\nFaded\r\nAyer\r\nBlanco y Negro");
		txtpnTheSpectreTu.setBounds(20, 41, 146, 209);
		frame.getContentPane().add(txtpnTheSpectreTu);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(20, 16, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddAlbum = new JButton("Add Album");
		btnAddAlbum.setBounds(176, 41, 103, 23);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(176, 75, 103, 23);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnEli = new JButton("Purchase Song");
		btnEli.setBounds(176, 109, 103, 23);
		frame.getContentPane().add(btnEli);
		
		JButton btnNewButton = new JButton("Eliminate Song");
		btnNewButton.setBounds(176, 143, 103, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search Song");
		btnNewButton_1.setBounds(176, 177, 103, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search Album");
		btnNewButton_2.setBounds(176, 211, 103, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
