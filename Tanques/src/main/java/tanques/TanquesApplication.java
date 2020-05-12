package tanques;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class TanquesApplication implements CommandLineRunner{
	
	@Autowired
	JmsProducer producer;
	
	public static void main(String[] args){
		SpringApplication.run(TanquesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				try {
					producer.sendOleo();
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
					producer.sendReagentes();
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
					producer.sendToReator();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t3.start();
	}
}