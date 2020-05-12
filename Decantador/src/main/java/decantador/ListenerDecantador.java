package decantador;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.Mistura;

@Component
public class ListenerDecantador {
	
	@JmsListener(destination = "Decantador", containerFactory = "")
	public void receiveMessage(Mistura mistura) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ mistura.getMistura());
		System.out.println("Tempo de decantação: 5 sec");
		Thread.sleep(5000);
	}	
}