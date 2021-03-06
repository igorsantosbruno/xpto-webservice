package br.com.webservice.xpto.repository;

import br.com.webservice.xpto.model.Maquina;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MaquinaRepository extends CrudRepository<Maquina,Integer>{

    @Query("SELECT m.serial FROM Maquina m WHERE m.serial = :serial")
    String findBySerial(@Param("serial") String serial);

    @Query("SELECT m FROM Maquina m WHERE m.serial = :serial")
    Maquina consultaPorSerial(@Param("serial") String serial);
}
