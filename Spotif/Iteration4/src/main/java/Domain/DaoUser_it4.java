package Domain;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Persistence.DBBroker;

/**
 * @author Pablo
 *
 */
public class DaoUser_it4 {

	/**
	 * @param user
	 */
	public void buy(User_it4 user) {
		DBBroker conex = new DBBroker();
		  try {
		   Statement estatuto = conex.getConnection();
		   estatuto.executeUpdate("INSERT INTO purchase VALUES (" + user.getUser() + "," + user.calculateTotalPrice() + ")");
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		   //Payment is realized with the PaypalWeb
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se hizo la compra");
		  }
	}
}
