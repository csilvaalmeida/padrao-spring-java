package clodoaldo.api.padrao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class PadraoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoApplication.class, args);
	}

}
