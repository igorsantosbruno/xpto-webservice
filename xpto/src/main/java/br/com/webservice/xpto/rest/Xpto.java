package br.com.webservice.xpto.rest;

import br.com.webservice.xpto.model.Cliente;
import br.com.webservice.xpto.model.Hardware;
import br.com.webservice.xpto.model.Maquina;
import br.com.webservice.xpto.model.RequestCadastro;
import br.com.webservice.xpto.repository.ClienteRepository;
import br.com.webservice.xpto.repository.HardwareRepository;
import br.com.webservice.xpto.repository.MaquinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xptoservice")
public class Xpto {

    @Autowired
    private MaquinaRepository maquinaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private HardwareRepository hardwareRepository;

    @RequestMapping(value="/maquina/cadastro",
            method = RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void cadastro(@RequestBody RequestCadastro cadastro){

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
    public @ResponseBody boolean retornaExistenciaMaquina(@RequestParam("serial") String serial){

        return this.maquinaRepository.findBySerial(serial) != null;
    }
}






















