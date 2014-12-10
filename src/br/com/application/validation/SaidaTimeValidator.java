package br.com.application.validation;

public class SaidaTimeValidator implements TimeValidator {

	private TimeValidator proximo;

	@Override
	public boolean valida(String horariro) {
		
		return false;
	}

	@Override
	public void setProximo(TimeValidator proximo) {
		this.proximo = proximo;
		
	}
}
