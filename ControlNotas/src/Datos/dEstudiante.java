package Datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Logica.Estudiante;

public class dEstudiante {
	public void Crear() {
		try {
			File myObj = new File("estudiantes.txt"); 
			if (myObj.createNewFile()) {           
				System.out.println("Creado: " + myObj.getName());
			} else {
				System.out.println("Archivo existente.");
			}
		} catch (IOException e) {
			System.out.println("Error.");
			e.printStackTrace(); 
		}
	}
	
	public void escribir(Estudiante e) {
		try (FileWriter myWriter = new FileWriter("estudiantes.txt", true)) {
			myWriter.write("\nNuevo Estudiante\n");
			myWriter.write(e.toString());
			System.out.println("...");
		} catch (IOException ex) {
			System.out.println("Error.");
			ex.printStackTrace();
		}
	}
	
	public String leer() {
		File myObj = new File("estudiantes.txt");

		try (Scanner myReader = new Scanner(myObj)) {
			String data="";
			while (myReader.hasNextLine()) {
				data += myReader.nextLine()+"\n";				
			}
			return data;
		} catch (FileNotFoundException e) {
			System.out.println("Error.");
			e.printStackTrace();
			return "";
		}
	}
}
