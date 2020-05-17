package reator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import data.Mistura;

@Component
public class JmsProducer {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	int countMistura = 0;
	
	Mistura mistura = new Mistura();
	
	public void sendToDecantador() throws InterruptedException {
		mistura.setMistura(50);
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Decantador", mistura);
			System.out.println("Iteração output (lançado para o Decantador): "+ countMistura);
			System.out.println("Quandidade de Mistura enviado: "+ mistura.getMistura());
			countMistura++;
			Thread.sleep(1000);
		}
	}
}
