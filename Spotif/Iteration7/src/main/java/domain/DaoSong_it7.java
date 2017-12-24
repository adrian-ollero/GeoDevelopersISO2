package domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import domain.Song;
import persistence.DBBroker;

/**
 * @author Pablo
 *
 */
public class DaoSong_it7 {
	/**
	 * @param title
	 * @return
	 */
	public Song searchSongTitle(String title) {
		Song song = null;
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("SELECT * FROM song WHERE title= " + title);
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se encontró la canción");
		  }
		  return song;
	}
	
	/**
	 * @param singer
	 * @return
	 */
	public Song searchSongSinger(String singer) {
		Song song = null;
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("SELECT * FROM song WHERE singer= " + singer);
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se encontró el cantante");
		  }
		  return song;
	}
}
