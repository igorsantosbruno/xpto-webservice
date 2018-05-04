package br.com.webservice.xpto.repository;

import br.com.webservice.xpto.model.Maquina;
import br.com.webservice.xpto.model.Monitoramento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MonitoramentoRepository extends CrudRepository<Monitoramento,Integer> {

    @Query("SELECT MAX(m.id) FROM monitoramento m WHERE m.maquina.serial = :maquina_serial")
    int obtemUltimoId(@Param("maquina_serial") String maquinaSerial);

    Monitoramento findById(int id);
}
