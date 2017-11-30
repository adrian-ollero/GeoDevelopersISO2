package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppInterface_it4 extends AppInterface_it3{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppInterface_it4 window = new AppInterface_it4();
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
	public AppInterface_it4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 358, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTheSpectreTu = new JTextPane();
		txtpnTheSpectreTu.setText("The spectre\r\nTu foto\r\nFaded\r\nNunca me olvides\r\nHigher");
		txtpnTheSpectreTu.setBounds(20, 37, 179, 213);
		frame.getContentPane().add(txtpnTheSpectreTu);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(20, 12, 46, 14);
		frame.getContentPane().add(lblSongs);
		
		JButton btnNewButton = new JButton("Add Song");
		btnNewButton.setBounds(209, 37, 123, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Album");
		btnNewButton_1.setBounds(209, 79, 123, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Purchase Songs");
		btnNewButton_2.setBounds(209, 123, 123, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
