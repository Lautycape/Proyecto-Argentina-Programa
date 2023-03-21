package Principal;

import Integrador.Pronostico;
import Integrador.Partido;

import java.util.Scanner;
public class Principal {
												
	
	//Empieza el programa desde acá
	
	public static void main(String[] args) {
		int Puntaje;
		String resPath, pronPath;
		Scanner scanf = new Scanner(System.in);						//obtiene los path de  los archivos necesarios
		System.out.println("De la ruta de los resultados");
		resPath = scanf.nextLine();
		System.out.println("De la ruta del pronostico");
		pronPath = scanf.nextLine();
		Pronostico pron = new Pronostico();
		Puntaje = pron.getPuntos(pronPath, resPath);				//envia lo paths a la clase que los necesita
		System.out.println(Puntaje);
	}
}