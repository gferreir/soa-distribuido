package secagem;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputLavagem;

@Component
public class ListenerLavagem {
	
	@JmsListener(destination = "Secador", containerFactory = "")
	public void receiveMessage(OutputLavagem outputLavagem) throws InterruptedException {
		System.out.println("========================================================");
		double tmp = outputLavagem.getMistura() * 3;
		System.out.println("Recebendo: "+ tmp + " da lavagem");
		Thread.sleep(1000);
	}	
}