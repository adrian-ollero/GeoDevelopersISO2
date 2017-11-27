package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
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
		frame.setBounds(100, 100, 295, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddSong = new JButton("Add Song");
		btnAddSong.setBounds(180, 32, 89, 23);
		frame.getContentPane().add(btnAddSong);
		
		JEditorPane dtrpnBlancoYNegro = new JEditorPane();
		dtrpnBlancoYNegro.setText("Blanco y Negro\r\nCriminal\r\nThe Spectre\r\nBonita\r\nNunca me olvides\r\nTu foto");
		dtrpnBlancoYNegro.setBounds(23, 32, 137, 192);
		frame.getContentPane().add(dtrpnBlancoYNegro);
		
		JLabel lblSong = new JLabel("Songs");
		lblSong.setBounds(23, 11, 64, 14);
		frame.getContentPane().add(lblSong);
	}
}
