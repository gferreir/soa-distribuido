package secagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import data.OutputSecagem;

@Component
public class JmsProducer {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	int countSecagem = 0;
	
	OutputSecagem outputSecagem = new OutputSecagem();
	
	public void sendToBiodiesel() throws InterruptedException {
		outputSecagem.setMistura(89.01);
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Tanque-biodiesel", outputSecagem);
			Thread.sleep(3000);
			System.out.println("Iteração output (lançado para o Tanque de BioDiesel): "+ countSecagem);
			System.out.println("Cada tanque está enviando uma quantidade de: "+ outputSecagem.getMistura());
			countSecagem++;
		}
	}
}
