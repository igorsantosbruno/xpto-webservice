package br.com.webservice.xpto.rest;

import br.com.webservice.xpto.model.Cliente;
import br.com.webservice.xpto.model.Fabricante;
import br.com.webservice.xpto.model.Maquina;
import br.com.webservice.xpto.model.Processador;
import br.com.webservice.xpto.repository.ClienteRepository;
import br.com.webservice.xpto.repository.FabricanteRepository;
import br.com.webservice.xpto.repository.MaquinaRepository;
import br.com.webservice.xpto.repository.ProcessadorRepository;
import br.com.webservice.xpto.requestmodel.CadastroComponente;
import br.com.webservice.xpto.requestmodel.MaquinaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xptoservice")
public class RestService {

    @Autowired
    private MaquinaRepository maquinaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private FabricanteRepository fabricanteRepository;

    @Autowired
    private ProcessadorRepository processadorRepository;

    @RequestMapping(value="/maquina/cadastrarMaquina",
            method = RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void insereMaquina(@RequestBody MaquinaRequest maquinaRequest){

        Cliente cliente = clienteRepository.findByHostname(maquinaRequest.getClienteHostname());
        Maquina maquina = new Maquina(maquinaRequest.getSerial(), cliente);
        this.maquinaRepository.save(maquina);
    }

    @RequestMapping(value="/maquina/verficarExistenciaMaquina",
            method = RequestMethod.GET,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody boolean verificaMaquina(@RequestParam("serial") String serial){

        return this.maquinaRepository.findBySerial(serial) != null;
    }

    @RequestMapping(value="/maquina/cadastroInicial",
            method = RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void cadastroInicial(@RequestBody CadastroComponente cadastroComponente){

        System.out.println(cadastroComponente.getSerial());
        Maquina maquina = this.maquinaRepository.findBySerial(cadastroComponente.getSerial());

        if(maquina != null) {
            Fabricante fabricante = new Fabricante(
                    cadastroComponente.getDescricaoFabricante(),
                    cadastroComponente.getModeloFabricante(),
                    cadastroComponente.getDataDeFabricacao(),
                    cadastroComponente.getModeloEspecifico(),
                    maquina);
            Processador processador = new Processador(
                    cadastroComponente.getDescricaoCpu(),
                    cadastroComponente.getQuantidadeLogicaCpu(),
                    cadastroComponente.getQuantidadeFisicaCpu(),
                    cadastroComponente.getIdentificador(),
                    cadastroComponente.getCodigo(),
                    maquina);
            fabricanteRepository.save(fabricante);
            processadorRepository.save(processador);
        }else{

            System.out.println("teste");
        }
    }
}






















