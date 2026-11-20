package Logica;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import Datos.daoMateria;
import Datos.daoNota;

public class Nota {
	private int parcial1;
	private int parcial2;
	private int parcial3;
	private int examenFinal;
	private int notaFinal;
	private Estudiante universitario;
	private Materia asignatura;
	public Nota(int parcial1, int parcial2, int parcial3, int examenFinal, int notaFinal, Estudiante universitario,
			Materia asignatura) {		
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.parcial3 = parcial3;
		this.examenFinal = examenFinal;
		this.notaFinal = notaFinal;
		this.universitario = universitario;
		this.asignatura = asignatura;
	}
	public Nota() {		
	}
	public int getParcial1() {
		return parcial1;
	}
	public void setParcial1(int parcial1) {
		this.parcial1 = parcial1;
	}
	public int getParcial2() {
		return parcial2;
	}
	public void setParcial2(int parcial2) {
		this.parcial2 = parcial2;
	}
	public int getParcial3() {
		return parcial3;
	}
	public void setParcial3(int parcial3) {
		this.parcial3 = parcial3;
	}
	public int getExamenFinal() {
		return examenFinal;
	}
	public void setExamenFinal(int examenFinal) {
		this.examenFinal = examenFinal;
	}
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	public Estudiante getUniversitario() {
		return universitario;
	}
	public void setUniversitario(Estudiante universitario) {
		this.universitario = universitario;
	}
	public Materia getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Materia asignatura) {
		this.asignatura = asignatura;
	}
	@Override
	public String toString() {
		return "Nota [parcial1=" + parcial1 + ", parcial2=" + parcial2 + ", parcial3=" + parcial3 + ", examenFinal="
				+ examenFinal + ", notaFinal=" + notaFinal + ", universitario=" + universitario + ", asignatura="
				+ asignatura + "]";
	}
	
	public DefaultTableModel obtenerNota(String p){
        String[] columnas = {"Parcial 1", "Parcial 2", "Parcial 3", "Examen Final", "Nota Final"};
        daoNota mat =new daoNota();
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        List<Nota> notas = mat.obtenerNota(p);

        for (Nota nota : notas) {
        	Object[] fila = {
        			nota.getParcial1(),
        			nota.getParcial2(),
        			nota.getParcial3(),
        			nota.getExamenFinal(),
        			nota.getNotaFinal(),
        	};
        	modelo.addRow(fila);

        }
        return modelo;
    }
}
