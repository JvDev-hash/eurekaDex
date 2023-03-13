package poke.dex.eurekaDex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDexApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDexApplication.class, args);
	}

}
