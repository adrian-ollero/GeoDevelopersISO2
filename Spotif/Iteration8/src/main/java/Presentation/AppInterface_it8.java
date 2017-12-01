package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppInterface_it8 extends AppInterface_it7{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppInterface_it8 window = new AppInterface_it8();
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
	public AppInterface_it8() {
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
		txtpnTuFotoThe.setText("Tu Foto\r\nThe Spectre\r\nBlanco y Negro\r\nAngel\r\nAyer\r\nEscapate conmigo\r\nInvincible");
		txtpnTuFotoThe.setBounds(10, 46, 177, 204);
		frame.getContentPane().add(txtpnTuFotoThe);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(10, 23, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(197, 46, 109, 23);
		frame.getContentPane().add(btnAddSong);
		
		JButton btnNewButton = new JButton("Add album");
		btnNewButton.setBounds(197, 80, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Purchase Song");
		btnNewButton_1.setBounds(197, 112, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminate Song");
		btnNewButton_2.setBounds(197, 145, 109, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search Song");
		btnNewButton_3.setBounds(197, 179, 109, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Search Album");
		btnNewButton_4.setBounds(197, 211, 109, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Send\r\n\r\nMessage");
		btnNewButton_5.setBounds(324, 89, 100, 87);
		frame.getContentPane().add(btnNewButton_5);
	}

}
