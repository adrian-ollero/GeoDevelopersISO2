package domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import domain.User;
import persistence.DBBroker;

/**
 * @author Pablo
 *
 */
public class DaoUser_it6 {
	/**
	 * @param user
	 */
	public void deleteUser(User user) {
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("DELETE FROM user WHERE user= " + user.getUser());
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se eliminó el usuario");
		  }
	}
}
