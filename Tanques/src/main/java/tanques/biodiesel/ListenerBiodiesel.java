package tanques.biodiesel;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import data.OutputSecagem;

@Component
public class ListenerBiodiesel {
	
	double totalBioDiesel = 0;
	
	@JmsListener(destination = "Tanque-biodiesel", containerFactory = "")
	public void receiveMessage(OutputSecagem outputSecagem) throws InterruptedException {
		System.out.println("========================================================");
		System.out.println("Recebendo: "+ outputSecagem.getMistura());
		totalBioDiesel = totalBioDiesel + outputSecagem.getMistura();
		System.out.println("Total no tanque BioDiesel: " + totalBioDiesel);
		Thread.sleep(1000);
	}	
}