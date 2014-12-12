package br.com.application.validation;

import br.com.application.infra.HorariosDePonto;

public class SaidaTimeValidator implements TimeValidator {

	private TimeValidator proximo;
	private final static String  KEY_HORARIO = "saida";

	@Override
	public boolean valida(String horario) {
		
		if(HorariosDePonto.pegaHorario(KEY_HORARIO).getHorarioInicio().equals(horario) &&
				HorariosDePonto.pegaHorario(KEY_HORARIO).isHabilitado()){
		
			return true;
		
		}else{
			if(proximo!=null){
				return proximo.valida(horario);
			}
			return false;
		}
	}

	@Override
	public void setProximo(TimeValidator proximo) {
		this.proximo = proximo;
		
	}
}
