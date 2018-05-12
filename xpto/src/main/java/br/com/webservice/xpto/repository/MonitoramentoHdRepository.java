package br.com.webservice.xpto.repository;

import br.com.webservice.xpto.model.Monitoramento;
import br.com.webservice.xpto.model.MonitoramentoHd;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by igorsantos on 11/05/18.
 */
public interface MonitoramentoHdRepository extends CrudRepository<MonitoramentoHd,Long> {

    List<MonitoramentoHd> findByMonitoramento(Monitoramento monitoramento);
}
