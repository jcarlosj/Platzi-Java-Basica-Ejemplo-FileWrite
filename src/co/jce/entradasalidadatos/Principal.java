package co.jce.entradasalidadatos;

import java.io.FileWriter;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String nombreArchivo = "PlatziJava.txt", 
        	   rutaArchivo   = "/home/jce/Escritorio/Java/",
               datosArchivo  = "Hola a la comunidad de Platzi (Curso Básico de Java)";
	
		FileWriter archivo;
		
		try {
			archivo = new FileWriter( rutaArchivo + nombreArchivo );
			archivo .write( datosArchivo );
			archivo .close();
		} catch (Exception e) {
			// TODO: handle exception
			System .out .println( "Excepción: " + e );
		} finally {
			System .out .println( "Archivo creado exitosamente" );
		}
		

	}

}
