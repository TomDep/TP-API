package fr.ensim.tp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		// Set the proxy
		System.setProperty("http.proxyHost", "proxy.univ-lemans.fr");
        System.setProperty("http.proxyPort", "3128");
        System.setProperty("https.proxyHost", "proxy.univ-lemans.fr");
        System.setProperty("https.proxyPort", "3128");
		
		SpringApplication.run(Application.class, args);
	}

}
