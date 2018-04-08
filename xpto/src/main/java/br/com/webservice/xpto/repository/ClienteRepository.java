package br.com.webservice.xpto.repository;

import br.com.webservice.xpto.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

    Cliente findByHostname(String hostname);
}
