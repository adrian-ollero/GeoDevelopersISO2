package Domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Persistence.DBBroker;

public class DaoUser_it6 {
	public void deleteAlbum(User user) {
		DBBroker conex= new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("DELETE FROM user WHERE user= "+user.getUser());
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro el album");
		  }
	}
}
