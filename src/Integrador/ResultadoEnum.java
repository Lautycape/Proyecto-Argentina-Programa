package Integrador;

public class ResultadoEnum {

	public int getResultadoEnum(int i, String resPath){
		String[] goles = new String[2];
		Partido partido = new Partido();
		goles = partido.getGoles(i, resPath);
		int ResultadoEnum = 0;
		if(Integer.valueOf(goles[0])>Integer.valueOf(goles[1])) {
			ResultadoEnum = 1;
		}
		if(Integer.valueOf(goles[0])<Integer.valueOf(goles[1])) {
			ResultadoEnum = 2;
		}
		if(Integer.valueOf(goles[0])==Integer.valueOf(goles[1])) {
			ResultadoEnum = 0;
		}
		return ResultadoEnum;

	}
	}
