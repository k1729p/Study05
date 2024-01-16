package kp.sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The SpringBoot application for the sender.
 * 
 */
@SpringBootApplication
public class Application {

	/**
	 * The constructor.
	 */
	public Application() {
		super();
	}

	/**
	 * The entry point for the application.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}