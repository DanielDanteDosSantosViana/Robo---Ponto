package br.com.application.command;

import br.com.application.infra.AbstractCommand;
import br.com.application.infra.HorariosDePonto;

public class InicioAlmocoCommand extends AbstractCommand {

	@Override
	public void run(boolean selected) {
		if(selected){
			HorariosDePonto.habilitaHorario("almoco");
			System.out.print(HorariosDePonto.pegaHorario("almoco").isHabilitado());

		}else{
			HorariosDePonto.desabilitaHorario("almoco");
			System.out.print(HorariosDePonto.pegaHorario("almoco").isHabilitado());
			
		}
	}

}
