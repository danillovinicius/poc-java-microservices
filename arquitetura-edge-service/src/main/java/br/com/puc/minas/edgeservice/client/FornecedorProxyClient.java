package br.com.puc.minas.edgeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.puc.minas.edgeservice.model.ProdutoDTO;

@FeignClient("fornecedor-catalago-service")
public interface FornecedorProxyClient {

	@GetMapping("/produto")
	Resources<ProdutoDTO> listarProdutos();
	
}
