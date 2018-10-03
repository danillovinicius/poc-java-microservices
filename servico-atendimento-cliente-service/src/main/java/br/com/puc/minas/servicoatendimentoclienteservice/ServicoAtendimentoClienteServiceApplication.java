package br.com.puc.minas.servicoatendimentoclienteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class ServicoAtendimentoClienteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoAtendimentoClienteServiceApplication.class, args);
	}
}
