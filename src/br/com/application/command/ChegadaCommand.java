package br.com.application.command;

import br.com.application.infra.AbstractCommand;
import br.com.application.infra.HorariosDePonto;

public class ChegadaCommand extends AbstractCommand{

	@Override
	public void run(boolean selected) {
		if(selected){
			HorariosDePonto.habilitaHorario("Chegada");
			System.out.print(HorariosDePonto.pegaHorario("Chegada").isHabilitado());

		}else{
			HorariosDePonto.desabilitaHorario("Chegada");
			System.out.print(HorariosDePonto.pegaHorario("Chegada").isHabilitado());
			
		}
	}

}
