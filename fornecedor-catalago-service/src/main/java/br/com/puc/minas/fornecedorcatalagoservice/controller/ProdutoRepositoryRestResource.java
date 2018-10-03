package br.com.puc.minas.fornecedorcatalagoservice.controller;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.puc.minas.fornecedorcatalagoservice.model.Produto;

@RepositoryRestResource(collectionResourceRel = "produto", path = "produto")
public interface ProdutoRepositoryRestResource extends PagingAndSortingRepository<Produto, Long> {

	// https://github.com/kbastani/spring-cloud-microservice-example
	// https://spring.io/guides/gs/accessing-data-rest/
	List<Produto> findByNome(@Param("nome") String nome);
	
	List<Produto> findAll();
	
/*	@Transactional
    @Modifying
    @Query("insert into RevisaoAnualIndicador (revisaoAnual, indicador, loginAtualizacao, dataAtualizacao) select :revisaoAnual, i, :usuario, "
        + ":dataAtualizacao from Indicador i where i.situacaoIndicador = :situacao ")
    void incluirIndicadoresAtivos(
            @Param("revisaoAnual") RevisaoAnual revisaoAnual,
            @Param("usuario") String usuario,
            @Param("dataAtualizacao") LocalDateTime dataAtualizacao,
            @Param("situacao") SituacaoIndicadorEnum situacao
        );
*/
	
}
