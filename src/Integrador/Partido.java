package Integrador;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Partido {
	public String[] getGoles(int i, String resPath) {
		int j = 1;
		String[] goles = new String[2];
		String[] arr = null;
		Path RutaResultado = FileSystems.getDefault().getPath(resPath);
		try {
			for(String Resul : Files.readAllLines(RutaResultado)) {
				arr = Resul.split(";");
				if(j==i) {
					goles[0] = arr[1];
					goles[1] = arr[2];
				}else {
					j++;
				}
			}
			} catch (IOException e) {
				System.out.println("no funco gordito");
			e.printStackTrace();
		}
		return goles;
	}
}
