package br.com.webservice.xpto.repository;

import br.com.webservice.xpto.model.QueryMonitoramento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcQuery {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public QueryMonitoramento retornaMonitoramento(int id){

        try {

            QueryMonitoramento queryMonitoramento = jdbcTemplate.queryForObject("SELECT " +
                            "consumo_cpu," +
                            "percentual_ram," +
                            "percentual_hd FROM monitoramento WHERE id = ?",
                    new BeanPropertyRowMapper<QueryMonitoramento>(QueryMonitoramento.class), id);
            System.out.println("Consulta da tabela monitoramento realizada com sucesso.");
            return queryMonitoramento;
        }catch(Exception e){

            System.out.println("Erro ao encontrar monitoramento por id");
            e.printStackTrace();
            return null;
        }
    }
}
