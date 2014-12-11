package br.com.application.domain;

import java.util.Random;

public class Almoco implements Horario{
	
	/*HORARIO PERFEITO DE ALMOCO*/
	private String horarioInicioPerfeito = "12:30";
	private String horarioFimPerfeito = "13:30";

	
	public Almoco(){
		this.horarioInicioPerfeito = getRandomDateInicio();
		this.horarioFimPerfeito = getRandomDateInicio();
	}
	
	public String getRandomDateInicio() {
		
		Random gerador = new Random();
		int numero = gerador.nextInt(30);
        this.horarioInicioPerfeito = "12:"+numero;
		return  this.horarioInicioPerfeito;
	}
	
	public String getRandomDateFim() {
		
		Random gerador = new Random();
		int numero = gerador.nextInt(30);
		this.horarioFimPerfeito="13:"+numero;
		return this.horarioFimPerfeito;
	}

	public String getHorarioInicioPerfeito() {
		return horarioInicioPerfeito;
	}


	public String getHorarioFimPerfeito() {
		return horarioFimPerfeito;
	}

	@Override
	public String getInicio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFim() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
