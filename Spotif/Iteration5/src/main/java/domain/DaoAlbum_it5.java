package domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import domain.Album_it3;
import persistence.DBBroker;

/**
 * @author Pablo
 *
 */
public class DaoAlbum_it5 {
	//modify in the testing phase
	/**
	 * @param album
	 */
	public void deleteAlbum(Album_it3 album) {
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("DELETE FROM album WHERE idAlbum= " + album.getIdAlbum());
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro el album");
		  }
	}
}
