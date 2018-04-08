package br.com.webservice.xpto.rest;

import br.com.webservice.xpto.model.Maquina;
import br.com.webservice.xpto.repository.MaquinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xptoservice")
public class RestService {

    @Autowired
    private MaquinaRepository maquinaRepository;

    @RequestMapping(value="/maquina/cadastrarMaquina",
            method = RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void insereMaquina(@RequestBody Maquina maquina){

        this.maquinaRepository.save(maquina);
    }

    @RequestMapping(value="/maquina/verficarExistenciaMaquina",
            method = RequestMethod.GET,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody boolean verificaMaquina(@RequestParam("serial") String serial){

        return maquinaRepository.findBySerial(serial) == null;
    }

}
