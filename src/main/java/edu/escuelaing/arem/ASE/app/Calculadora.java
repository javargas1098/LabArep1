package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import javax.print.attribute.standard.Media;

/**
 * @author Javier Vargas
 * 
 *         Calculadora de medias y desviaciones estandar
 *
 */

public class Calculadora {
//    public static void main( String[] args ) throws IOException
//    {
//    	FileReader fr = new FileReader ("data.txt");
//    	BufferedReader br = new BufferedReader(fr);
//    	String valor;
//    	linkedList datos = new linkedList();
//    	while ((valor = br.readLine())!=null) {
//       	   datos.insert(Double.parseDouble(valor));
//       	}
//    	Media(datos);
//    	desviacion(datos);
//    }
//
//	private static void desviacion(linkedList datos) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void Media(linkedList datos) {
//		// TODO Auto-generated method stub
//		double resultado = 0;
//		int datasize = datos.size(); 
//		
//	}
	public static void main(String[] args) throws IOException {
		linkedList lk = new linkedList();
		lk.insert((double) 5);
		lk.insert((double)10);
		System.out.println(lk.toString());
	}
}
