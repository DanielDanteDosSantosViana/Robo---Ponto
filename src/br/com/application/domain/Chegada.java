package br.com.application.domain;

import java.text.DateFormat;

public class Chegada implements Horario{

 private DateFormat horarioPerfeito;

public DateFormat getHorarioPerfeito() {
	return horarioPerfeito;
}

public void setHorarioPerfeito(DateFormat horarioPerfeito) {
	this.horarioPerfeito = horarioPerfeito;
}

@Override
public String getRandomDateInicio() {
	// TODO Auto-generated method stub
	return "";
}

@Override
public String getRandomDateFim() {
	// TODO Auto-generated method stub
	return "";
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

@Override
public boolean isHabilitado() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void setHabilitado(boolean habilitado) {

}
}
