package br.com.application.infra;

import java.util.HashMap;

import br.com.application.domain.Almoco;
import br.com.application.domain.Horario;


public class HorariosDePonto {

	private static HashMap<String,Horario> horarios = 
			new HashMap<String, Horario>();


	static{
		horarios.put("almoco", new Almoco());
		horarios.put("saida", new Almoco());
		horarios.put("chegada", new Almoco());
		
	}
	
public Horario pegaHorario(String keyHorario){
	
	return horarios.get(keyHorario);
}


}
