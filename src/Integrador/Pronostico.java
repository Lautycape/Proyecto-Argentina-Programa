package Integrador;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pronostico {
	public int getPuntos(String pronPath, String resPath) {
	int puntos = 0, aux1, aux2 = 5, i = 0;
	String[] arr = null;
	Path RutaPronostico = FileSystems.getDefault().getPath(pronPath);
	try {
		for(String Pronos : Files.readAllLines(RutaPronostico)) {
			i++;
			arr = Pronos.split(";");
			ResultadoEnum resultado = new ResultadoEnum();
			aux1 = resultado.getResultadoEnum(i, resPath);
			if(arr[1].equals("x")) {
				aux2=1;
			}else {
				if(arr[3].equals("x")) {
					aux2=2;
				}else {
					if(arr[2].equals("x")) {
						aux2=0;
					}
				}
			}
			if(aux1==aux2) {
				puntos++;
			}
		}
	} catch (IOException e) {
		System.out.println("no funco gordito");
		e.printStackTrace();
	}
	return puntos;
}
	}

