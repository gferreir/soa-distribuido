package tanques.glicerina;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputGlicerina;

@Component
public class ListenerGlicerina {
	
	int totalGlicerina = 0;
	
	@JmsListener(destination = "Tanque-Glicerina", containerFactory = "")
	public void receiveMessage(OutputGlicerina outputGlicerina) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputGlicerina.getGlicerina() + " de glicerina");
		totalGlicerina = totalGlicerina + outputGlicerina.getGlicerina();
		System.out.println("Total no tanque de Glicerina: " + totalGlicerina);
		Thread.sleep(1000);
	}	
}