package br.com.application.infra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import br.com.application.domain.Usuario;

import com.thoughtworks.xstream.XStream;

public class Converter {
	private Usuario usuario;
	
	public Converter(Usuario usuario){
		this.usuario = usuario;
		
	}
	public Converter(){
	}
	
	
	public Usuario convertXMLToUser() {
	
		try {
		
			XStream xStream = new XStream();
			xStream.alias("usuario", Usuario.class);
			
			String pathDiretorioAtual = new File(".").getCanonicalPath();
			File arquivoDeConfiguracao = new File(pathDiretorioAtual+"/configuracao.xml");
			
			
			Usuario usuario = (Usuario)xStream.fromXML(arquivoDeConfiguracao);
			
			return usuario;
			
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}

		
	}

	public void generateXMl() {
		
		XStream xStream = new XStream();
		xStream.alias("usuario", Usuario.class);
		String usuarioXML = xStream.toXML(this.usuario);
		try {
			
			
			
			String pathDiretorioAtual = new File(".").getCanonicalPath();
			File arquivoDeConfiguracao = new File(pathDiretorioAtual+"/configuracao.xml");
			
			FileWriter fw = new FileWriter(arquivoDeConfiguracao.getAbsolutePath());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(usuarioXML);
			bw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	

	
	
}
