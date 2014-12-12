package br.com.application.command;

import br.com.application.infra.AbstractCommand;
import br.com.application.infra.HorariosDePonto;

public class SaidaCommand extends AbstractCommand {

	@Override
	public void run(boolean selected) {
		if(selected){
			HorariosDePonto.habilitaHorario("Saida");
			System.out.print(HorariosDePonto.pegaHorario("Saida").isHabilitado());

		}else{
			HorariosDePonto.desabilitaHorario("Saida");
			System.out.print(HorariosDePonto.pegaHorario("Saida").isHabilitado());
			
		}
	}

}
