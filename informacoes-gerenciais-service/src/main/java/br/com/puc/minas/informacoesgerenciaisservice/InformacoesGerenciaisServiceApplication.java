package br.com.puc.minas.informacoesgerenciaisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class InformacoesGerenciaisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InformacoesGerenciaisServiceApplication.class, args);
	}
}
