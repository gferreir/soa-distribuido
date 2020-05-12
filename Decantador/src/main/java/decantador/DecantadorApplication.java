package decantador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DecantadorApplication implements CommandLineRunner{

	@Autowired
	JmsProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(DecantadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				try {
					producer.sendToLavagem();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					producer.sendToTanqueGlicerina();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				try {
					producer.sendToTanqueEtoh();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t3.start();
	}

}
