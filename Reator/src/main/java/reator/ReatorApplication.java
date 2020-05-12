package reator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ReatorApplication implements CommandLineRunner{
	
	@Autowired
	JmsProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(ReatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				try {
					producer.sendToDecantador();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
	}
}
