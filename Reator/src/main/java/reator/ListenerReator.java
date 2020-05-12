package reator;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.Output;

@Component
public class ListenerReator {
	
	@JmsListener(destination = "Reator", containerFactory = "")
	public void receiveMessage(Output output) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ output.getQtdOleo() + ", "+ output.getNaoh() +" e "+ output.getEtoh());
		Thread.sleep(1000);
	}	
}