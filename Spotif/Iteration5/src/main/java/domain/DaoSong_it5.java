package domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import domain.Song_it3;
import persistence.DBBroker;

/**
 * @author Pablo
 *
 */
public class DaoSong_it5 {
	//modify in the testing phase
	/**
	 * @param song
	 */
	public void deleteSong(Song_it3 song) {
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("DELETE FROM song WHERE idSong= " + song.getIdSong());
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se eliminó la canción");
		  }
	}
}
