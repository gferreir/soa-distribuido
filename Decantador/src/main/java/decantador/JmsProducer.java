package decantador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import data.OutputEtoh;
import data.OutputGlicerina;
import data.OutputResultado;

@Component
public class JmsProducer {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	int countLavagem = 0;
	int countGlicerina = 0;
	int countEtoh = 0;
	
	OutputGlicerina outputGlicerina = new OutputGlicerina();
	OutputEtoh outputEtoh = new OutputEtoh();
	OutputResultado outputResultado = new OutputResultado();
	
	public void sendToLavagem() throws InterruptedException {
		outputResultado.setResultado(30);
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Lavagem-1", outputResultado);
			jmsTemplate.convertAndSend("Lavagem-2", outputResultado);
			jmsTemplate.convertAndSend("Lavagem-3", outputResultado);
			Thread.sleep(1000);
			System.out.println("Iteração output (lançado para a Lavagem): "+ countLavagem);
			System.out.println("Quandidade enviado para cada tanque de lavagem: "+ outputResultado.getResultado());
			countLavagem++;
		}
	}
	public void sendToTanqueGlicerina() throws InterruptedException {
		outputGlicerina.setGliceria(2);
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Tanque-Glicerina", outputGlicerina);
			Thread.sleep(1000);
			System.out.println("Iteração output (lançado para o Tanque de Glicerina): "+ countGlicerina);
			System.out.println("Quandidade enviado: "+ outputGlicerina.getGlicerina());
			countGlicerina++;
		}
	}
	public void sendToTanqueEtoh() throws InterruptedException {
		outputEtoh.setEtoh(8);
		while(true) {
			System.out.println("========================================================");
			jmsTemplate.convertAndSend("Tanque-EtOH", outputEtoh);
			Thread.sleep(1000);
			System.out.println("Iteração output (lançado para o Tanque de EtOH): "+ countEtoh);
			System.out.println("Quandidade enviado: "+ outputEtoh.getEtoh());
			countEtoh++;
		}
	}
}
