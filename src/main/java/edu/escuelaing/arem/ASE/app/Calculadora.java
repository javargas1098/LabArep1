package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Javier Vargas
 * 
 *         Calculadora de medias y desviaciones estandar
 *
 */

public class Calculadora {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("datahours.txt");
		BufferedReader br = new BufferedReader(fr);
		int size = 0;
		String valor;
		linkedList datos = new linkedList();
		while ((valor = br.readLine()) != null) {
			size++;
			datos.insert(Double.parseDouble(valor));
		}
		System.out.println(media(datos, size));
		System.out.println(desviacion(datos, size));
		br.close();
	}

	/**
	 * Este metodo Calcula la desviacion estandar a un conjunto de datos
	 * 
	 * @param LinkedList<float> Son los datos con los que podra calculará la
	 *                          desviación estandar
	 * 
	 * @return float 
	 * Desviación estandar
	 * 
	 */

	private static Double desviacion(linkedList datos, int size) {
		// TODO Auto-generated method stub
		double resultado;
		double media = media(datos, size);
		resultado = datos.sum(datos, media);
		return Math.sqrt(resultado / (size - 1));
	}

	/**
	 * Este metodo Calcula la media a un conjunto de datos
	 * 
	 * @param LinkedList<Float> Son los datos con los que se podra calcular la media
	 * 
	 * @return float 
	 * Media
	 * 
	 */

	private static double media(linkedList datos, int size) {
		// TODO Auto-generated method stub
		Double resultado;
		resultado = datos.sum(datos);
		return resultado / size;

	}
}
