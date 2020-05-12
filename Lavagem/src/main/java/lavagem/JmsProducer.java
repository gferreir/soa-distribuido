package lavagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import data.OutputLavagem;

@Component
public class JmsProducer {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	int countLavagem = 0;
	
	OutputLavagem outputlavagem = new OutputLavagem();
	
	public void sendToSecador() throws InterruptedException {
		outputlavagem.setMistura(29.97);
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Secador", outputlavagem);
			Thread.sleep(1000);
			System.out.println("Iteração output (lançado para o Secador): "+ countLavagem);
			System.out.println("Cada tanque está enviando uma quantidade de: "+ outputlavagem.getMistura());
			countLavagem++;
		}
	}
}
