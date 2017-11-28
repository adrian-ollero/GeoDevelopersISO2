package Domain;
import java.sql.*;

import javax.swing.JOptionPane;

import Persistence.DBBroker;
public class DaoSong{
	 
	 public void addSong(Song song){

	  DBBroker conex= new DBBroker();
	  try {
	   Statement estatuto = conex.getConnection();
	   estatuto.executeUpdate("INSERT INTO song VALUES ('"+song.getIdAlbum()+"', '"+song.getTitle()+"', '"+song.getSinger()+"', '"
	     +song.getPrice()+"', '"+song.getDate()+"', '"+song.getIdSong()+"', '"
	     +song.getTitle() +"', '"+song.getSingerSong()+"', '"
	     +song.getPriceSong()+"', '"+song.getDateSong()+"')");
	   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
	   estatuto.close();
	   conex.desconectar();
	    
	  } catch (SQLException e) {
	            System.out.println(e.getMessage());
	   JOptionPane.showMessageDialog(null, "No se Registro la cancion");
	  }
	 }
	 
	}

