package br.com.application.service;

import br.com.application.domain.Usuario;

public interface IServicoDeConfiguracao {

	void criaUsuarioXML(Usuario usuario);
	Usuario getUsuarioXML();
}
