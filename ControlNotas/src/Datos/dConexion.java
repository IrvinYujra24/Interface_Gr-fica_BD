package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dConexion {
	private static final String URL = "jdbc:mysql://localhost:3306/db_estudiantes";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";
    private Connection con=null;    
    
    public Connection conectar() {
    	try {
    		con=DriverManager.getConnection(URL,USUARIO,CLAVE);
    		System.out.println("Conexión correcta");
    	}catch(SQLException e) {
    		System.out.println("Error en conexión "+e);
    	}
    	return con;
    }
    
    public void desconectar() {    	
    	try {
    		con.close();
    		System.out.println("Conexión cerrada");
    	}catch(SQLException e) {
    		System.out.println("Error al cerrar la conexión "+e);
    	}    	
    }
}
