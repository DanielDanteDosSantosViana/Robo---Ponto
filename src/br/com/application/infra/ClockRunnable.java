package br.com.application.infra;

import java.awt.EventQueue;
import java.util.Date;

import br.com.application.service.ServicoSelenium;
import br.com.application.validation.HorarioValido;
import br.com.application.view.MainViewApplication;

public class ClockRunnable implements Runnable {  
   
	private MainViewApplication view;
	private ServicoSelenium servicoSelenium;
	
	public ClockRunnable(){
		
	}
	public ClockRunnable(MainViewApplication view){
		this.servicoSelenium = new ServicoSelenium();
		this.view = view;
		
	}
	
	public void run() {  
        try {  
            while (true) {  
                EventQueue.invokeLater(new Runnable() {  
                    public void run() {  
                        view.setHora(new Date()); 
                       
                        if(new HorarioValido().isHorarioValido(view.getLblHora().getText())){
                        	servicoSelenium.executaServicoSeleium();
                        }
                    }  
                });  
                
                Thread.sleep(1000);  
            }  
        }  
        catch (InterruptedException e) {  
        }  
    }  
}  
