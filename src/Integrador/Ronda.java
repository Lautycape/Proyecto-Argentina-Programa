package Integrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ronda {
	int nroRonda;
	Ronda a = new Ronda();
	int n=a.cantidadDePartidos();
	int[] partido = new int[n];
	
	
	private int cantidadDePartidos() {
		int n = 0;
		String[] arr = null;
		String RutaPronostico = "recursos/pronostico.csv";
		try {
			for(String Pronos : Files.readAllLines(Paths.get(RutaPronostico))) {
				n = n+1;
			}
			this.n = n;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}
	
}
