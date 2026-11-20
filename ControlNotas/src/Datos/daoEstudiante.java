package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Logica.Estudiante;

public class daoEstudiante {
	
	public boolean insertar(Estudiante est) {
        String consulta = "insert into estudiante (nombre,apellido,ci,carrera) VALUES (?, ?, ?, ?)";        
        
        try {
            
        	dConexion con= new dConexion();
        	Connection c=con.conectar();
        	PreparedStatement ps=c.prepareStatement(consulta);
        	
        	ps.setString(1, est.getNombre());
            ps.setString(2, est.getApellido());
            ps.setString(3, est.getCi());
            ps.setString(4, est.getCarrera());
            
            // executeUpdate() devuelve el número de filas afectadas
            int filasInsertadas = ps.executeUpdate();
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }
	
	public String listarEstudiante() {
		String consulta="select nombre,apellido,carrera from estudiante e";
					
		try {
			dConexion con=new dConexion();			
			Connection c= con.conectar();
			PreparedStatement ps=c.prepareStatement(consulta);
			ResultSet resultado=ps.executeQuery();
			String salida="";
			System.out.println("Lista");
			while(resultado.next()) {				
				String nombre=resultado.getString("nombre");
				String apellido=resultado.getString("apellido");
				String carrera=resultado.getString("carrera");
				salida+= "Estudiante: "+nombre+" "+apellido+" "+carrera+"\n";
			}
			return salida;
		}catch (SQLException e) {
			System.out.println("Error al leer "+e);
			return "";
		}
	}	
	
	public String BuscarEstudiante(String p) {
		String consulta=""
				+ "select *  from estudiante e where e.apellido like '%"+p+"%' "
						+ "or e.nombre like '%"+p+"%'"
						+ "or e.carrera like '%"+p+"%'";
					
		try {
			dConexion con=new dConexion();			
			Connection c= con.conectar();
			PreparedStatement ps=c.prepareStatement(consulta);
			ResultSet resultado=ps.executeQuery();
			String salida="";
			System.out.println("Lista");
			while(resultado.next()) {				
				String nombre=resultado.getString("nombre");
				String apellido=resultado.getString("apellido");
				String carrera=resultado.getString("carrera");
				salida+= "Estudiante: "+nombre+" "+apellido+" "+carrera+"\n";
			}
			return salida;
		}catch (SQLException e) {
			System.out.println("Error al leer "+e);
			return "";
		}
	}	
}
