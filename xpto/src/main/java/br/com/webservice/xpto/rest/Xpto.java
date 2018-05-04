package br.com.webservice.xpto.rest;

import br.com.webservice.xpto.model.*;
import br.com.webservice.xpto.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xptoservice")
public class Xpto {

    @Autowired
    private JdbcQuery jdbcQuery;

    @Autowired
    private MaquinaRepository maquinaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private HardwareRepository hardwareRepository;

    @Autowired
    private MonitoramentoRepository monitoramentoRepository;

    @RequestMapping(value="/maquina/cadastro",
            method = RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void cadastro(@RequestBody Cadastro cadastro){

        boolean erro = false;
        Cliente cliente = null;

        try {

            cliente = clienteRepository.findByHostname(cadastro.getHostname());
        }catch (Exception e){

            System.out.println("Erro ao criar o objeto cliente");
            erro = true;
            e.printStackTrace();
        }

        Maquina maquina = null;

        if(cliente != null) {

            maquina = new Maquina(cadastro.getSerial(), cliente);
        }

        if(maquina != null && !erro) {

            try {

                maquinaRepository.save(maquina);
            } catch (Exception e){

                System.out.println("Erro ao tentar inserir o objeto maquina");
                erro = true;
                e.printStackTrace();
            }
        }

        Hardware hardware = new Hardware(cadastro.getDataFabricacao(),
                                            cadastro.getDescricaoFabricante(),
                                            cadastro.getModeloFabricante(),
                                            cadastro.getModeloEspecificoFabricante(),
                                            cadastro.getCodigoProcessador(),
                                            cadastro.getDescricaoProcessador(),
                                            cadastro.getIdentificadorProcessador(),
                                            cadastro.getQuantidadeFisicaProcessador(),
                                            cadastro.getQuantidadeLogicaProcessador(),
                                            cadastro.getEspacoTotalRam(),
                                            cadastro.getArquiteturaSistemaOperacional(),
                                            cadastro.getDescricaoSistemaOperacional(),
                                            cadastro.getUsuarioLogado(),
                                            maquina);

        if(!erro) {

            try {

                hardwareRepository.save(hardware);
                System.out.println("Cadastro realizado com sucesso.");
            } catch (Exception e) {

                System.out.println("Erro ao tentar inserir o objeto hardware");
                e.printStackTrace();
            }
        }
    }

    @RequestMapping(value="/maquina/retornaExistenciaMaquina",
            method = RequestMethod.GET,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String retornaExistenciaMaquina(@RequestParam("serial") String serial){

        String maquina = null;
        try{

            maquina = this.maquinaRepository.findBySerial(serial);
            System.out.println("Consulta de verificação da existência de maquina concluida com sucesso");
        }catch(Exception e){

            System.out.println("Erro ao obter o objeto maquina por serial");
            e.printStackTrace();
            return "erro";
        }

        return maquina != null ? "existe" : "null";
    }

    @RequestMapping(value="/maquina/retornaMonitoramento",
            method = RequestMethod.GET,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody QueryMonitoramento retornaMonitoramento(@RequestParam("serial") String serial){

        boolean erro = false;
        int id = 0;
        try{

            id = monitoramentoRepository.obtemUltimoId(serial);
        }catch (Exception e) {

            System.out.println("Erro ao obter ultimo id da tabela monitoramento");
            erro = true;
            e.printStackTrace();
        }

        QueryMonitoramento queryMonitoramento = null;
        if(!erro) {

            queryMonitoramento = this.jdbcQuery.retornaMonitoramento(id);
        }

        return queryMonitoramento;
    }
}






















