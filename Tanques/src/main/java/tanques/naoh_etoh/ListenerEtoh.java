package tanques.naoh_etoh;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputEtoh;

@Component
public class ListenerEtoh {
	
	@JmsListener(destination = "Decantador", containerFactory = "")
	public void receiveMessage(OutputEtoh outputEtoh) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputEtoh.getEtoh() + " de EtOH");
		Thread.sleep(1000);
	}	
}