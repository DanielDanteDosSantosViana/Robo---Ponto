package br.com.application.domain;

public interface Horario {
	 String getRandomDateInicio();
	 String getRandomDateFim();
	 String getInicio();
	 String getFim();
	 boolean isHabilitado();
	 void setHabilitado(boolean habilitado);
}
