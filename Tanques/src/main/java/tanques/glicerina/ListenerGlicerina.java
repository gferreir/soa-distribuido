package tanques.glicerina;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputGlicerina;

@Component
public class ListenerGlicerina {
	
	@JmsListener(destination = "Tanque-Glicerina", containerFactory = "")
	public void receiveMessage(OutputGlicerina outputGlicerina) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputGlicerina.getGlicerina() + " de glicerina");
		Thread.sleep(1000);
	}	
}