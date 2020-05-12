package tanques;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import data.Output;
import tanques.naoh_etoh.Reagentes;
import tanques.oleo.Oleo;

@Component
public class JmsProducer {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	int countOleo = 0;
	int countReagentes = 0;
	int countOutput = 0;
	
	int rand = (int) ((Math.random()*((200-100)+1))+100);
	Oleo oleo = new Oleo(rand);
	Reagentes reagentes = new Reagentes(0.45, 1);
	Output output = new Output();
	
	public void sendOleo() throws InterruptedException {
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Tanque-Oleo", oleo);
			System.out.println("Iteração óleo: "+ countOleo);
			System.out.println("Quantidade de óleo enviado: "+ rand);
			Thread.sleep(5000);
			countOleo++;
		}
	}
	public void sendReagentes() throws InterruptedException {
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("NaOH+EtOH", reagentes);
			Thread.sleep(1000);
			System.out.println("Iteração NaOh+EtOh: "+ countReagentes);
			System.out.println("Quandidade de NaOH enviado: "+ reagentes.getNaoh());
			System.out.println("Quantidade de EtOH enviado: "+ reagentes.getEtoh());
			countReagentes++;
		}
	}
	public void sendToReator() throws InterruptedException {
		output.setQtdOleo(47.6);
		output.setNaoh(0.47);
		output.setEtoh(1.9);
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Reator", output);
			Thread.sleep(1000);
			System.out.println("Iteração output (lançado para o Reator): "+ countOutput);
			System.out.println("Quandidade de Óleo enviado: "+ output.getQtdOleo());
			System.out.println("Quandidade de NaOH enviado: "+ output.getNaoh());
			System.out.println("Quantidade de EtOH enviado: "+ output.getEtoh());
			countOutput++;
		}
	}
}
