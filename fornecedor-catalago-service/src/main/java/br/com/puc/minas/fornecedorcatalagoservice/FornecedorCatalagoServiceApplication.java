package br.com.puc.minas.fornecedorcatalagoservice;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

import br.com.puc.minas.fornecedorcatalagoservice.controller.ProdutoRepositoryRestResource;
import br.com.puc.minas.fornecedorcatalagoservice.model.Produto;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class FornecedorCatalagoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FornecedorCatalagoServiceApplication.class, args);
	}
}

@Component
class FornecedorCatalagoServiceInitializer implements CommandLineRunner {

	private final ProdutoRepositoryRestResource repository;

	FornecedorCatalagoServiceInitializer(ProdutoRepositoryRestResource repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of(
				new Produto("Gêneros de alimentação", "Açucar de 1 kg", "Unid"),
				new Produto("Gêneros de alimentação", "Adoçante de 100 ml", "Unid"),
				new Produto("Gêneros de alimentação", "Água mineral sem gás (500 ml)", "fardos"),
				new Produto("Gêneros de alimentação", "Café (cx de 500g)", "Unid"),
				new Produto("Material de acondicionamento e embalagem", "Barbante de 5/9 a 4/8 (200g)", "Rolo"),
				new Produto("Material de acondicionamento e embalagem", "Pasta para notebook de 14”", "Unid"))
				.forEach(produto -> repository.save(produto));

		repository.findAll().forEach(System.out::println);
	}
}