package br.com.webservice.xpto.repository;

import br.com.webservice.xpto.model.XptoEmpresa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface XptoEmpresaRepository extends CrudRepository<XptoEmpresa, Long>{

    List<XptoEmpresa> findByHostname(String hostname);
}
