package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Logica.Materia;
import Logica.Nota;

public class daoNota {
	
	public List<Nota> obtenerNota(String p){
        List<Nota> lista = new ArrayList<>();
        String consulta = "select * from nota";
        
        try {
        	dConexion con=new dConexion();			
			Connection c= con.conectar();
			PreparedStatement ps=c.prepareStatement(consulta);
			ResultSet resultado=ps.executeQuery();
			
			while(resultado.next()) {				
				Nota not=new Nota();			
				//Creamos el objeto materia
				not.setParcial1(resultado.getInt("parcial1"));
				not.setParcial2(resultado.getInt("parcial2"));
				not.setParcial3(resultado.getInt("parcial3"));
				not.setExamenFinal(resultado.getInt("examenfinal"));
				not.setNotaFinal(resultado.getInt("notafinal"));				
				
				//Agregamos el objeto a la lista
				lista.add(not);
			}
			return lista;
        }catch(SQLException ex) {
        	System.out.println("Error al leer "+ex);
			return null;
        }        
    }
}
