package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppInterface_it3 extends AppInterface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppInterface_it3 window = new AppInterface_it3();
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
	public AppInterface_it3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 368, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnBlancoYNegro = new JTextPane();
		txtpnBlancoYNegro.setText("Blanco y negro\r\nThe spectre\r\nTu foto\r\nFaded");
		txtpnBlancoYNegro.setBounds(35, 42, 177, 187);
		frame.getContentPane().add(txtpnBlancoYNegro);
		
		JLabel lblSongs = new JLabel("Songs");
		lblSongs.setBounds(35, 17, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add song");
		btnAddSong.setBounds(240, 42, 102, 23);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnAddAlbum = new JButton("Add album");
		btnAddAlbum.setBounds(240, 76, 102, 23);
		frame.getContentPane().add(btnAddAlbum);
		
		JButton btnChangePrice = new JButton("Change price");
		btnChangePrice.setBounds(240, 110, 102, 23);
		frame.getContentPane().add(btnChangePrice);
	}

}
