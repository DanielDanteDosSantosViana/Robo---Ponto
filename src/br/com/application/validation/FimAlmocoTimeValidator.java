package br.com.application.validation;

public class FimAlmocoTimeValidator implements TimeValidator{

	private TimeValidator proximo;

	@Override
	public boolean valida(String horariro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setProximo(TimeValidator proximo) {
		this.proximo = proximo;
		
	}

}
