package br.com.puc.minas.propagandaspromocoesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class PropagandasPromocoesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropagandasPromocoesServiceApplication.class, args);
	}
}
