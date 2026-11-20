package Logica;

import java.sql.SQLException;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Datos.daoEstudiante;
import Datos.daoMateria;

public class Materia {
	private String nombre;
	private String codigo;
	private int creditos;
	private int semestre;
	public Materia(String nombre, String codigo, int creditos, int semestre) {		
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
		this.semestre = semestre;
	}
	public Materia() {		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", creditos=" + creditos + ", semestre=" + semestre
				+ "]";
	}
	
	public String buscar(String p) {		
		daoMateria mat=new daoMateria();
		String r=mat.BuscarMateria(p);		
		return r;
	}
	
	public void insertar() {
		daoMateria mat=new daoMateria();
		boolean r=mat.insertar(this);
		System.out.println(r);
	}
	
	public DefaultTableModel obtenerMateria(String p){
        String[] columnas = {"Materia", "Codigo", "Créditos", "Semestre"};
        daoMateria mat =new daoMateria();
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        List<Materia> materias = mat.obtenerMateria(p);

        for (Materia asignatura : materias) {
        	Object[] fila = {
        			asignatura.getNombre(),
        			asignatura.getCodigo(),
        			asignatura.getCreditos(),
        			asignatura.getSemestre(),
        	};
        	modelo.addRow(fila);

        }
        return modelo;
    }	
}
