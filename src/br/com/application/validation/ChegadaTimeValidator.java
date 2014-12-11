package br.com.application.validation;

import br.com.application.infra.HorariosDePonto;

public class ChegadaTimeValidator implements TimeValidator{

	private TimeValidator proximo;
	private final static String  KEY_HORARIO = "almoco";
	private HorariosDePonto horarios;
	
	@Override
	public boolean valida(String horario) {
		
		if(horarios.pegaHorario(KEY_HORARIO).getRandomDateInicio().equals(horario)){
			return false;
		
		}else{
			
			return proximo.valida(horario);
		}
	}

	@Override
	public void setProximo(TimeValidator proximo) {
		this.proximo = proximo;
		
	}

}
