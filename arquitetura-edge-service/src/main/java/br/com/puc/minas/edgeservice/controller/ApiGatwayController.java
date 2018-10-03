package br.com.puc.minas.edgeservice.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.puc.minas.edgeservice.client.FornecedorProxyClient;
import br.com.puc.minas.edgeservice.model.ProdutoDTO;

@RestController
public class ApiGatwayController {

	private final FornecedorProxyClient fornecedorClient;

	public ApiGatwayController(FornecedorProxyClient fornecedorClient) {
		this.fornecedorClient = fornecedorClient;
	}

	public Collection<ProdutoDTO> fallback() {
		return new ArrayList<>();
	}

	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping("/produtos")
	@CrossOrigin(origins = "*")
	public Collection<ProdutoDTO> listarProdutos() {
		return fornecedorClient.listarProdutos().getContent().stream().collect(Collectors.toList());
	}
}
