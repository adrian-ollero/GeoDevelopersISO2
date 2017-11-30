package Persistence;

import java.sql.*;
import java.util.*;

public class DBBroker_it2 {
    protected static DBBroker_it2 mInstancia=null;
    protected static Connection mBD;
    private static String url=""; 
    private static String driver="com.mysql.jdbc.Driver";
    
    private DBBroker_it2()throws Exception {
    	conectar();
    		
    }
    
    public static DBBroker_it2 getAgente() throws Exception{
          if (mInstancia==null){
          mInstancia=new DBBroker_it2();
        }
        return mInstancia;
     }
 
    private void conectar() throws Exception {
         Class.forName(driver);
         mBD=DriverManager.getConnection(url);
    }

    
    public void desconectar() throws Exception{
    	mBD.close();
    }

    public int insert(String SQL) throws SQLException, Exception{ 
     	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    public int delete(String SQL) throws SQLException,Exception{
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    public int update(String SQL) throws SQLException,Exception{
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    
    public Vector<Object> select(String SQL) throws SQLException,Exception{

    	conectar();
    	PreparedStatement stmt=mBD.prepareStatement(SQL);
    	ResultSet res=stmt.executeQuery();

    	Vector <Object> lista = new Vector <Object>();

    	while(res.next()){

    		Vector<Object> usuario=new Vector <Object>();
    		usuario.add(res.getString("Author"));				//columnastabla
    		usuario.add(res.getString("Name"));					
    		lista.add(usuario);

    	} return lista;
    }
}
