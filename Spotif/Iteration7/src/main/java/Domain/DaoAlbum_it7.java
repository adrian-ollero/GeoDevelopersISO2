package Domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Domain.Album;
import Persistence.DBBroker;

/**
 * @author Pablo
 *
 */
public class DaoAlbum_it7 {
	/**
	 * @param title
	 * @return
	 */
	public Album searchAlbumTitle(String title) {
		Album album = null;
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("SELECT * FROM album WHERE title= " + title);
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se encontró la canción");
		  }
		  return album;
	}
	
	/**
	 * @param singer
	 * @return
	 */
	public Album searchAlbumSinger(String singer) {
		Album album = null;
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("SELECT * FROM album WHERE title= " + singer);
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se encontró el cantante");
		  }
		  return album;
	}

}
