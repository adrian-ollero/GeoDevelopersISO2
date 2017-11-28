package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class AppInterface {

	private JFrame frame;

	/**
	 * Launch the application.
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
	public AppInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 281);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddSong = new JButton("Add song");
		btnAddSong.setBounds(204, 34, 89, 23);
		frame.getContentPane().add(btnAddSong);
		
		JTextPane txtpnBlancoYNegro = new JTextPane();
		txtpnBlancoYNegro.setText("Blanco y negro\r\nThe Spectre\r\nGirasoles\r\nFaded\r\nTu Foto\r\nEsencial");
		txtpnBlancoYNegro.setBounds(24, 34, 150, 197);
		frame.getContentPane().add(txtpnBlancoYNegro);
		
		JLabel lblSongs = new JLabel("Songs");
		lblSongs.setBounds(24, 9, 46, 14);
		frame.getContentPane().add(lblSongs);
	}
}
