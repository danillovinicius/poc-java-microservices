package br.com.puc.minas.fornecedorcatalagoservice.controller;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.puc.minas.fornecedorcatalagoservice.model.Produto;

@RepositoryRestResource(collectionResourceRel = "produto", path = "produto")
public interface ProdutoRepositoryRestResource extends PagingAndSortingRepository<Produto, Long> {

	List<Produto> findByNome(@Param("nome") String nome);
	
	List<Produto> findAll();

}
