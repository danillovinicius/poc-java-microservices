package br.com.puc.minas.controledevendasservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class ControleDeVendasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDeVendasServiceApplication.class, args);
	}
}
