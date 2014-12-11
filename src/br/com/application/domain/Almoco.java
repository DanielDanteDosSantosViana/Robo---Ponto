package br.com.application.domain;

import java.util.Random;

public class Almoco implements Horario{
	
	/*HORARIO PERFEITO DE ALMOCO*/
	private String horarioInicioPerfeito;
	private String horarioFimPerfeito;
	private boolean habilitado;
	
	public Almoco(){
		this.horarioInicioPerfeito = getRandomDateInicio();
		this.horarioFimPerfeito = getRandomDateInicio();
		this.setHabilitado(true);
	}
	
	public String getRandomDateInicio() {
		
		Random gerador = new Random();
		int numero = gerador.nextInt(10);
        this.horarioInicioPerfeito = "12:0"+numero;
		return  this.horarioInicioPerfeito;
	}
	
	public String getRandomDateFim() {
		
		Random gerador = new Random();
		int numero = gerador.nextInt(10);
		this.horarioFimPerfeito="13:0"+numero;
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

	public boolean isHabilitado() {
		return habilitado;
	}


	@Override
	public void setHabilitado(boolean habilitado) {
		// TODO Auto-generated method stub
		
	}

	


}
