package tanques.naoh_etoh;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputEtoh;

@Component
public class ListenerEtoh {
	
	int totalEtoh = 0;
	
	@JmsListener(destination = "Tanque-EtOH", containerFactory = "")
	public void receiveMessage(OutputEtoh outputEtoh) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputEtoh.getEtoh() + " de EtOH");
		totalEtoh = totalEtoh + outputEtoh.getEtoh();
		System.out.println("Total do tanque de EtOH: " + totalEtoh);
		Thread.sleep(1000);
	}	
}