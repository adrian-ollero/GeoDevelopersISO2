package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppAdmin_it8 extends AppAdmin_it7{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppAdmin_it8 window = new AppAdmin_it8();
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
	public AppAdmin_it8() {
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
		
		JTextPane txtpnTuFotoThe = new JTextPane();
		txtpnTuFotoThe.setText("Tu Foto\r\nThe Spectre\r\nFaded\r\nBlanco y Negro\r\nAyer\r\nAngel\r\nUna Lady como tú");
		txtpnTuFotoThe.setBounds(10, 44, 165, 206);
		frame.getContentPane().add(txtpnTuFotoThe);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(10, 19, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(185, 48, 107, 23);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnNewButton = new JButton("Add Album");
		btnNewButton.setBounds(185, 82, 107, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Change Price");
		btnNewButton_1.setBounds(185, 117, 107, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminate Song");
		btnNewButton_2.setBounds(185, 151, 107, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminate Album");
		btnNewButton_3.setBounds(185, 185, 107, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete User");
		btnNewButton_4.setBounds(185, 219, 107, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Search Song");
		btnNewButton_5.setBounds(302, 48, 107, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Search Album");
		btnNewButton_6.setBounds(302, 82, 107, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Send Message");
		btnNewButton_7.setBounds(302, 151, 107, 57);
		frame.getContentPane().add(btnNewButton_7);
	}

}
