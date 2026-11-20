package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Logica.Materia;

public class daoMateria {
	public boolean insertar(Materia mat) {
        String consulta = "insert into materia (nombre,codigo,creditos,semestre) VALUES (?, ?, ?, ?)";        
        
        try {
            
        	dConexion con= new dConexion();
        	Connection c=con.conectar();
        	PreparedStatement ps=c.prepareStatement(consulta);
        	
        	ps.setString(1, mat.getNombre());
            ps.setString(2, mat.getCodigo());
            ps.setInt(3, mat.getCreditos());
            ps.setInt(4, mat.getSemestre());
            
            // executeUpdate() devuelve el número de filas afectadas
            int filasInsertadas = ps.executeUpdate();
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }
	
	public String listarMateria() {
		String consulta="select nombre,codigo,creditos,semestre from materia m";
					
		try {
			dConexion con=new dConexion();			
			Connection c= con.conectar();
			PreparedStatement ps=c.prepareStatement(consulta);
			ResultSet resultado=ps.executeQuery();
			String salida="";
			System.out.println("Lista");
			while(resultado.next()) {				
				String nombre=resultado.getString("nombre");
				String codigo=resultado.getString("codigo");
				int creditos=resultado.getInt("creditos");
				int semestre=resultado.getInt("semestre");
				salida+= "Materia: "+nombre+" "+codigo+" "+creditos+" "+semestre+"\n";
			}
			return salida;
		}catch (SQLException e) {
			System.out.println("Error al leer "+e);
			return "";
		}
	}	
	
	public String BuscarMateria(String p) {
		String consulta=""
				+ "select *  from materia m where m.nombre like '%"+p+"%' "
						+ "or m.codigo like '%"+p+"%'"
						+ "or m.semestre like '%"+p+"%'";
					
		try {
			dConexion con=new dConexion();			
			Connection c= con.conectar();
			PreparedStatement ps=c.prepareStatement(consulta);
			ResultSet resultado=ps.executeQuery();
			String salida="";
			System.out.println("Lista");
			while(resultado.next()) {				
				String nombre=resultado.getString("nombre");
				String codigo=resultado.getString("codigo");
				int creditos=resultado.getInt("creditos");
				int semestre=resultado.getInt("semestre");
				salida+= "Materia: "+nombre+" "+codigo+" "+creditos+" "+semestre+"\n";
			}
			return salida;
		}catch (SQLException e) {
			System.out.println("Error al leer "+e);
			return "";
		}
	}
	
	
	public List<Materia> obtenerMateria(String p){
        List<Materia> lista = new ArrayList<>();
        String consulta = "select * from materia";
        
        try {
        	dConexion con=new dConexion();			
			Connection c= con.conectar();
			PreparedStatement ps=c.prepareStatement(consulta);
			ResultSet resultado=ps.executeQuery();
			
			while(resultado.next()) {				
				Materia mat=new Materia();				
				mat.setNombre(resultado.getString("nombre"));
				mat.setCodigo(resultado.getString("codigo"));
				mat.setCreditos(resultado.getInt("creditos"));
				mat.setSemestre(resultado.getInt("semestre"));
				lista.add(mat);
			}
			return lista;
        }catch(SQLException ex) {
        	System.out.println("Error al leer "+ex);
			return null;
        }        
    }
}

