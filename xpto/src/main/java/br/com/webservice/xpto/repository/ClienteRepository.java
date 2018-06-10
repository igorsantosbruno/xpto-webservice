package br.com.webservice.xpto.repository;

import br.com.webservice.xpto.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

    Cliente findByHostname(String hostname);

    @Query("SELECT c.canal FROM cliente c WHERE c.hostname = :hostname")
    String findCanalByHostname(@Param("hostname") String hostname);
}
