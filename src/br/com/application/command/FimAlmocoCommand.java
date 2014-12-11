package br.com.application.command;

import br.com.application.infra.AbstractCommand;
import br.com.application.infra.HorariosDePonto;

public class FimAlmocoCommand extends AbstractCommand {

	@Override
	public void run(boolean selected) {
		if(!selected){
			HorariosDePonto.desabilitaHorario("chegada");
		}
		
	}

}
