package Domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Persistence.DBBroker;

/**
 * @author Pablo
 *
 */
public class DaoAlbum {
	
	/**
	 * @param album
	 */
	public void addAlbum(Album album) {

	  DBBroker conex = new DBBroker();
	  try {
	   Statement estatuto = conex.getConnection();
	   estatuto.executeUpdate("INSERT INTO album VALUES ('" + album.getIdAlbum() + "', '" + album.getTitle() + "', '" + album.getSinger() + "', '" + album.getPrice() + "', '" + album.getDate() + "')");
	   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
	   estatuto.close();
	   conex.desconectar();
	    
	  } catch (SQLException e) {
	            System.out.println(e.getMessage());
	   JOptionPane.showMessageDialog(null, "No se Registro el album");
	  }
	 }
	 
	}

