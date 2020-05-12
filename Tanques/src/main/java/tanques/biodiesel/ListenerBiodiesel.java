package tanques.biodiesel;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputSecagem;

@Component
public class ListenerBiodiesel {
	
	@JmsListener(destination = "Tanque-biodiesel", containerFactory = "")
	public void receiveMessage(OutputSecagem outputSecagem) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputSecagem.getMistura());
		Thread.sleep(1000);
	}	
}