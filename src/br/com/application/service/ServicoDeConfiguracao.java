package br.com.application.service;

import br.com.application.domain.Usuario;
import br.com.application.infra.Converter;


public class ServicoDeConfiguracao implements IServicoDeConfiguracao {

	
public void criaUsuarioXML(Usuario usuario){
	new Converter(usuario).generateXMl();
}

public Usuario getUsuarioXML(){
	return new Converter().convertXMLToUser();
}



}
