package co.com.fcecep.prestamo.prestamoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "co.com.fcecep.prestamo.prestamoservice")
public class PrestamoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrestamoServiceApplication.class, args);
	}
}
