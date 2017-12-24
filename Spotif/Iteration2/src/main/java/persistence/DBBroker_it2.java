package persistence;

import java.sql.*;
import java.util.*;

/**
 * @author Pablo
 *
 */
public class DBBroker_it2 {

    /**
     * 
     */
    protected static DBBroker_it2 mInstancia = null;
    /**
     * 
     */
    protected static Connection mBD;
    /**
     * 
     */
    private static String url = ""; 
    /**
     * 
     */
    private static String driver = "com.mysql.jdbc.Driver";

    /**
     * @throws Exception
     */
    private DBBroker_it2()throws Exception {
    	conectar();	
    }
    
    /**
     * @return
     * @throws Exception
     */
    public static DBBroker_it2 getAgente() throws Exception {
          if (mInstancia == null) {
          mInstancia = new DBBroker_it2();
        }
        return mInstancia;
     }

    /**
     * @throws Exception
     */
    private void conectar() throws Exception {
         Class.forName(driver);
         mBD = DriverManager.getConnection(url);
    }

    /**
     * @throws Exception
     */
    public void desconectar() throws Exception {
    	mBD.close();
    }

    /**
     * @param sql
     * @return
     * @throws SQLException
     * @throws Exception
     */
    public int insert(String sql) throws SQLException, Exception { 
     	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(sql);
    	int res = stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    /**
     * @param sql
     * @return
     * @throws SQLException
     * @throws Exception
     */
    public int delete(String sql) throws SQLException, Exception {
    	PreparedStatement stmt = mBD.prepareStatement(sql);
    	int res = stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    /**
     * @param sql
     * @return
     * @throws SQLException
     * @throws Exception
     */
    public int update(String sql) throws SQLException, Exception {
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(sql);
    	int res = stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    /**
     * @param sql
     * @return
     * @throws SQLException
     * @throws Exception
     */
    public Vector<Object> select(String sql) throws SQLException, Exception {

    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(sql);
    	ResultSet res = stmt.executeQuery();

    	Vector<Object> lista = new Vector<Object>();

    	while (res.next()) {

    		Vector<Object> usuario = new Vector<Object>();
    		usuario.add(res.getString("Author"));				//columnastabla
    		usuario.add(res.getString("Name"));					
    		lista.add(usuario);

    	} return lista;
    }
}
