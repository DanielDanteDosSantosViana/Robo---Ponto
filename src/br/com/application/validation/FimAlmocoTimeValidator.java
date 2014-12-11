package br.com.application.validation;

import br.com.application.infra.HorariosDePonto;

public class FimAlmocoTimeValidator implements TimeValidator{

	private TimeValidator proximo;
	private final static String  KEY_HORARIO = "almoco";
	
	@Override
	public boolean valida(String horario) {
		
		if(HorariosDePonto.pegaHorario(KEY_HORARIO).getRandomDateInicio().equals(horario) &&
				HorariosDePonto.pegaHorario(KEY_HORARIO).isHabilitado()){
		
			return true;

		}else{
			
			return proximo.valida(horario);
		}
	}

	@Override
	public void setProximo(TimeValidator proximo) {
		this.proximo = proximo;
		
	}

}
