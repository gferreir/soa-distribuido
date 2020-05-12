package lavagem;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputResultado;

@Component
public class ListenerLavagem {
	
	@JmsListener(destination = "Lavagem-1", containerFactory = "")
	public void receiveMessage1(OutputResultado outputResultado) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputResultado.getResultado() + " para o tanque Nº 1");
		Thread.sleep(1000);
	}	
	@JmsListener(destination = "Lavagem-2", containerFactory = "")
	public void receiveMessage2(OutputResultado outputResultado) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputResultado.getResultado() + " para o tanque Nº 2");
		Thread.sleep(1000);
	}	
	@JmsListener(destination = "Lavagem-3", containerFactory = "")
	public void receiveMessage3(OutputResultado outputResultado) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputResultado.getResultado() + " para o tanque Nº 3");
		Thread.sleep(1000);
	}	
}